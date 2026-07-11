class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        n=len(nums)
        nums.sort()
        i=0
        mini=float('inf')
        diff=float('inf')
        for i in range (n-2):
            j=i+1
            k=n-1
            if i>0 and nums[i]==nums[i-1]:
                continue
            while j<k:
                total= nums[i]+nums[j]+nums[k]
                ndiff=abs(total-target)
                if ndiff<=diff:
                    diff=ndiff
                    mini=total
                if total>target:
                    k-=1
                elif total<target:
                    j+=1
                else:
                    return target
        return mini
