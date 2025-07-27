The LCS of Three Strings Challenge: A Different Angle (Tabulation)

After solving this problem with recursion, I wanted to try the other classic DP method: tabulation, also known as the bottom-up approach.

My Second Approach (Bottom-Up DP)

Instead of a recursive function that calls itself, this method uses three nested loops and builds a 3D table (dp) from the ground up. It's a more direct way of filling out the "memory" that we were using in the first approach.

The Logic:

Think of the dp[i][j][k] cell in the table as holding the answer for the LCS of the first i characters of string 1, the first j characters of string 2, and the first k of string 3.

I fill this table starting from the smallest subproblems (empty strings) and use those results to solve slightly bigger ones.

-   If the last characters of all three substrings I'm looking at match, I know the LCS is "1 +" whatever the LCS was for the strings without those last characters (dp[i-1][j-1][k-1]).
-   If they don't match, the answer is simply the best result (maximum) we've found so far by ignoring the last character of either the first, second, or third substring.

Performance

Time Complexity: The three nested loops run up to the length of the strings, making the time complexity O(n1 * n2 * n3).
Space Complexity: The 3D DP table is the main consumer of memory, so the space complexity is also O(n1 * n2 * n3).

While the complexity is the same as the memoization approach, this method avoids deep recursion, which can sometimes be slightly faster in practice and doesn't have the risk of a "Stack Overflow" error on very large inputs.