object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        
        var zeros: List[Int] = List()
        for(i <- 0 until nums.length){
            if(nums(i) == 0){
                zeros = zeros :+ i  
            } else {
                if(!zeros.isEmpty){
                    val temp = nums(i)
                    nums(i) = nums(zeros(0))
                    nums(zeros(0)) = temp
                    zeros = zeros.tail :+ i
                }
            }
        }
    }
}
