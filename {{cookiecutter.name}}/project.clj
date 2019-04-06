(defproject {{cookiecutter.name}} "0.1.0-SNAPSHOT"
  :description "TODO: write a description"

  :url "https://{{cookiecutter.control}}/{{cookiecutter.user}}/{{cookiecutter.name}}"
  :scm {:name "GIT" :url "https://{{cookiecutter.control}}/{{cookiecutter.user}}/{{cookiecutter.name}}"}
  :license {:name "{{cookiecutter.license}}" :url "https://opensource.org/licenses/{{cookiecutter.license}}"}
 
  :test-paths ["test"]
  :source-paths ["src"]
  :resource-paths ["res"]
 
  :plugins [[lein-codox "0.10.5"]
            [lein-cljfmt "0.6.1"]
            [lein-binplus "0.6.4"]
            [lein-ancient "0.6.15"]
            [lein-githooks "0.1.0"]
            [lein-cloverage "1.0.13"]
            [jonase/eastwood "0.3.3"]
            [venantius/ultra "0.5.2"]]
 
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
 
  :dependencies [[org.clojure/clojure "{{cookiecutter.clojure}}"]]
 
  :main ^:skip-aot {{cookiecutter.name}}.core
  :codox {:output-path "doc/api"}
  :cloverage {:output "cov/api"})

