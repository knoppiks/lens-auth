(ns lens.util)

(defn parse-long [s]
  (Long/parseLong s))

(defn now []
  (System/currentTimeMillis))
