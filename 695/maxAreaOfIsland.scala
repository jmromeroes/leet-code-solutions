object Solution {
        
    def checkMax(grid: Array[Array[Int]], b: Array[Array[Boolean]], pos: (Int, Int)): Int = {
      if(pos._1 < 0 || pos._2 < 0 || pos._1 >= grid(pos._2).length || pos._2 >= grid.length) 0
      else if (grid(pos._2)(pos._1) == 0 || b(pos._2)(pos._1)) {
          b(pos._2)(pos._1) = true
          0
      } else {
          val (res1, res2, res3, res4) = (
              checkMax(grid, b, (pos._1 - 1, pos._2)), 
              checkMax(grid, b, (pos._1, pos._2 - 1)),
              checkMax(grid, b, (pos._1 + 1, pos._2)),
              checkMax(grid, b, (pos._1, pos._2 + 1))
          )
                       
          1 +  res1 + res2 + res3 + res4
      }
    }
    
    def maxAreaOfIsland(grid: Array[Array[Int]]): Int = {
        grid.headOption match {
          case Some(h) =>
            val height: Int              = grid.length
            val width:  Int              = h.length
            val b: Array[Array[Boolean]] = Array.ofDim[Boolean](height, width)
            var maxV: Int                = 0
            for(i <- 0 until height){
                for(j <- 0 until width){
                    maxV = checkMax(grid, b, (j, i)) match {
                        case x if x > maxV => x
                        case _ => maxV
                    }
                }
            }
            maxV
          case None    => 0   
        }
    } 
}
