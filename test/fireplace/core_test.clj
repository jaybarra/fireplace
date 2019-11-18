(ns fireplace.core-test
  (:require [clojure.test :refer :all]
            [fireplace.core :refer :all]))

(deftest a-test
  (testing "15 should be fizzbuzz"
    (is (fizzbuzz 15 "fizzbuzz"))))
