#!/usr/bin/env obb
#_(map identity
       (-> (js/Application "Google Chrome")
           .-windows
           (aget 0)
           .tabs))
#_(map inc [1 2 3])
#_[1 2 3]
#_(first (list 1 2))

#_(doseq [t (-> (js/Application "Google Chrome")
                .-windows
                (aget 0)
                .tabs)]
    (println (.title t)))

(-> (js/Application "Google Chrome")
    .-windows
    (aget 0))
