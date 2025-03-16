//O(n2) time complexity and O(n) space complexity
import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        for(int i=0; i<n; i++){
            int total=0;
            for(int j=0; j<n; j++){
                if (nums[j]<nums[i]){
                    total++;
                }
            }
            res[i]=total;
        }

        return res;
    }
}