
class Solution:
    def interpret(self, command: str) -> str:
        return command.replace("()", "o").replace("(al)", "al")

obj = Solution()

print(obj.interpret("G()(al)"))