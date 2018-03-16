object Solution {
    def islandPerimeter(grid: Array[Array[Int]]): Int = {
        var perimeter: Int = 0
        val h: Int = grid.length
        val w: Int = grid(0).length
        for{
            y <- 0 until h
            x <- 0 until w
        } yield {
            if(grid(y)(x) == 1){
                val left: Int  = x - 1
                val right: Int = x + 1
                val up: Int    = y - 1
                val down: Int  = y + 1
                
                if(left < 0 || grid(y)(left) == 0)
                  perimeter = perimeter + 1
                
                if(right == w || grid(y)(right) == 0)
                  perimeter = perimeter + 1
 
                if(up < 0 || grid(up)(x) == 0)
                  perimeter = perimeter + 1
                
                if(down == h || grid(down)(x) == 0)
                  perimeter = perimeter + 1
            }
        }
        
        perimeter
    }
}
