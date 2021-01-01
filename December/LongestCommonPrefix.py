from collections import Counter
from typing import List
class Solution(object):
    def longestCommonPrefix(self, strs: List[str]) -> str:

        result = strs[0]
        i = 0
        for word in strs: 
            for char in word:
                for res in result:
                    if res != char:
                        result.replace(char, '')
                                
        return result

    
    def v2(self, strs: List[str]) -> str:
        for word in strs:
            for char in word:
                if strs[0]
        









myObject = Solution()
print(myObject.longestCommonPrefix)


