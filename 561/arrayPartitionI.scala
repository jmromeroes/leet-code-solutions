object Solution {
    def arrayPairSum(nums: Array[Int]): Int = {
        nums.sorted.sliding(2,2).toList.reverse.foldLeft(0)((acc, x) =>
          acc + x.min
        )
    }
}
