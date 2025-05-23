//KADANE's ALGORITHM.

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max= nums[0];
        for (int num:nums){
            sum += num; 
            max= (max>sum ? max: sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}