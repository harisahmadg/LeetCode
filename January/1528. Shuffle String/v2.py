from typing import List

class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        result = [''] * len(s)
        for i, v in enumerate(s):
            result[indices[i]] = v
        return "".join(result)

obj = Solution()

# s = "aiohn"
# indices = [3,1,4,2,0]

s = "codeleet"
indices = [4,5,6,7,0,2,1,3]

print(obj.restoreString(s, indices))


# USING ENUMERATE

# (i, v)
# (0, c)
# (1, o)
# (2, d)