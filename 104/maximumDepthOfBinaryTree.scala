    /**
     * Definition for a binary tree node.
     * class TreeNode(var _value: Int) {
     *   var value: Int = _value
     *   var left: TreeNode = null
     *   var right: TreeNode = null
     * }
     */
    object Solution {
        def maxDepth(root: TreeNode): Int = {
            def innerMaxDepth(root: TreeNode, n: Int = 0): Int = {
                if(root == null){
                    n
                } else {
                    Math.max(innerMaxDepth(root.left, n + 1), innerMaxDepth(root.right, n + 1))                
                }
            }

            innerMaxDepth(root)
        }
    }
