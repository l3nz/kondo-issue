


(ns kondo-issue.core
(:require [clash.core :as clash]
            [cheshire.core :as json]
            [clojure.spec.alpha :as s]
    ; [clojure.spec.test :as stest]
            )
  (:import [java.security MessageDigest]
           [java.io       BufferedReader
                          RandomAccessFile
                          FileDescriptor
                          FileReader
                          File]))


(s/def ::action string?)


(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
