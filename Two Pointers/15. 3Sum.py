class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        n = len(nums)
        res = []
        if n == 3: 
            return [[nums[0], nums[1], nums[2]]] if nums[0] + nums[1] + nums[2] == 0 else []
        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i]>0:
                return []
            j = i + 1
            k = n - 1
            while j < k:
                total = nums[i] + nums[j] + nums[k]
                if total < 0:
                    j += 1
                elif total > 0:
                    k -= 1
                else:
                    res.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    # Skip duplicate second elements
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    # Skip duplicate third elements
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
        return res