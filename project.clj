(defproject darkleaf/no-stack-trace "1.0.0"
  :description "This is a drop-in replacement for `ex-info`"
  :url "https://github.com/darkleaf/no-stack-trace"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0" :scope "provided"]]
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java"]
  :repl-options {:init-ns darkleaf.no-stack-trace})
