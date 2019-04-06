(ns {{cookiecutter.name}}.core-test
  (:require [clojure.test :refer :all]
            [{{cookiecutter.name}}.core :refer :all]))

(deftest can-execute-main
  (is (nil? (-main))))
