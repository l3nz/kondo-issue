(defproject kondo-issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.1.143"]
                 [expound "0.7.2"]
                 [clj-http "3.9.1"]
                 [clash "1.3.2"]
                 [cheshire "5.7.0"]
                 ;[clojure-future-spec "1.9.0-alpha15"]
                 [org.clojure/test.check "0.9.0"]
                 ;[org.apache.httpcomponents/httpclient "4.5.3"]

                 [lenz/capacitor "0.6.0.2"]
                 [cli-matic "0.3.6"]
                 [say-cheez "0.1.1"]

                 [clj-kondo "2019.06.24-alpha-SNAPSHOT" :scope "provided"]]

  :plugins [[lein-eftest "0.5.1"]
            [lein-cljfmt "0.5.7"]]

  :aliases {"fix" ["cljfmt" "fix"]
            "clj-kondo" ["trampoline" "run" "-m" "clj-kondo.main" "--" "--lint" "src/" "--cache" ".cli-kondo-cache"]} 


:profiles {:uberjar {:aot :all}}




)
