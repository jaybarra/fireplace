(ns fireplace.core-test
  (:require [clojure.test :refer :all]
            [fireplace.core :refer :all]))

(deftest fizzbuzz-test
  (testing "testing fizzbuzz values [5, 15]"
    (is (= (fizzbuzz 15) "fizzbuzz"))
    (is (= (fizzbuzz 14) ""))
    (is (= (fizzbuzz 13) ""))
    (is (= (fizzbuzz 12) "buzz"))
    (is (= (fizzbuzz 11) ""))
    (is (= (fizzbuzz 10) "fizz"))
    (is (= (fizzbuzz 9) "buzz"))
    (is (= (fizzbuzz 8) ""))
    (is (= (fizzbuzz 7) ""))
    (is (= (fizzbuzz 5) "fizz"))
    ))
