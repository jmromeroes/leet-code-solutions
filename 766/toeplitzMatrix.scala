object Solution {
    import scala.util.control.Breaks._
    
    def isToeplitzMatrix(matrix: Array[Array[Int]]): Boolean = {
        
        val h: Int = matrix.length
        val w: Int = matrix(0).length
                
        var b = true
        for(i <- 0 until h){
            
            breakable {
              for(j <- 0 until w){
                  var x = j
                  var y = i
                  
                  val v = matrix(y)(x)
                  
                  if(v == -1)
                    break
                        
                  while(x < w && y < h){
 
                    if(matrix(y)(x) !=  v)
                      b = false
 
                    matrix(y)(x) = -1                  

                    x = x + 1
                    y = y + 1  

                  }
                  
                  if(!b) break
              }
            }
        }
        
        b
    }
}
