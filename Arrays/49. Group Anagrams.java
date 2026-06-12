class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict={}
        for word in strs:
            store=[0]*26
            for ch in word:
                idx=ord(ch)-ord('a')
                store[idx]+=1
            key=tuple(store)
            dict[key]=dict.get(key, [])+[word]
        return list(dict.values())
        