class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        int count=0, max=0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                count=1;
                int current=num;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}