(ns fireplace.core
  (:require [clojure.string :as s])
  (:gen-class))


(defn calc_zz
  "Helper for fizz-buzz"
  [number div word]
  (if (= (mod number div) 0) word))


(defn fizzbuzz 
  "The traditional fizz-buzz example problem"
  [n]
  (str (calc_zz n 5 "fizz") (calc_zz n 3 "buzz"))
)

(defn -main
  "FizzBuzz runner"
  [& args]
  
  (loop [x 1]
    (when (< x 99)
      (println (str x " " (fizzbuzz x)))
      (recur (+ x 1)))))

