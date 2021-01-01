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

myObject = Solution()

print(myObject.longestCommonPrefix(["Hi","Hehe"]))
