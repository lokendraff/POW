My First Attempt at the Paint House Problem:

This was my initial crack at the "Paint House" challenge. The goal is to figure out the cheapest way to paint a row of houses, with the simple rule that no two houses next to each other can be the same color.


My Initial Idea (Brute-Force Recursion):

My first instinct was to just try every single valid combination. It's the most direct way to think about the problem.

Here's the logic:
-   For the first house, I try painting it with every available color.
-   Then for the second house, I try every color *except* the one I just used for the first house.
-   ...and so on, down the line.

I wrote a recursive function that does exactly this. It goes house by house, explores all valid color options, and adds up the cost for each complete "path". It then keeps track of the absolute cheapest path it has found so far.

The Reality Check (Performance)

Speed (Time Complexity): This approach is simple to understand, but it's incredibly slow. It has an exponential time complexity, roughly O(k^n). For a few houses it's fine, but for 100 houses, it would take an eternity to run. It's a classic example of a solution that works logically but doesn't scale.
Memory (Space Complexity): It uses memory to keep track of the recursive calls, which depends on the number of houses. So, its space complexity is O(n).