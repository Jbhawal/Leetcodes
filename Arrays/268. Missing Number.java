class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int xor1=0, xor2=0;
        for(int i=0; i<n; i++){
            xor2=xor2^nums[i];
            xor1= xor1^i+1;
        }
        return xor1^xor2;
    }
}

//another approach is you can add up all the nos in the given array and comapre with the summation of natural nos with n as given. the difference of the both will give the number. The problem with this method is that if the givem array is of very large size then adding up all the nos will be very large which would take long long type of integer losing the space complexity compeitition with the xor method

