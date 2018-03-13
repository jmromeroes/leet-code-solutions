object Solution {
    def findComplement(num: Int): Int = {
      Integer.parseInt(num.toBinaryString.map(b => if(b == '1') '0' else '1'), 2)       
    }
}
