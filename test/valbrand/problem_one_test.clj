(ns valbrand.problem-one-test
  (:require [clojure.test :refer :all]
            [valbrand.problem-one :as problem-one]))

(deftest solution-test
  (is (= (problem-one/solution [] 17)
         false))
  (is (= (problem-one/solution [10 15 3 7] 17)
         true))
  (is (= (problem-one/solution [0] 0)
         false))
  (is (= (problem-one/solution [1 0] 1)
         true))
  (is (= (problem-one/solution [-5 10] 5)
         true)))
