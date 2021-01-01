class Solution(object):

    name = "Haris"

    def romanToInt(self, s):
        result = 0
        for i in range(len(s)):
            result = result + self.convertToInt(s[i])
        return result



    def convertToInt(self, s):
        result = 0
        if s == "I":
            result = 1
        elif s == "V":
            result = 5
        elif s == "X":
            result = 10
        elif s == "L":
            result = 50
        elif s == "C":
            result = 100
        elif s == "D":
            result = 500
        elif s == "M":
            result = 1000
        return result


myObject = Solution()

print(myObject.romanToInt("IV"))

