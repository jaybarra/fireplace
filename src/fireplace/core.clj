(ns fireplace.core
  (:require [clojure.string :as s])
  (:gen-class))

(+ 1 2 3)

(defn square [x]
  (* x x))

(s/trim "abc  ")

(square 2)

(defmacro silly []
  '(let [a# (count [1 2 3])]
     (* 2 a#)))
(silly)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
