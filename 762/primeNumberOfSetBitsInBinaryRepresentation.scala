object Solution {
    def countPrimeSetBits(L: Int, R: Int): Int = {
        
        def countBits(n: Int): Int = {
           var n2: Int  = n
           var res: Int = 0
            
          while(n2 != 0){
               //This operation removes the less significant 1 of the binary representation so this takes O(numberOfBits)
               n2 = n2 & n2-1
               res = res + 1
           }  
            
           res
        }
        
        var res: Int = 0
      for(i <- L to R){
        //R <= 1000000 so there's a maximum of 20 bits and we only require the primes
        if(List(2,3,5,7,11,13,17,19).contains(countBits(i)))
              res = res + 1
        }
        
        res
    }
}
