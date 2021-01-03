from typing import List

class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        result = indices[:]
        counter = 0
        for i in indices:
            result[i] = s[counter]
            counter += 1
        return "".join(result)

obj = Solution()

# s = "aiohn"
# indices = [3,1,4,2,0]

s = "codeleet"
indices = [4,5,6,7,0,2,1,3]

print(obj.restoreString(s, indices))