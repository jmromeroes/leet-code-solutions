//Proof here http://applet-magic.com/digitsummod9.htm
object Solution {
    def addDigits(num: Int): Int = {
       if(num <= 9)
        num
       else if(num % 9 == 0)
        9
       else
        num % 9        
    }
}
