(ns advent-of-code-2019.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code-2019.core :refer :all]))

(deftest calc-fuel-test

  (testing "Whether calc-fuel works as specified"
    (is (= (calc-fuel 12) 2))
    (is (= (calc-fuel 14) 2))
    (is (= (calc-fuel 1969) 654))
    (is (= (calc-fuel 100756) 33583))
    )

  (testing "Negative args for calc-fuel"
    (is (= (calc-fuel 0) 0))
    (is (= (calc-fuel -14) 0))
    )
  )


(deftest calc-fuel-star2-test
  (testing "Whether the seocndf version works"

    (is (= (calc-fuel-star2 14) 2))
    (is (= (calc-fuel-star2 1969) 966)
        ))
  )
