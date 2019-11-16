(ns fireplace.core
  (:require [clojure.string :as s])
  (:gen-class))


(defn fizzbuzz 
  "The traditional fizz-buzz example problem"
  [n]

  (print (str n " - "))
  (when (> n 0) 
    (if (mod n 5) "fizz")
    (if (mod n 3) "buzz")
    (println)
    (fizzbuzz (- n 1))))

(fizzbuzz 16)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (fizzbuzz 3))

