object Solution {
    def findLUSlength(a: String, b: String): Int = {
        if(a == b)
          -1
        else if(a.length == b.length)
          a.length
        else
          Math.max(a.length, b.length)
    }
}
