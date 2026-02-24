class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int l=0 ,u=n-1;
        while(l<u){
            int sum=numbers[l]+numbers[u];
            if(sum>target) u--;
            else if(sum<target)l++;
            else if(sum== target){
                return new int[]{l+1,u+1};
            }

        }
        return new int[]{-1, -1};
    }
}