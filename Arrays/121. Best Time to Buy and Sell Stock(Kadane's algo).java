//better approach

class Solution {
    public int maxProfit(int[] arr) {
        int profitMax = 0;
        int n = arr.length;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            profitMax = Math.max(profitMax, arr[i] - minPrice);
        }
        return profitMax;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
// this approach is called Kadane's Algorithm
// Kadane's Algorithm is used to find the maximum subarray sum in an array.