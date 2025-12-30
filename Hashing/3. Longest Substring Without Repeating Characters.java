// ! approach using HashSet
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i, j=0, maxL=0;
        int n= s.length();
        HashSet<Character> set = new HashSet<>();
        for (i=0; i<n; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxL= Math.max(maxL, i-j+1);
        }
        return maxL;
    }
}

//! another approach using HashMap
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
