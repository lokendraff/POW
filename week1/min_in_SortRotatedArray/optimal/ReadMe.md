Problem: Find Minimum in Rotated Sorted Array (Optimal).


Description :
This project provides an optimal solution to the classic problem of finding the minimum element in a sorted array that has been rotated. When a sorted array is rotated, it's split into two sorted subarrays. The goal is to find the smallest element in the entire array efficiently.

Example:

An original sorted array: [0, 1, 2, 4, 5, 6, 7]

After 4 rotations, it might become: [4, 5, 6, 7, 0, 1, 2]

The minimum element in this rotated array is 0.

Approach: Binary Search
This solution uses a modified Binary Search algorithm to find the minimum element in logarithmic time, which is highly efficient.

Logic 💡
The core idea is to intelligently eliminate half of the search space in each iteration until we find the minimum element.

1) We initialize two pointers, left at the beginning and right at the end of the array.

2) We continuously search as long as left <= right.

3) In each step, we calculate the mid index.

4) The main logic relies on comparing arr[mid] with the element at the right end, arr[right]:

5) If arr[mid] > arr[right], it means the pivot point and the minimum element must be in the right half of the array (from mid + 1 to right). So, we discard the left half by setting left = mid + 1.

6) If arr[mid] <= arr[right], it implies that the left half (from left to mid) is the sorted portion that might contain the minimum element. We record arr[mid] as a potential answer and then discard the right half by setting right = mid - 1 to search for an even smaller value.

7) This process continues, narrowing the search space until the minimum element is found.

Complexity Analysis : 
Time Complexity: O(log n)
The algorithm is based on binary search, which halves the search space in each iteration. Therefore, the time complexity is logarithmic with respect to the number of elements (n) in the array.

Space Complexity: O(1) (Auxiliary Space) : 
The algorithm uses a fixed number of variables (left, right, mid, ans) regardless of the input array's size. No extra space that scales with the input is required.