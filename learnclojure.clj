; Write a function which returns the second to last element from a sequence.
; test not run  

; (= (__ (list 1 2 3 4 5)) 4)

; (= (__ ["a" "b" "c"]) "b")

; (= (__ [[1 2] [3 4]]) [1 2])

#(nth % (- (count %) 2))


; Write a function which returns the last element in a sequence.
; test not run  

; (= (__ [1 2 3 4 5]) 5)

; (= (__ '(5 4 3)) 3)

; (= (__ ["b" "c" "d"]) "d")

#(first (reverse %))