# Recursion
## Simple
### RecursiveCountdown:
The program will use print statements to map out its journey and show the recursion
  1) In each call of CountDown print the step, each print is preceded by "prefix"
  2) On entering print "entering countDown with <arg>"
  3) if n == 0, print "done!"
  4) if n != 0, print "recursing"
  5) Before leaving, print "returning from CountDown with <arg>"

Do the same thing with RecursionDemo2

## HW 7
### CountOdds
Write a recursive method that will compute the number of odd digits in a number.

### AddDigitsInNumber
Write a recursive method that will compute the sum of the digits in a positive number.

### TenToTheN and BigIntTenToTheN
  1) Complete a recursive definition 10^n where n >= 0
  2) formatBigInteger(BigInteger) returns a string representation of the number with commas.

# Sort
### MergeSort
  1) For sort, divide, and merge, use "prefix" variable and incorporate many print staements to track progress
  2) Add private staic class "numberOfCopies", initialized to 0, add a getter to report back "numberOfCopies" to the calling program, MergeSortDemo.

## HW 8
### Factorials
One of the most common examples of recursion is an algorithim to calulate the factorial of an integer.
One way to describe the calculation of n! is the recrsive formula n * (n-1)! (Plus the base case of 0! which is 1)
1) Write a static method that implements this recursive formula for factorials
2) Place the method in a test program that allows the user to enter values for n until signaling an end to execution
3) Find the largest number that still gives the correct answer using int and long
4) Switch to BigInt so you can use as big a number as you like.
   
### HandShake
There are n people in a room where n is an integer greater than or equal to 2. 
Each person shakes hands with every other person, what is the total number of handshakes in the room?
Write a recursive method to solve this problem.
     
### LargestInt
Write a recursive method that will find and return the largets value in an array of integers.
