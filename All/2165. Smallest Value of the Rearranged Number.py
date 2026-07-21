class Solution:
    def smallestNumber(self, num: int) -> int:
        count=[0]*10
        if num==0 :
            return 0
        no=abs(num)
        while no > 0:
            dig=no%10
            count[dig]+=1
            no //= 10
        if num>0:
            for d in range(1, 10):
                if count[d]:
                    ans=d
                    count[d]-=1
                    break
            for d in range(0,10):
                while count[d]:
                    ans=ans*10+d
                    count[d]-=1
            return ans
        else:
            ans=0
            for d in range(9,-1,-1):
                while count[d]:
                    ans=ans*10+d     
                    count[d]-=1 
            return -ans