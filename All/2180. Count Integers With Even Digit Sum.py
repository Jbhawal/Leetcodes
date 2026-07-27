class Solution:
    def countEven(self, num: int) -> int:
        digit_sum = 0
        x = num

        while x:
            digit_sum += x % 10
            x //= 10

        return (num - digit_sum % 2) // 2