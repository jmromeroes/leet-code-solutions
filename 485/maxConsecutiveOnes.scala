object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
        
        var max: Int   = 0
        var b: Boolean = false
        var count: Int = 0
        
        for(n <- nums){
            if(b && n == 0){
                b = false
                
                count = 0
            } else if((!b && n == 1) || (b && n == 1)){
                count = count + 1
                
                if(count > max)
                  max = count
               
                b = true
            }
        }
        
        max
    }
}
