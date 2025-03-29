//better solution with O(n) time complexity and O(n) space complexity
// using hashmap

import java.util.HashMap;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                map.put(nums[i],1);
            }
        }
        for(int i=0; i<n; i++){
            if(map.get(i+1)== null || map.get(i+1)!=1){
                return i+1;
            }
        }
    
        return n+1;
    }

}