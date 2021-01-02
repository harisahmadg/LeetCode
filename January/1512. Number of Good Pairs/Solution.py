class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        result = 0
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i != j and nums[i] == nums[j] and i < j:
                    result += 1
        return result

obj = Solution()

nums = [1,2,3,1,1,3]

print(obj.numIdenticalPairs(nums))