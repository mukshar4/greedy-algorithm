

This project was developed in java as part of a class assignment for an Analysis of Algorithm course it uses greedy algorithms to slove delivery scheduling problems. 




Task A

a) task A will choose the delivery with the easiest finish time that is compatible with the previously selected delivery
b)choosing the easrliest finishing campatible delivery leaves the most remaining time for future deliveries. 
c) the running time is O(n log n) becuase sorting takes O(n log n) and the loop takes O(n)

Task B

a) the pririty queue store each drivers index and current finish time. with top priority to smallest finish time.
b) for each delivery, the alogrithm selects the driver who finish earliest. if that driver is available, the delivery is assigned to them. if not a new driver is created. 
c)if the earliest finishing driver is unavailable, all other drivers fimihs even later. therfore, a new driver is necessary, which keep the tottal number of drivers minimum. 
d) the running time is O(n log n) becuase deliveries are sorted O(n log n) and each heap takes O(logn)

Task C

a) task c uses the same greedy algorthm as Task A. instead of returning the max number of capatible delivers, it calculate how many deliveries must be rejected. 
b)n-k, n is hte number of deliveries
c) O(n log n) because sorting takes O(n log n) and checking the deliveries takes O(n).



Task D

we will choose this example
-----------------------------
delivary A, B, C
ready time(R) 0, 0, 1
profit(P) 3, 4, 2

Greedy method: sort from highest to lowest profit

so it'll be 
B = 4
A = 3
C = 2

delivery B
- schedule time 0

delay D = 0-0 = 0
value V = 4/(1+0) = 4

delivery A
- schedule time 1

D = 1-0 = 1
V = 3/(1+1) = 1.5

delivery C
- schedule time 2

d = 2-1 = 1
v = 2/(1+1) = 1

adding all the value we get 6.5

A better schedule would be 
time 0 = b
time 1 = c
time 2 = a

delivary    profit  ready   delay   value
-------------------------------------------
B           4       0       0       4
C           2       1       0       2
A           3       0       2       1

then the total value would be 7(which is better)