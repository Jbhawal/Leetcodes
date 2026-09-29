class Solution:
    def maxArea(self, height: list[int]) -> int:
        n= len(height)
        l=0
        r=n-1
        area=0
        while (l<r):
            h=min(height[l], height[r])
            b= r-l
            area= max(area, h*b)
            if (height[l]<= height[r]):
                l+=1
            else:
                r-=1
        return area