object Solution {
    def matrixReshape(nums: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
        val h = nums.length
        val w = nums(0).length
       
        if(h * w != r * c) 
          nums
        else {
            val a: Array[Array[Int]] = Array.ofDim[Int](r, c)
            
            var x: Int = 0
            var y: Int = 0
            
            for(i <- 0 until r){
                for(j <- 0 until c){
                    a(i)(j) = nums(y)(x)
                    
                    x = x + 1
                    if(x == w){
                        x = 0
                        y = y + 1
                    }
                }
            }
            
            a
        }
    }
}
