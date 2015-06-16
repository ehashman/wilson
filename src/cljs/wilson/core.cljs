(ns wilson.core)

(defn menagerie-page
  []
  [:div [:h2 "Welcome to the menagerie!"]])

(defn mount-root
  []
  (reagent/render (menagerie-page) (.getElementById js/document "app")))

(defn init!
  []
  (mount-root))
