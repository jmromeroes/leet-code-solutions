object Solution {
    
    import scala.collection.mutable.StringBuilder
    
    def reverseString(s: String): String = {
        
      var builder: StringBuilder = new StringBuilder()
      for(i <- 0 until s.length){
          builder = builder + s(s.length - i - 1) 
      } 
        
      builder.toString
    }
}
