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

; Solution 1
(fn [l, n]  
  (last (take (+ n 1) l)))

; Solution 2
.get



; Write a function which returns the total number of elements in a sequence.
; Special Restrictions
; count
; (= (__ '(1 2 3 3 1)) 5)

; (= (__ "Hello World") 11)

; (= (__ [[1 2] [3 4] [5 6]]) 3)

; (= (__ '(13)) 1)

; (= (__ '(:a :b :c)) 3)

(fn [l] (reduce (fn [x, n] (inc x)) 0 l))

