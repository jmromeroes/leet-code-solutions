object Solution {
    
    import scala.collection.mutable.HashSet
    
    def distributeCandies(candies: Array[Int]): Int = {
        val m: HashSet[Int] = HashSet()
        var lDifferent: Int = 0
        var lSame: Int = 0
        for(c <- candies){
            m.contains(c) match {
                case true =>
                  lSame = lSame + 1
                case false =>
                  lDifferent = lDifferent + 1
                  m += c
            }
        }
        
        if(lDifferent <= lSame){
            lDifferent
        } else {
            (lDifferent + lSame)/2
        }
    }
}
