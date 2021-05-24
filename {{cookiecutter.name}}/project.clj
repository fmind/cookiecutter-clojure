(defproject {{cookiecutter.name}} "0.1.0-SNAPSHOT"
  :description "TODO: write a description"
  :url "{{cookiecutter.repository}}"
  :scm {:name "GIT" :url "{{cookiecutter.repository}}"}
  :license {:name "{{cookiecutter.license}}" :url "https://opensource.org/licenses/{{cookiecutter.license}}"}
  :test-paths ["test"]
  :source-paths ["src"]
  :resource-paths ["res"]
  :main ^:skip-aot {{cookiecutter.name}}.core
  :plugins [[lein-codox "0.10.7"]
            [lein-cljfmt "0.7.0"]
            [lein-binplus "0.6.6"]
            [lein-ancient "0.7.0"]
            [lein-githooks "0.1.0"]
            [lein-cloverage "1.2.2"]
            [jonase/eastwood "0.4.3"]]
  :profiles {:dev {:githooks
                   {:pre-commit
                    ["lein test"
                     "lein check"
                     "lein eastwood"
                     "lein cljfmt fix"
                     "lein cloverage"
                     "lein codox"
                     "lein bin"]}}
             :uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "{{cookiecutter.clojure}}"]])
