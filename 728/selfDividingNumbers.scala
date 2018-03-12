object Solution {
    
    import scala.util.control.Breaks._
    
    def selfDividingNumbers(left: Int, right: Int): List[Int] = {
        var lRes: List[Int] = List()
        
        for(i <- left to right){
            val iAsString: String = i.toString
            var ib: Boolean = true
            
            breakable {
              for(l <- iAsString){
                if(l == '0' || i % (l.toInt - 48) != 0){
                    ib = false
                    break
                }                    
              }
            }
            
            if(ib)
              lRes = lRes ++ List(i)
        }
        
        lRes
    }
}
