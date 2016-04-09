(ns marpdown.core
  (:gen-class))

(defn fib [x]
  (if (<= x 1) x (+ (fib (- x 1)) (fib (- x 2)))))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println (fib 8)))

