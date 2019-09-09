(ns valbrand.problem-one)

(defn solution
  [numbers goal]
  (true? (reduce (fn [content-set n]
                   (if (contains? content-set (- goal n))
                     (reduced true)
                     (conj content-set n)))
                 #{}
                 numbers)))
