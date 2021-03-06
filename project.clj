;; Copyright © 2017, JUXT LTD.

(defproject roll "0.0.4"
  :description "Rolling Terraform releases orchestrated with ClojureScript."
  :url "http://github.com/juxt/roll"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :resource-paths ["tf"]
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [org.clojure/test.check "0.9.0"]]}}
  :plugins [[shmish111/lein-git-version "1.0.17"]]
  :git-version-root-ns "roll")


;; add tesst in here. 23
