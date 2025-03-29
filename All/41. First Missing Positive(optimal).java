//most optimal solution with O(n) time complexity and O(1) space complexity
//using cyclic sort
//hint- You can optimize it using array indexing by placing each number at its correct index (nums[i] → nums[nums[i] - 1]) and then scanning for the first missing number. This reduces O(n) space to O(1) while keeping O(n) time complexity. 

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) {
                // swap nums[i] and nums[nums[i]-1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return n + 1;
    }
}
