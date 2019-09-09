(ns valbrand.problem-three-test
  (:require [clojure.test :refer :all]
            [valbrand.problem-three :as problem-three]))

(deftest solution-test
  (are [tree]
       (= (-> tree problem-three/serialize problem-three/deserialize)
          tree)
    (problem-three/node :root nil nil)
    (problem-three/node 
     :root
     (problem-three/node :left nil nil) nil)
    (problem-three/node
     :root
     nil 
     (problem-three/node :right nil nil))
    (problem-three/node
     :root
     (problem-three/node :left nil nil)
     (problem-three/node :right nil nil))
    (problem-three/node
     :root
     (problem-three/node 
      :left-1 
      (problem-three/node :left-left nil nil)
      (problem-three/node :left-right nil nil))
     (problem-three/node 
      :right-1 
      (problem-three/node :right-left nil nil) 
      (problem-three/node :right-right nil nil)))))