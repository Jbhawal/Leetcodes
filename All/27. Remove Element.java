class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        int i=0, j=n-1, k=0;
        if(n==0) return 0 ;
        if(n==1 && nums[0]!=val) k++;       
    
        while(i<=j && n>1){
            
            if(nums[i]==val){
                if(nums[j]==val){
                    j--;
                }else{
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];
                k++;
                i++;
                j--; }
            }
            if(nums[i]!=val){
                k++;
               i++; 
            }
            
        }
        return k;
        
    }
}