A Better Way to Paint the Houses

After my first brute-force attempt, I realized it was too slow. The key to solving this problem efficiently is to use Dynamic Programming. The idea is to build up the solution house by house, smartly re-using the results we've already calculated.

My Upgraded Strategy (Dynamic Programming)

Instead of recalculating everything from scratch for each path, we can figure out the cheapest way to paint house #3 by simply looking at the results we already found for house #2.

**The Clever Optimization:

To make it even faster, you don't need to check all the previous color costs. For any house you're painting, you only really care about the cheapest and second-cheapest way the *previous* house could have been painted.

-   If the color you're thinking of using now is *different* from the previous house's cheapest color option, great! Just add that cheapest cost to your current cost.
-   If it's the *same* color, you can't use it. No problem! You just fall back to the second-cheapest option from the previous house.

By only keeping track of these two minimums from the last step, you can make the best decision for the current step super quickly.

Performance Gains

Speed (Time Complexity):** This DP trick is a huge win. It brings the time complexity way down to O(n * k), which is a massive improvement and handles the problem's constraints with ease.
Memory (Space Complexity): I'm able to do all these calculations without creating any new major data structures. I just use a few variables to keep track of the two minimum costs. This gives it a constant memory footprint or O(1).