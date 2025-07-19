Problem: Find Minimum in Rotated Sorted Array


Description :
You are given a sorted array that has been rotated a certain number of times. Your task is to find the minimum element in this rotated array efficiently.

Example:

An original sorted array: [1, 2, 3, 4, 5, 6, 7]

After rotation it 4 times, it might look like: [4, 5, 6, 7, 1, 2, 3]

The minimum element in this rotated array is 1.

Approach: Linear Scan : 
This solution uses a straightforward, brute-force method known as a Linear Scan. The logic relies on a unique property of rotated sorted arrays.

Logic 💡:
We traverse the array from the first element to the second-to-last element.

In this traversal, we compare each element arr[i] with its subsequent element arr[i+1].

A rotated sorted array has exactly one point where an element arr[i] is greater than its next element arr[i+1]. This point is the "pivot" or the point of rotation.

The element immediately following this pivot (arr[i+1]) is guaranteed to be the smallest element in the entire array.

Once we find this minimum element, we break the loop because no further checks are necessary.

Edge Case: If the array is not rotated at all (i.e., it is fully sorted like [1, 2, 3, 4]), the condition arr[i] > arr[i+1] will never be met. In this case, the first element arr[0] is correctly identified as the minimum.

Complexity Analysis : 
Time Complexity: O(n)
In the worst-case scenario (a fully sorted array), we have to scan the entire array once. Therefore, the time complexity is linear with respect to the size of the array (n).

Space Complexity: O(1) (Auxiliary Space)
While O(n) space is used to store the input array itself, the algorithm does not use any extra space that scales with the input size. It only uses a few constant variables. Therefore, the auxiliary space complexity is O(1).