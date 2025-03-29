class Solution {
    public int singleNumber(int[] nums) {
        // int n= nums.length;
        int xor=0;
        for (int num:nums){
            xor= xor^num;
        }
        return xor;
    }
}