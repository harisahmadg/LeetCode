class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def deepestLeavesSum(self, root: TreeNode) -> int:
        
        prev_level = []
        current_level = [root]  # these are treated as queues

        while len(current_level) > 0:
            next_level = []

            for node in current_level:
                if node.left:
                    next_level.append(node.left)
                if node.right:
                    next_level.append(node.right)
                
            # update previous level as current traversal queue 
            # update current traversal queue as next level queue
            prev_level = current_level
            current_level = next_level

        # When the level-order-traversal is completed,
        # prev_level contains those nodes in deepest level
        # sum = 0
        # for i_node in prev_level:
        #     sum += i_node.val
        return sum(node.val for node in prev_level)

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
    -  Level Order or BFS(Breadth First Search)
    - go level by level
"""


