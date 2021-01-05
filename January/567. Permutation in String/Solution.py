from typing import List


class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        
        possible_permutations = []


    def v2(self, s1: str, s2: str) -> bool:
        # back tracking

        possible_permutations = []
        self.permutations_helper(list(s1), possible_permutations, 0, len(s1))
        print(possible_permutations)

        for i in possible_permutations:
            if s2.__contains__(i):
                return True
        return False


    def permutations_helper(self, string: List[str], res: List[str], i: int, length: int):
        if i == length:
            res.append(''.join(string))
        else:
            for j in range(i, length):
                # swap
                string[i], string[j] = string[j], string[i]
                self.permutations_helper(string, res, i+1, length)
                string[i], string[j] = string[j], string[i]



obj =  Solution()
print(obj.v2("abc", "bbbca"))

# one way to do it is to import from itertools the permutations class/method 
# other is to do it manually, do backtracking algorithm on it (need to learn)