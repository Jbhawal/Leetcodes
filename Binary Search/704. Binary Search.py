class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n=len(nums)
        l=0
        u=n-1
        while(l<=u):
            mid=int((l+u)/2)
            if nums[mid]<target:
                l=mid+1
            elif nums[mid]>target:
                u=mid-1
            elif nums[mid]==target:
                return mid
        return -1