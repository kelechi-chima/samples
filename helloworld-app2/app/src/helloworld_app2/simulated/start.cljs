(ns helloworld-app2.simulated.start
  (:require [io.pedestal.app.render.push.handlers.automatic :as d]
            [helloworld-app2.start :as start]
            ;; This needs to be included somewhere in order for the
            ;; tools to work.
            [io.pedestal.app-tools.tooling :as tooling]))

(defn ^:export main []
  (start/create-app d/data-renderer-config))
