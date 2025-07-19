Cracking the Calorie Streak Problem: The Optimal Way
This is my upgraded solution for the fitness app's challenge: counting how many continuous daily streaks of calorie burns add up to a target k.

My first attempt was a simple brute-force method, which was fine but too slow for large datasets. So, I dug a bit deeper and implemented this much more elegant and faster solution.

My Upgraded Approach: The HashMap Trick
Instead of checking every single combination, this method is much smarter. It solves the problem in just one pass through the data, using a technique involving a Prefix Sum and a HashMap.

Here’s the thought process behind it:

The main idea is to keep a "running total" (or prefix sum) of calories as we move through the days. Let's call this currentSum.

The real magic happens when we use a HashMap. This map's job is to remember every running total we've seen so far and how many times we've seen it.

As I loop through the daily calorie numbers, I keep updating currentSum. For each new sum, I ask a simple question: "Have I seen a previous running total that is exactly equal to current_sum - k?"

If the answer is yes, it means the stretch of days between that old point and my current point must add up to exactly k! The HashMap lets me get this answer instantly. I add the number of times I've seen that previous sum to my final count.

After the check, I update the map with the currentSum I just calculated, either by adding it for the first time or by increasing its count.

There's one tiny but crucial setup step: I initialize the map with a sum of 0 having occurred once. This little trick correctly handles cases where a goal-hitting streak starts right from the very first day.

Performance Gains
The difference this approach makes is huge.

Speed (Time Complexity): Because we only need to go through the list of days a single time, the solution is incredibly fast. Its runtime is O(n), which scales perfectly even with lots of data.

Memory (Space Complexity): We do use some extra memory for the HashMap. In the worst-case scenario, it might store a unique entry for every day, so the space usage is O(n). It's a small price to pay for the massive speed boost.