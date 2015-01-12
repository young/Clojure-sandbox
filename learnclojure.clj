; Write a function which returns the second to last element from a sequence.

; (= (__ (list 1 2 3 4 5)) 4)

; (= (__ ["a" "b" "c"]) "b")

; (= (__ [[1 2] [3 4]]) [1 2])

#(nth % (- (count %) 2))


; Write a function which returns the last element in a sequence.

; (= (__ [1 2 3 4 5]) 5)

; (= (__ '(5 4 3)) 3)

; (= (__ ["b" "c" "d"]) "d")

#(first (reverse %))





; Write a function which returns the Nth element from a sequence.
; Restrictions: can't use nth

; (= (__ '(4 5 6 7) 2) 6)


; (= (__ [:a :b :c] 0) :a)


; (= (__ [1 2 3 4] 1) 2)


; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(fn [l, n]  
  (last (take (+ n 1) l)))