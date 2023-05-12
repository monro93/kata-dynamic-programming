# Dynamic Programming Workshop

Welcome to the dynamic programming workshop! In this workshop, we will be exploring dynamic programming and using it to solve a classic problem: given X number of dice, count the combinations that a number Y appears.

## Exercise 1: Count combinations for 1 die
In this exercise, you will implement a class to count the number of combinations for one die using a simple loop. The dices of this exercise have 6 sides, numbered from 1 to 6. So for this exercise the number of combinations for a number between 1 and 6 is always 1 and otherwise 0.

### Example
Input: `1, 6`
Output: `1`

Input: `1, 7`
Output: `0`

### Instructions
1. Open [`DiceCounter.kt`](src/main/kotlin/DiceCounter.kt).
2. Implement the `howManyPossibilitiesToObtain` function.
3. If the numberOfDice is not 1, return 0.
4. Test your solution running the Ex1 test on [`DiceCounterTest.kt`](src/test/kotlin/DiceCounterTest.kt).

## Exercise 2: Count combinations for 2 dice
In this exercise, you will implement a class to count the number of combinations for two dices. Let's see something first:

What are the possibilities to get an 8 with two dices? Let's see:
    - First die is a 2 and second die is a 6
    - First die is a 3 and second die is a 5
    - First die is a 4 and second die is a 4
    - First die is a 5 and second die is a 3
    - First die is a 6 and second die is a 2

We can generalize this splitting the problem: we know that in the second dice we will get a value between 1 and 6, so we need that the first dice is a value that we can add this value to get the desired result. So, the possibilities to get an 8 are the sum of the possibilities to get a 7, 6, 5, 4, 3 and 2 in the first dice.

### Example
Input: `2, 8`
Output: `5`

### Instructions
1. Open [`DiceCounter.kt`](src/main/kotlin/DiceCounter.kt).
2. Implement the `howManyPossibilitiesToObtain` function for the case of a 2.
3Test your solution running the Ex1 test on [`DiceCounterTest.kt`](src/test/kotlin/DiceCounterTest.kt).

## Exercise 3: Count combinations for X dice
In this exercise, you will implement the generic method for all the cases. You can use the formula provided.

### Formula
```count(D, V) = count(D-1, V-1)+count(D-1, V-2)+count(D-1, V-3)+count(D-1, V-4)+count(D-1, V-5)+count(D-1, V-6)```
Where D is Dices and V is Value


### Instructions
1. Open [`DiceCounter.kt`](src/main/kotlin/DiceCounter.kt).
2. Implement the `howManyPossibilitiesToObtain` function.
3. Test your solution running the Ex3 test on [`DiceCounterTest.kt`](src/test/kotlin/DiceCounterTest.kt).

## Exercise 4: Dynamic programming solution
In this exercise, you will implement a dynamic programming solution for the problem. You may have noticed that when we calculate the possibilities for a number, as we are calculating the possibilities with less dices recursively there are a lot of branches that we calculate multiple times. Instead we can store the results of the calculations and reuse them to improve the performance, this is the base of Dynamic Programming.

### Instructions
1. Open [`DiceCounter.kt`](src/main/kotlin/DiceCounter.kt).
2. Implement the `howManyPossibilitiesToObtain` function using dynamic programming.
3. Test your solution running the Ex3 test on [`DiceCounterTest.kt`](src/test/kotlin/DiceCounterTest.kt).

## Conclusion
What is the base of Dynamic programming:
- Find a problem that can be split in subproblems
- Find the formula to calculate the result of the problem using the results of the subproblems
- Implement the solution using recursion or iteration
- Identify the subproblems that are calculated multiple times
- Store the results of that subproblems to reuse them


## Additional Resources
- [YouTube: Dynamic Programming counting dice](https://www.youtube.com/watch?v=oifN-YVlrq8)
- [Wikipedia: Dynamic Programming](https://en.wikipedia.org/wiki/Dynamic_programming)
- [Top 50 Dynamic Programming Practice Problems](https://www.geeksforgeeks.org/top-50-dynamic-programming-practice-problems/)
- [Kotlin Programming Language](https://kotlinlang.org/)
