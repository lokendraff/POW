A Straightforward Shot at the Fitness Streak Challenge!!

Here's my take on a cool challenge from a fitness app. The goal was to look at a user's daily record of calories burned and count how many continuous streaks add up to a specific target k. It's a neat way to help users spot when they're hitting their goals.

For example, if a user burns [100, 200, 300] calories over three days and the target k is 300, they have two successful streaks: [100, 200] and [300]. so, answer would be 2.

My Approach: Checking Every Possibility
For my first attempt at this, I went with the most direct and straightforward method I could think of: checking every single possible streak from start to finish. This is often called a brute-force or naive approach.

Here’s the simple game plan I followed:

1) I started an outer loop to pick a "start day" for a potential streak.

2) I put a condition if the user burned calories to the targeted value in a single day then, we will increase our total count. 

3) Then, for each start day, I kicked off an inner loop that moves forward one day at a time, marking the "end day" of the streak.

4) I kept a running total of the calories for the streak from the chosen start day to the current end day.

5) If at any point this sum matched the target k, I'd chalk one up for the win and add it to my total count.

It's a simple, step-by-step process that reliably checks every combination to make sure nothing is missed.

Performance Reality Check
Speed (Time Complexity): Because this method uses a loop inside another loop, its performance is O(n^2). It's simple and gets the job done for a small number of days. However, it would start to get pretty slow if you were analyzing a user's data from several years.

Memory (Space Complexity): On the bright side, this approach is very light on memory. It only needs a few variables to keep track of the sum and the count, so its memory usage is constant, or O(1).