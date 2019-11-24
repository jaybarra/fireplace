(ns fireplace.core
  (:require [clojure.string :as s])
  (:gen-class))

(defn random_int_in_range
  [from to]
  (+ (rand-int (- to from)) from)
)

(random_int_in_range 1 10)

(defn calc_zz
  "Helper for fizz-buzz"
  [number div word]
  (if (= (mod number div) 0) word))


(defn fizzbuzz 
  "The traditional fizz-buzz example problem"
  [n]

  (let [output n] (s/trim (str output " " (calc_zz n 5 "fizz") (calc_zz n 3 "buzz"))))

  ;(str (calc_zz n 5 "fizz") (calc_zz n 3 "buzz")) 
)


(defn -main
  "FizzBuzz runner"
  [& args]

  (map #(println (fizzbuzz %)) (range 1 20))
)


