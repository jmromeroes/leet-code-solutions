object Solution {
    import scala.util.control.Breaks._
    
    def checkIfEqual(A: String, pos: Int, B: String): Boolean = {
        val l: Int = A.length
        var c: Int = pos
        var c2: Int = 0
        do {
            if(A(c) != B(c2)){
                return false
            }
            
            c = c + 1
            c2 = c2 + 1
            if(c >= l){
                c = 0
            }
        } while(c2 != l - 1)
        
        return true
    }
    
    def rotateString(A: String, B: String): Boolean = {
        var b: Boolean = false
        
        if(A.length != B.length) 
          return false
        
        for {
            l <- 0 until A.length
        } yield {
            if(A(l) == B(0)){
                if(checkIfEqual(A, l, B)){
                    b = true
                }
            }
        }
        
        b
    }
}
