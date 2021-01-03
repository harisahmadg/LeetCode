# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def deepestLeavesSum(self, root: TreeNode) -> int:
        
        if not root.left and not root.right:
            return root.val
        else:
            temp = 0
            if root.left:
                temp = self.deepestLeavesSum(root.left)
            if root.right:
                temp += self.deepestLeavesSum(root.right)
            return temp

root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)
root.right.right = TreeNode(6)
root.left.left.left = TreeNode(7)
root.right.right.right = TreeNode(8)

obj = Solution()
print(obj.deepestLeavesSum(root))

"""" 
Thoughts
- Inorder traversal using recursion
- iterative solution
- if left and right = null then has to be deepest leaf
"""


# THIS SOLUTION RETURNS SUM OF ALL LEAVES NOT THE DEEPEST!!