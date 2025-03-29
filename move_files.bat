@REM @echo off
@REM :: Navigate to the root directory
@REM cd /d D:\JB\Leetcodes

@REM :: Create folders if they don't already exist
@REM mkdir Array
@REM mkdir Math
@REM mkdir Matrix
@REM mkdir Stack
@REM mkdir "Sorting & Searching"

@REM :: Move files to respective folders
@REM move "1. Two Sum.java" Arrays\
@REM move "26. Remove Duplicates from Sorted Array.java" Arrays\
@REM move "27. Remove Element.java" Arrays\
@REM move "35. Search Insert Position(better).java" Arrays\
@REM move "35. Search Insert Position(optimal).java" Arrays\
@REM move "41. First Missing Positive(better).java" Arrays\
@REM move "41. First Missing Positive(brute).java" Arrays\
@REM move "41. First Missing Positive(optimal).java" Arrays\
@REM move "53. Maximum Subarray.java" Arrays\
@REM move "66. Plus One.java" Arrays\
@REM move "88. Merge Sorted Array.java" Arrays\
@REM move "121. Best Time to Buy and Sell Stock(Kadane's algo).java" Arrays\
@REM move "121. Best Time to Buy and Sell Stock(using two pointers).java" Arrays\
@REM move "136. Single Number.java" Arrays\
@REM move "169. Majority Element(Optimal).java" Arrays\
@REM move "169. Majority Element(Using HashMap).java" Arrays\
@REM move "238. Product of Array Except Self(brute).java" Arrays\
@REM move "238. Product of Array Except Self(optimal).java" Arrays\
@REM move "268. Missing Number.java" Arrays\
@REM move "448. Find All Numbers Disappeared in an Array.java" Arrays\
@REM move "485. Max Consecutive Ones.java" Arrays\
@REM move "977. Squares of a Sorted Array(optimal).java" Arrays\
@REM move "1822. Sign of the Product of an Array(okayish soln).java" Arrays\
@REM move "1822. Sign of the Product of an Array(Optimal).java" Arrays\
@REM move "1929. Concatenation of Array.java" Arrays\
@REM move "1365. How Many Numbers Are Smaller Than the Current Number(best).java" Arrays\
@REM move "1365. How Many Numbers Are Smaller Than the Current Number(worst).java" Arrays\
@REM move "1752. Check if Array Is Sorted and Rotated.java" Arrays\

@REM move "13. Roman to Integer.java" Math\

@REM move "1266. Minimum Time Visiting All Points.java" Matrix\

@REM move "682. Baseball Game.java" Stack\

@REM move "4. Median of Two Sorted Arrays(brute).java" "Sorting & Searching"\

@REM :: End message
@REM echo Files have been successfully organized!
@REM pause



@echo off

:: Create all topic folders if they don't exist
mkdir "Arrays"
mkdir "Linked Lists"
mkdir "Binary Search"
mkdir "Two Pointers"
mkdir "Sorting & Searching"
mkdir "Stacks & Queues"
mkdir "Trees & Graphs"
mkdir "Dynamic Programming"
mkdir "Greedy Algorithms"
mkdir "Backtracking"
mkdir "Hashing"
mkdir "Bit Manipulation"
mkdir "Mathematical Problems"
mkdir "Sliding Window"
mkdir "Heap & Priority Queue"
mkdir "Binary Search Tree (BST)"
mkdir "Matrix"

:: Move files from Arrays folder to their respective topic folders
move "Arrays\*Two Sum*.java" "Arrays"
move "Arrays\*Linked List*.java" "Linked Lists"
move "Arrays\*Binary Search*.java" "Binary Search"
move "Arrays\*Two Pointers*.java" "Two Pointers"
move "Arrays\*Sorting*.java" "Sorting & Searching"
move "Arrays\*Queue*.java" "Stacks & Queues"
move "Arrays\*Tree*.java" "Trees & Graphs"
move "Arrays\*DP*.java" "Dynamic Programming"
move "Arrays\*Greedy*.java" "Greedy Algorithms"
move "Arrays\*Backtracking*.java" "Backtracking"
move "Arrays\*Hash*.java" "Hashing"
move "Arrays\*Bit Manipulation*.java" "Bit Manipulation"
move "Arrays\*Math*.java" "Mathematical Problems"
move "Arrays\*Sliding Window*.java" "Sliding Window"
move "Arrays\*Heap*.java" "Heap & Priority Queue"
move "Arrays\*BST*.java" "Binary Search Tree (BST)"
move "Arrays\*Matrix*.java" "Matrix"

:: Confirmation message



echo Files have been successfully organized!
pause
