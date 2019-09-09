(ns valbrand.problem-two-test
  (:require [clojure.test :refer :all]
            [valbrand.problem-two :as problem-two]))

(deftest left-right-products-test
  (is (= (problem-two/left-right-products [])
         [[] []]))
  (is (= (problem-two/left-right-products [1 2 3 4 5])
         [[1 1 2 6 24] [120 60 20 5 1]]))
  (is (= (problem-two/left-right-products [1 2 3 4])
         [[1 1 2 6] [24 12 4 1]]))
  (is (= (problem-two/left-right-products [100])
         [[1] [1]])))

(deftest solution-test
  (is (= (problem-two/solution [])
         []))
  (is (= (problem-two/solution [1 2 3 4 5])
         [120 60 40 30 24]))
  (is (= (problem-two/solution [1 2 3 4])
         [24 12 8 6]))
  (is (= (problem-two/solution [100])
         [1])))