//Not the best solution but still passes

object Solution {
    def hammingDistance(x: Int, y: Int): Int = {
        var r: Int = 0
        var r2: Int = 0
        val xBinStr: String = x.toBinaryString
        val yBinStr: String = y.toBinaryString
        val lengthDifference: Int = xBinStr.length - yBinStr.length
        
        val (longest, shortest) = 
          if(lengthDifference >= 0) 
            (xBinStr, yBinStr)
          else
            (yBinStr, xBinStr)
        for {
          i <- Math.abs(lengthDifference) until longest.length  
        } yield {  
          if(longest(i) != shortest(i - Math.abs(lengthDifference))) 
            r = r + 1    
        }
        
        for {
          i <- 0 until Math.abs(lengthDifference)  
        } yield {
            if(longest(i) == '1')
              r2 += 1
        }
        r + r2
    }
}
