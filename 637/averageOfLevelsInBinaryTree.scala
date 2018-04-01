/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    
    import scala.collection.mutable.Map
    
    def averageOfLevels(root: TreeNode): Array[Double] = {
        
        var m: Map[Int, List[Double]] = Map()
        
        var maxLevel: Int = 0
        
        def innerAverage(root: TreeNode, level: Int = 0): Unit = {
            if(root != null){
                m.get(level) match {
                    case None    => 
                        m += (level -> List(root.value.toDouble))
                    case Some(v) =>
                        m(level) = v :+ root.value.toDouble
                }
                
                if(level > maxLevel)
                  maxLevel = level
                
                innerAverage(root.left, level + 1)
                innerAverage(root.right, level + 1)
            }
        }
        
        innerAverage(root)
        
        var a: List[Double] = List()
        
        for(i <- 0 to maxLevel) {
            a = a :+ m(i).sum/m(i).length
        }
        
        a.toArray
    }
}
