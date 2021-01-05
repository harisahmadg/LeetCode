class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        
        nums = []
        while n != 0:
            nums.append(n%10)
            n  //= 10
        
        nums.reverse()

        sum, product = 0, 1

        for digit in nums:
            sum += digit
            product *= digit
        
        return product - sum


obj = Solution()
print(obj.subtractProductAndSum(4421))