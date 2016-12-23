(ns lifetime-cheatsheet.css
  (:require [garden.core :as garden]))

; Colors from http://ethanschoonover.com/solarized
(def base00    "#657b83") (def base0     "#839496")
(def base01    "#586e75") (def base1     "#93a1a1")
(def base02    "#073642") (def base2     "#eee8d5")
(def base03    "#002b36") (def base3     "#fdf6e3")
(def yellow    "#b58900") (def orange    "#cb4b16")
(def red       "#dc322f") (def magenta   "#d33682")
(def violet    "#6c71c4") (def blue      "#268bd2")
(def cyan      "#2aa198") (def green     "#859900")

(def content-background-color base3)
(def content-color base00)
(def content-font-size "1.2em")
(def section-font-size "1.3em")
(def code-font-size "1.3em")

(def tag-color base3)
(def tag-font-size "0.8em")

(def link-hover-color orange)

(defn main []
  (garden/css
    {:pretty-print? true}
    [:html :body {:height "100%"}]
    [:body
     {:background-color content-background-color
      :color content-color
      :font-size content-font-size
      :width "100%"
      :min-height "100%"
      :margin "0%"
      :padding "0%"}
     [:p.section {:font-size section-font-size}]
     [:.grid {:width "100%"}]
     [:table :tr :td
      {:border "1px solid black"
       :border-collapse "collapse"}]
     [:table
      {:table-layout "fixed"
       :overflow "auto"}
      [:.left-column {:width "50%"}]
      [:.right-column {:width "50%"}]
      [:td {:position "relative"}]]
     [:div.tag {:position "absolute"
                :bottom "5px"
                :right "5px"}
      [:span
       {:font-size tag-font-size
        :color tag-color
        :margin "5px 5px 5px 5px"
        :padding "2px 4px 2px 4px"
        :border-radius "5px"}]
      [:span.valid :span.idiomatic
       {:background-color green}]
      [:span.undefined-behavior :span.invalid :span.non-idiomatic
       {:background-color orange}]]
     [:p.title
      {:font-style "italic"
       :font-size "0.8em"
       :margin "5px 5px 5px 5px"}]
     [:p.text
      {:margin "5px 5px 5px 5px"}]
     [:pre :code
      {:font-size code-font-size
       :padding-bottom "5px"}
      [:.hljs-built_in {:color (str violet " !important")}]]
     [:a:hover {:color link-hover-color}]]))
