object Solution {
    
    import scala.annotation.tailrec
    
    def detectCapitalUse(word: String): Boolean = {
        
        @tailrec
        def innerDetectCapitalUse(word: List[Char], shouldBeUpper: Boolean, index: Int): Boolean = word match {
          case x :: xs =>
            if(index == 0 && x.isUpper){
                innerDetectCapitalUse(xs, true, 1)
            } else if(index == 1 && x.isLower){
                innerDetectCapitalUse(xs, false, 2)
            } else if(shouldBeUpper &&  x.isLower){
                false
            } else if(!shouldBeUpper && x.isUpper){
                false
            } else {
                innerDetectCapitalUse(xs, shouldBeUpper, index + 1)
            }
          case Nil =>
            true
        }
        
        innerDetectCapitalUse(word.toList, false, 0)
    }
}
xo
