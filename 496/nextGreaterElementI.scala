object Solution {
    
    import scala.util.control.Breaks._
    
    def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
        val m: Map[Int, Int] = nums2.zipWithIndex.toMap
        val l: Int = nums2.length
        var res: List[Int] = List()
        
        for(n <- nums1){
            var b: Boolean = true
            
            breakable {
                for(i <- m(n) until l){
                    if(nums2(i) > n){
                        b = false
                        res = res :+ nums2(i)
                        break
                    }
                    
                }
            }
            
            if(b)
                res = res :+ (-1)
        }
        
        res.toArray
        
    }
}
