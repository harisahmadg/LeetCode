class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        max_wealth = 0
        for customer in accounts:
            wealth = 0
            for bank in customer:
                wealth += bank
            
            if wealth >= max_wealth:
                max_wealth = wealth
        
        return max_wealth

        
obj = Solution()

accounts = [[1,2,3],[3,2,1]]

print(obj.maximumWealth(accounts))