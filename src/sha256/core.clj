(ns sha256.core
  (:require digest)
  (:gen-class))

(defn -main
  [& args]
  (if-let [console (System/console)]
    (let [pw (.readPassword console "Please enter password (you will not see any chars echoed to the screen):\n " nil)
          hash (-> (apply str pw)
                   (digest/sha))]
      (println "Your sha password hash:")
      (println hash))
    (println "No console. Please run this program from cmd.exe or PowerShell")))
