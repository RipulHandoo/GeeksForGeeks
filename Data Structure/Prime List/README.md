# Prime List
# You are given the head of a linked list. You have to replace all the values of the nodes with the nearest prime number. If more than one prime number exists at an equal distance, choose the smallest one.

Example 1:

Input:
2 → 6 → 10
Output:
2 → 5 → 11
Explanation:
The nearest prime of 2 is 2 itself.
The nearest primes of 6 are 5 and 7,
since 5 is smaller so, 5 will be chosen.
The nearest prime of 10 is 11.

# Your Task:
The task is to complete the function primeList() which contains a reference to the head as the only argument. This function should return the head of the modified linked list.

Expected Time Complexity: O(number of nodes * sqrt(value of node)).
Expected Auxiliary Space: O(1).

# Constraints:
1 ≤ Number of Nodes ≤ 104
1 ≤ Value on Node ≤ 104
