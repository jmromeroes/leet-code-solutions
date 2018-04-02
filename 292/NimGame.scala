object Solution {
    def canWinNim(n: Int): Boolean = {
        if(n <= 3 || n % 4 != 0)
          true
        else 
          false
    }
}
