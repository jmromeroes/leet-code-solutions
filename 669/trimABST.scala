/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    def trimBST(root: TreeNode, L: Int, R: Int): TreeNode = {
        
        var r: TreeNode = root
        
        if(root == null)
          return null
        
        if(root.value < L){
            r = trimBST(root.right, L, R)      
        } else if(root.value > R) {
            r = trimBST(root.left, L, R)
        } else {
            r.right = trimBST(root.right, L, R)
            r.left  = trimBST(root.left, L, R)
        }
        
        r
    }
}
