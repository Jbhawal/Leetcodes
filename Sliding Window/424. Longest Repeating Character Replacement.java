class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        n=len(s)
        if n==k:
            return n
        i=0
        j=0
        count=0
        diff=0
        freqDict={}
        while j<n:
            freqDict[s[j]]= freqDict.get(s[j],0)+1
            total= sum(freqDict.values())
            maxi= max(freqDict.values(), default=0)
            diff= total- maxi
            while diff>k:
                freqDict[s[i]]-=1
                i+=1
                total= sum(freqDict.values())
                maxi= max(freqDict.values(), default=0)
                diff= total- maxi
            count=max(count, j-i+1)
            j+=1
            
        return count