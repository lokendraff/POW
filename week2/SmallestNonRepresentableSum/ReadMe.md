Problem: Smallest Non-Representable Sum (Optimal)
This project contains an efficient solution for the "Smallest Non-Representable Sum" problem, a common challenge asked in interviews at companies like Amazon.

The Challenge
The task is to look at a sorted list of positive numbers (like coin denominations) and find the smallest positive number that cannot be formed by adding up any combination of those numbers. For example, with [1, 2, 5], you can make 1, 2, 3, 5, 6, 7, 8, but you can't make 4.

My Approach: The Efficient Greedy Method
Instead of trying every single combination (which would be too slow), I used a much faster greedy approach that solves the problem in a single pass through the array.

Here's the logic:

I start with a variable, let's call it reachable_sum, and set its value to 1. This represents the smallest sum that I'm trying to form.

I then iterate through the sorted list of numbers (num).

The Core Idea:

If the current number num is less than or equal to my reachable_sum, it means I can use this number to create an even larger range of sums. I add it to my reachable_sum to find the next number I can't form. (reachable_sum += num).

The moment I encounter a number num that is greater than my reachable_sum, I've found a gap. I can make all sums up to reachable_sum - 1, but I can't make reachable_sum itself because the next available number is too large. At this point, reachable_sum is my final answer, and I can stop.

This simple logic works because the array is sorted, allowing us to build upon the sums we can already form.

Performance Analysis
Time Complexity: O(n) because it only requires a single pass through the input array.

Space Complexity: O(1) as it only uses a constant amount of extra space for the reachable_sum variable.