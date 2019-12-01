(ns advent-of-code-2019.core
  (:gen-class)
  (:require [clojure.java.io :as io]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn as-num-vector
  "Reads from the file and returns a vector of numbers"
  [file]
  (with-open [rdr (io/reader file)]
    (map read-string
         (reduce conj [] (line-seq rdr)))
    )
  )

(defn calc-fuel [weight]
  (max 0
    (- (quot weight 3) 2))
  )

(defn calc-fuel-star2
  "Calculate the fuel for the given mass and the remaining fuel for that mass
  until no more fuel is required."
  [weight]

  (if (zero? weight)
    0
    (let [rw (calc-fuel weight)]
      (+ rw (calc-fuel-star2 rw))
      )
    ))

;; first result
(reduce + 0
        (map calc-fuel
             (as-num-vector (io/resource "input1.txt"))))

;; second star
(reduce + 0
        (map calc-fuel-star2
             (as-num-vector (io/resource "input1.txt"))))
