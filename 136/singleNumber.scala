object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        
        import scala.collection.mutable.Map
        import scala.util.control.Breaks._
        
        val m: Map[Int, Int] = Map()
        
        for(n <- nums){
            m.get(n) match {
                case Some(v) => 
                  m(n) = v + 1
                case None =>
                  m += (n -> 1)
            }
        }
        
        var res = -1
        breakable {
          for(n <- nums){
              if(m(n) == 1){
                  res = n
                  break
              }
          }
        }
        
        res
        
//  Limit time exceeded       
//        var res = nums(0)
//        if(nums.length == 1)
//          res
//        else {
//            for(i <- 1 until nums.length){
//                res = res ^ nums(i)
//            }
//            
//            res
//        }
    }
}
