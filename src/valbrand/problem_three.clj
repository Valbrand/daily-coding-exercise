(ns valbrand.problem-three)

(defn node
  [value left right]
  {:value value
   :left left
   :right right})

(defn serialize
  [tree]
  (str tree))

(defn deserialize
  [tree-str]
  (read-string tree-str))