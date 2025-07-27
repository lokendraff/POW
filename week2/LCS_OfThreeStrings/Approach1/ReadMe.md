                           Solving the LCS of Three Strings Problem

Here's my take on a classic Dynamic Programming problem: finding the Longest Common Subsequence (LCS) not between two, but three different strings.

The Challenge : 
The goal is to find the longest sequence of characters that appears in the same order within all three given strings, though not necessarily consecutively.

For example, if the strings are:

s1 = "AGGTAB"

s2 = "GXTXAYB"

s3 = "AGGTAYB"

The longest common subsequence is "GTAB", so the answer would be 4.

My Approach: Recursion with a Memory (Memoization)
My first thought to solve this was to use recursion. The logic breaks down into two simple cases when comparing the characters at the start of the strings:

If the characters match: Perfect! This character is definitely part of our answer. We count it as 1 and then recursively call the function to find the LCS for the rest of all three strings.

If they don't match: This is the tricky part. The longest subsequence could come from ignoring the current character of the first string, or the second, or the third. So, I make three separate recursive calls to explore all these possibilities and then just take the best (maximum) result from them.

A plain recursive solution would be super slow because it recalculates the same subproblems over and over. To fix that, I used memoization, which is a top-down Dynamic Programming technique. I used a 3D array (dp) to store the results of problems I've already solved. Before doing any new calculation, I just check the dp table. If the answer is already there, I use it directly. This simple trick makes a huge difference in performance.

Performance Breakdown
Time Complexity: Thanks to memoization, every subproblem (i, j, k) is solved only once. This makes the time complexity O(n1 * n2 * n3), where n1, n2, and n3 are the lengths of the three strings.

Space Complexity: The main memory usage comes from the 3D dp array we use for storing our answers. So, the space complexity is also O(n1 * n2 * n3).