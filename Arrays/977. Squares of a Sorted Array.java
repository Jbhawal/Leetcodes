class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        int i=0, j=0;
        while(i<n && nums[i]<0) i++;
        int r=i;
        int l=r-1;
        while(l>=0 && r<n){
            if(Math.abs(nums[l])<nums[r]){
                res[j++]=nums[l]*nums[l];
                l--;
            }
            else{
                res[j++]=nums[r]*nums[r];
                r++;
            }
        }
        while(l>=0){
            res[j++]=nums[l]*nums[l];
            l--;
        }
        while(r<n){
            res[j++]=nums[r]*nums[r];
            r++;
        }        
        return res;
    }
}