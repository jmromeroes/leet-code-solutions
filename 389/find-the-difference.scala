object Solution {
    def findTheDifference(s: String, t: String): Char = {
        val a: Array[Int] = new Array[Int](26)
        
    
        for(c <- s){
            a(c.toInt - 97) = a(c.toInt - 97) + 1
        }
        
        for(c <- t){
            a(c.toInt - 97) = a(c.toInt - 97) - 1
        }
       
        ((a.zipWithIndex.filter(_._1 != 0).head._2) + 97).toChar
    }
}
