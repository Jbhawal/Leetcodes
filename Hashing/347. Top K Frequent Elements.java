class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[n+1];
        for (int i=0; i<=n; i++){
            bucket[i]= new ArrayList<>();
        }
        for(int i : map.keySet()){
            bucket[map.get(i)].add(i);
        }
        // Step 4: Collect top k elements from buckets
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse from high frequency to low
        for (int i = n; i >= 0 && result.size() < k; i--) {
            for (int num : bucket[i]) {
                result.add(num);
                if (result.size() == k) break; // stop once we have k elements
            }
        }

        // Step 5: Convert List<Integer> to int[]
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = result.get(i);
        }

        return ans;

        
    }
}