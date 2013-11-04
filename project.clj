(defproject sha256 "0.1.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [digest "1.4.3"]]
  :aot [sha256.core]
  :uberjar-name "sha.jar"
  :main sha256.core)
