# ChallengeProblems
Leetcode style questions that I have created and implemented

# TowerOfHanoi: 
https://en.wikipedia.org/wiki/Tower_of_Hanoi 
The Tower of Hanoi is a mathematical puzzle that consists of three pegs and a number of disks of different sizes, which can slide onto any peg. The puzzle starts with the disks in a neat stack in ascending order of size on one peg, the smallest at the top, forming a conical shape.

## Problem Statement

Write a function that attempts to solve the Tower of Hanoi problem. The function should output:

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

# JosephusProblems: 
Attempts to solve the Josephus Problem: 
https://en.wikipedia.org/wiki/Josephus_problem

# SpiralMatrix: 
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
