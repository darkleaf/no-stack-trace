(ns darkleaf.no-stack-trace
  (:refer-clojure :exclude [ex-info])
  (:import
   [darkleaf.no_stack_trace ExceptionInfo]))

(defn ex-info
  "Create an instance of ExceptionInfo, a RuntimeException subclass
   that carries a map of additional data."
  ([msg map] (ExceptionInfo. msg map))
  ([msg map cause] (ExceptionInfo. msg map cause)))
