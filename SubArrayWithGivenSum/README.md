# Subarray with given sum
Link: [**Subarray with given sum**](https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions)

Given an unsorted array `A` of size `N` that contains only 
non-negative integers, find a continuous sub-array which adds to a given number `S`.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

__Example 1:__
```
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}

Output: 2 4

Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
```

__Example 2:__
```
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}

Output: 1 5

Explanation: The sum of elements 
from 1st position to 5th position
is 15.
```

__Your Task:__

You don't need to read input or print anything. The task is to complete 
the function `subarraySum()` which takes arr, `N` and `S` as input parameters 
and returns an arraylist containing the starting and ending positions of 
the first such occurring subarray from the left where sum equals to `S`. 
The two indexes in the array should be according to 1-based indexing. 
If no such subarray is found, return an array consisting only one element that is `-1`.

__Excepted Time Complexity:__ O(N)
__Expected Auxiliary Space:__ O(1)
