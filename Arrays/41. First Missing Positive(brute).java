//brute force of O(n2) TC but didnt work for large inputs


class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        int flag=0;
        int fin=0;
        for (int i=0; i<n; i++){
            //int flag=0;
            for(int j=0; j<n;j++){
                if(nums[j]==i+1){
                    flag=1;
                    break;
                }
                flag=0;
            }
            fin= i+2;
            if(flag==0) return i+1;
        }
        return fin;
        
    }
}