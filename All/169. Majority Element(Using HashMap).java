import java.util.*;

//! This is of O(n2logn) time complexity. Below there is another code using hashmap of only O(n) TC and SC.
//! remember this is better approach. Moore's Voting Altorithm is the best: TC= O(n) and SC=O(1)
class Solution {
    public int majorityElement(int[] v) {
        int n = v.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    
    }
}

//A slight better one
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            // Check if the current element is the majority element
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }
    return -1;
    }
}