(ns valbrand.problem-four-test
  (:require [clojure.test :refer :all]
            [valbrand.problem-four :as problem-four]))

(deftest set-numbers-as-indices-test
  (is (= []
         (problem-four/set-numbers-as-indices! [])))
  (is (= [1 2 3 4]
         (problem-four/set-numbers-as-indices! [4 3 2 1])))
  (is (= [1 4 3 4]
         (problem-four/set-numbers-as-indices! [3 4 -1 1])))
  (is (= [1 2 0]
         (problem-four/set-numbers-as-indices! [1 2 0])))
  (is (= [2]
         (problem-four/set-numbers-as-indices! [2]))))

(deftest solution-test
  (is (= 1
         (problem-four/solution [])))
  (is (= 5
         (problem-four/solution [4 3 2 1])))
  (is (= 2
         (problem-four/solution [3 4 -1 1])))
  (is (= 3
         (problem-four/solution [1 2 0])))
  (is (= 1
         (problem-four/solution [2]))))