# ChallengeProblems
Leetcode style questions that I have created and implemented

# 1. TowerOfHanoi: 
https://en.wikipedia.org/wiki/Tower_of_Hanoi 
The Tower of Hanoi is a mathematical puzzle that consists of three pegs and a number of disks of different sizes, which can slide onto any peg. The puzzle starts with the disks in a neat stack in ascending order of size on one peg, the smallest at the top, forming a conical shape.

## Problem Statement

Write a function that attempts to solve the Tower of Hanoi problem. The function should output the following:

1. **Minimum number of moves** needed to solve the puzzle.
2. **Step-by-step solution** indicating which tower to move each disk to.

### Rules:

1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the pegs and sliding it onto another peg, on top of the other disks that may already be present on that peg.
3. No disk may be placed on top of a smaller disk.

## Example:

**Input:**
Number of disks: `3`

**Output:**
```
Minimum moves needed: 7

Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
```

Here, `A`, `B`, and `C` are the three pegs, and the disks are numbered from 1 (smallest) to n.

# 2. JosephusProblems: 

This Java-based implementation attempts to solve the infamous Josephus Problem, also known as Josephus Permutation.

## Overview

The Josephus Problem is a famous theoretical problem in mathematics and computer science. The challenge revolves around determining the safe position (or the last remaining position) in a circle formed by `n` people, where every `k-th` person is eliminated until only one person remains.

## Sample Interaction

```
Enter the number of people in the circle: 7
Enter the step size: 3
The last person remaining is at position: 4
```

https://en.wikipedia.org/wiki/Josephus_problem

# 3. SpiralMatrix: 
Given an `m x n` matrix of integers, traverse the matrix in spiral order and add every third element you encounter to a sum. Return the total sum after the spiral traversal.

**Example:**

Input: 
```
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
```
Output:
`15`

Explanation: 
The spiral order traversal for the above matrix is `[1,2,3,6,9,8,7,4,5]`. Every third element is `3`, `9`, and `3` respectively. Their sum is `15`.

**Constraints:**

- The number of the rows, `m`, and columns, `n`, of the matrix will be in the range [1, 20].
- The integer values in the matrix will be in the range [-10^4, 10^4].
This solution uses a typical approach for spiral traversal of a matrix and adds the logic for summing up every third element encountered.


Certainly! Here's a new section of your README that describes the problem:

---

# 4. RoundTable

**Objective**: To find the number of adjacent pairs in a circular arrangement (imaginary round table) whose sum is even. Each number can be used in only one pair.

**Input**: An array of integers.

**Output**: The number of adjacent pairs in the circular arrangement that have an even sum.

**Constraints**:
- If the length of the input array is 0 or 1, the output is 0.
- If all integers in the array are the same or all are even or all are odd, the output is half the length of the array.
- In the main processing loop, if two adjacent integers are found to sum up to an even number, they form a pair and are counted. The search then continues with the next unpaired integer.
- Special consideration is given to the first and the last integer in the array. If the first integer has not been paired with its adjacent integer in the array, it is then checked to see if it forms an even sum with the last integer. If so, they are counted as a pair.

**Example**:
- Input: `{1, 2, 3, 4, 5}`
- Output: `2`
  
  Explanation: The pairs are `(2, 3)` and `(4, 5)`.

**Implementation**:

The problem is implemented in the `RoundTable` class. The main function `solution(int[] A)` returns the count of pairs. Three helper functions - `allSame(int[] A)`, `allEven(int[] A)`, and `allOdd(int[] A)` are used to handle specific conditions mentioned in the constraints.

A test suite with several test cases can be found in the `main` method of the `RoundTable` class.