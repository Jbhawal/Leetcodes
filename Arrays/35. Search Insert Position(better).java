//okay solution with O(n) time complexity
//optimal has O(logn) time complexity

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target || nums[i]>target ){
                return i;
            }
            
        }
        return n;
    }
}