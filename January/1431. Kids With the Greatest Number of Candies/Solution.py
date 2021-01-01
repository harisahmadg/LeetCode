class Solution():

    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        mostCandies = 0
        for candy in candies:
            if candy >= mostCandies:
                mostCandies = candy
        
        result = []

        for candy in candies:
            if (candy + extraCandies >= mostCandies):
                result.append(True)
            else:
                result.append(False)
        
        return result


obj = Solution()

candies = [2,3,5,1,3]
extraCandies = 3

print(obj.kidsWithCandies(candies, extraCandies))