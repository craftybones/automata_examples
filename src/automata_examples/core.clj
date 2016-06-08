(ns automata-examples.core
  (:require [cheshire.core :refer :all]))

(defn -main
  []
  (-> "examples.clj" 
       slurp
       read-string
       generate-string
       (generate-stream (clojure.java.io/writer "examples.json"))))
