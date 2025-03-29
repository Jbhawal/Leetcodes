import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxm= 0;
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
                maxm=Math.max(count,maxm);
        }
        return maxm;
    }
}