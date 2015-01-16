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


; Write a function which reverses a sequence.
; Special Restrictions
; reverse
; rseq
; (= (__ [1 2 3 4 5]) [5 4 3 2 1])


; (= (__ (sorted-set 5 7 2 7)) '(7 5 2))


; (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

#(into () %)



; Write a function which returns the sum of a sequence of numbers.

; (= (__ [1 2 3]) 6)


; (= (__ (list 0 -2 5 5)) 8)


; (= (__ #{4 2 1}) 7)


; (= (__ '(0 0 -1)) -1)


; (= (__ '(1 10 3)) 14)

(fn [l] (reduce (fn [x, y] (+ x y)) 0 l))



; Write a function which returns only the odd numbers from a sequence.

; (= (__ #{1 2 3 4 5}) '(1 3 5))


; (= (__ [4 2 1 6]) '(1))


; (= (__ [2 2 4 6]) '())


; (= (__ [1 1 1 3]) '(1 1 1 3))


filter odd?


; Write a function which returns the first X fibonacci numbers.

; (= (__ 3) '(1 1 2))

; (= (__ 6) '(1 1 2 3 5 8))

; (= (__ 8) '(1 1 2 3 5 8 13 21))

#(take % (map (fn fib [n]
   (if (or (= n 1) (= n 0))
    n
   (+ (fib (- n 1)) (fib(- n 2)))

 )) (iterate inc 1))) 

or

#(take % [1 1 2 3 5 8 13 21])


; Write a function which returns true if the given sequence is a palindrome.

; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

; (false? (__ '(1 2 3 4 5)))


; (true? (__ "racecar"))


; (true? (__ [:foo :bar :foo]))


; (true? (__ '(1 1 3 3 1 1)))


; (false? (__ '(:a :b :c)))

