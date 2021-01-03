class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x >= 0:
            flag = False
        else:
            x *= -1
            flag = True
        
        res = []        
        while x != 0:
            res.append(int(x%10))
            x //= 10
        
        ans = 0
        for digit in res:
            ans = (ans * 10) + digit
        
        if ans > 2**31 or ans < -2**31:
            return 0
        else:
            if flag:
                return -1 * ans
            else:
                return ans



obj = Solution()

print(obj.reverse(123))