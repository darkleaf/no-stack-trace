# darkleaf.no-stack-trace

[![Clojars Project](https://img.shields.io/clojars/v/darkleaf/no-stack-trace.svg)](https://clojars.org/darkleaf/no-stack-trace)

This is a drop-in replacement for `ex-info`:

```clojure
(ns your.ns
  (:require
    [darkleaf.no-stack-trace :as nst]))

(throw (nst/ex-info "Oops" {:some :data}))

;; or

(ns your.ns
  (:refer-clojure :exclude [ex-info])
  (:require
    [darkleaf.no-stack-trace :refer [ex-info]]))

(throw (ex-info "Oops" {:some :data}))
```

## License

Copyright © 2019 Mikhail Kuzmin

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
