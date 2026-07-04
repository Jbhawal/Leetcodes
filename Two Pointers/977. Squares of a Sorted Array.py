class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n=len(nums)
        res=[0]*n
        i=0
        j,k =n-1, n-1
        while i<=j:
            if nums[j]*nums[j]> nums[i]*nums[i]:
                res[k]=nums[j]*nums[j]
                k-=1
                j-=1
            else:
                res[k]=nums[i]*nums[i]
                k-=1
                i+=1    
        return res
        