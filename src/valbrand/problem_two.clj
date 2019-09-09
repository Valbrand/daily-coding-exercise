(ns valbrand.problem-two)

(defn product
  [numbers]
  (reduce * 1 numbers))

(defn left-right-products
  [numbers]
  (reduce (fn [[left right] index]
            (let [last-left (or (last left) 1)
                  last-right (or (last right) (product numbers))]
              [(conj left (* last-left 
                             (nth numbers (dec index) 1)))
               (conj right (/ last-right
                              (nth numbers index)))]))
          [[] []]
          (range (count numbers))))

(defn solution
  [numbers]
  (let [[left-products right-products] (left-right-products numbers)]
    (reduce (fn [result index]
              (conj result (* (nth left-products index)
                              (nth right-products index))))
            []
            (range (count numbers)))))