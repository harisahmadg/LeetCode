class Solution:
    def minPartitions(self, n: str) -> int:
        max = 0
        for digit in n:
            if int(digit) > max:
                max = int(digit)
        
        return max

obj = Solution()
print(obj.minPartitions("32"))



# take a number 9. Now how many one's would we need to add to get 9? obviously 9 ones.
# So its sure that the number of one's needed to get the digit or target number is equal to the target number.

# So if we want to form a number by deci-binary numbers(conatins only 0 and 1) we have to find the max digit in the string.Whatever we do       
# if max digit of string is 6 we have to minimum need six moves since six can be represnted as sum in one's by 1+1+1+1+1+1