# ChallengeProblems
Leetcode style questions that I have created and implemented

# TowerOfHanoi: 
Attempts to solve the Tower of Hanoi Problem by outputting the minimum number of moves needed and which tower to move each disk to. 
https://en.wikipedia.org/wiki/Tower_of_Hanoi 

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
