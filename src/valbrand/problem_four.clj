(ns valbrand.problem-four)

(defn set-numbers-as-indices!
  [numbers]
  (persistent!
   (reduce (fn [result n]
             (if (and (pos? n)
                      (<= n (count numbers)))
               (assoc! result (dec n) n)
               result))
           (transient numbers)
           numbers)))

(defn solution
  [numbers]
  (let [numbers-as-indices (set-numbers-as-indices! numbers)]
    (reduce (fn [result index]
              (if (= (inc index) (nth numbers-as-indices index))
                (inc result)
                (reduced result)))
            1
            (range (count numbers)))))