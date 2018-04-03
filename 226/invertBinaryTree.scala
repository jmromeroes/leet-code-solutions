/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    def invertTree(root: TreeNode): TreeNode = {
    
        if(root != null) {
            invertTree(root.left)
            invertTree(root.right)
            
            val t = root.left
            root.left = root.right
            root.right = t
        }
        
        root
    }
}
