(ns advent-of-code-2019.core
  (:gen-class)
  (:require [clojure.java.io :as io])
  (:require [advent-of-code-2019.day1 :as day1])
  (:require [advent-of-code-2019.utils :as utils])
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (let [f (io/resource "input1.txt")]
    (println "Result for day1 star1 is" (utils/apply-and-sum day1/calc-fuel f))
    (println "Result for day1 star2 is" (utils/apply-and-sum day1/calc-fuel-star2 f))))
