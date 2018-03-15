object Solution {
    def calPoints(ops: Array[String]): Int = {
        var l: List[Int] = List()
        var sum: Int = 0
        
        for(o <- ops){
            o match {
                case "C" =>
                    l = l match {
                        case x :: xs =>
                            sum = sum - x
                            xs
                        case Nil =>
                            Nil
                    }
                case "D" =>
                    l = l match {
                        case x :: xs =>
                            sum = sum + (x * 2)
                            (x*2) :: x :: xs
                        case Nil =>
                            Nil
                    }
                case "+" =>
                    l = l match {
                        case x :: x1 :: xs =>
                            sum = sum + (x + x1)
                            (x + x1) :: x :: x1 :: xs
                        case Nil =>
                            Nil
                    }
                case n   =>
                    sum = sum + n.toInt
                    l = n.toInt :: l              
            }
        }
        
        sum
    }
}
