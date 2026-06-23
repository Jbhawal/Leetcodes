class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack=[]
        n=len(temperatures)
        res=[0]*n
        i=0
        while i<n:
            if not stack:
                stack.append(i)
                i+=1
            else:
                while stack and (temperatures[i]>temperatures[stack[-1]]):
                    popped=stack.pop()
                    res[popped]= i-popped
               
                stack.append(i)
                i+=1
        return res
