(ns advent-of-code-2019.core
  (:gen-class)
  (:require [clojure.java.io :as io]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))



(defn calc-fuel [weight]
  (- (quot weight 3) 2))


; tests from the puzzle
(calc-fuel 12)
(calc-fuel 14)
(calc-fuel 1969)
(calc-fuel 100756)


(defn as-num-vector
  "Reads from the file and returns a vector of numbers"
  [file]
  (with-open [rdr (io/reader file)]
    (map read-string
         (reduce conj [] (line-seq rdr)))
    )
  )

;; first result
(reduce + 0
        (map calc-fuel
             (as-num-vector (io/resource "input1.txt"))))

