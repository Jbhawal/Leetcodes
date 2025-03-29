//brute force approach with O(n2) time complexity

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] arr= new int[n];
        
        for (int i=0; i<n; i++){
            int j=0;
            int prod=1;
            while(j<n){
                if(i==j){
                    j++;
                }
                else{
                    prod= prod*nums[j];
                    j++;
                }
                   
            }
            arr[i]= prod;
        }
        return arr;
    }
}