//Using Boyer Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int num=nums[0];
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                num = nums[i];
                count = 1;
            } 
            else if (nums[i] == num) {
                count++;
            } 
            else count--;
        }
        return num;
    }
}