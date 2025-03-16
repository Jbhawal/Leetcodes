class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int l=0, u=n-1, mid=0;
    
        while(l<=u){
            mid=l+(u-l)/2; // avoids overflow
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]) l=mid+1;
            else u=mid-1;
        }
        return l;
    }
}