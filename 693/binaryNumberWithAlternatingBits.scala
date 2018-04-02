object Solution {
    def hasAlternatingBits(n: Int): Boolean = {
        val s: String = n.toBinaryString
        
        if(s.length == 1)
          true
        else 
          s.sliding(2).foldLeft(true)((acc, v) => acc && (v(0) != v(1)))
    }
}
