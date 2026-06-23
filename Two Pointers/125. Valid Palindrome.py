class Solution:
    def isPalindrome(self, s: str) -> bool:
        arr=[]
        for ch in s:
            if ch.isalnum():
                chl=ch.lower()
                arr.append(chl)
        n=len(arr)
        i=0
        j=n-1
        while i<=j:
            if arr[i]==arr[j]:
                i+=1
                j-=1
            else:
                return False
        return True

        