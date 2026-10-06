class Solution:
    def trap(self, height: list[int]) -> int:
        n=len(height)
        l=0
        lmax=height[0]
        r=n-1
        rmax=height[n-1]
        total=0
        while l<r:
            if height[l]<=height[r]:
                total+=lmax-height[l]
                l+=1
                if height[l]>lmax:
                    lmax=height[l]
            else:
                total+=rmax-height[r]
                r-=1
                if height[r]>rmax:
                    rmax=height[r]
        return total
