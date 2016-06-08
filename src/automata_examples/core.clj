(ns automata-examples.core
  (:require [cheshire.core :refer :all]))

(defn -main
  []
  (->> "examples.clj" slurp read-string generate-string (spit "examples.json")))
