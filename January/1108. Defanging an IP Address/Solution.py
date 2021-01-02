class Solution(object):
    def defangIPaddr(self, address: str):
        """
        :type address: str
        :rtype: str
        """
        return address.replace(".", '[.]')
                
obj = Solution()

address = "1.1.1.1"
print(address)

print(obj.defangIPaddr(address))
