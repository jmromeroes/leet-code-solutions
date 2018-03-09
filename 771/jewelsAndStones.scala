object Solution {
    import scala.collection.mutable.HashSet
    
    def numJewelsInStones(J: String, S: String): Int = {
       var m: HashSet[Char] = HashSet()
       J.foreach { l => 
           m += l 
       }
       var res: Int = 0
        
       S.foreach { l =>
           m.contains(l) match {
               case true =>
                 res = res + 1
               case false => ()
           }           
       }
        
       res
    }
}
