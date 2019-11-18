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
  (calc_zz n 3 (str (calc_zz n 5 "fizz") "buzz")))


(defn -main
  "FizzBuzz runner"
  [& args]
  
