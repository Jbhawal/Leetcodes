// optimal solution 
//counting sort(prefix sum )
//Time complexity: O(n)
//Space complexity: O(1). note- this is modifying the original array so sc is 1..if we use another arr for ans then sc would be of order n

import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101]; // Since numbers are in range 0-100
        
        // Step 1: Count occurrences of each number
        for (int num : nums) {
            arr[num]++;
        }
        
        // Step 2: Compute prefix sum to store count of numbers smaller than current
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }
        
        // Step 3: Replace each nums[i] with arr[nums[i] - 1] (how many numbers are smaller)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == 0 ? 0 : arr[nums[i] - 1];
        }
        return nums;
    }
}
