(defproject org.beatlevic/protobuf "0.8.2"
  :description "Clojure-protobuf provides a clojure interface to Google's protocol buffers."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/beatlevic/clojure-protobuf"
  :dependencies [[org.clojure/clojure "1.7.0-RC1"]
                 [org.flatland/useful "0.9.0"]
                 [org.flatland/schematic "0.1.0"]
                 [org.flatland/io "0.3.0"]
                 [ordered-collections "0.4.0"]]
  :plugins [[lein-protobuf "0.4.2"]]
  :checksum-deps true
  :java-source-paths ["src"]
  :sign-releases false)
