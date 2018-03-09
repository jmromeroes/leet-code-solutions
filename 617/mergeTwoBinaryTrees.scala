/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
       
         (t1, t2) match {
              case (null, t) =>
                t
              case (t, null) => 
                t
              case (t1, t2)  => 
                val tr: TreeNode = TreeNode(t1.value + t2.value)
                
                tr.left  = mergeTrees(t1.left, t2.left)
                tr.right = mergeTrees(t1.right, t2.right)
                tr
              case _         =>
                null
          }
        
   }
}
