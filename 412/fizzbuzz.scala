object Solution {
    def fizzBuzz(n: Int): List[String] = {
        (1 to n).map{ n =>
            (n % 3, n % 5) match {
                case (0, 0) =>
                    "FizzBuzz"
                case (0, _) =>
                    "Fizz"
                case (_, 0) =>
                    "Buzz"
                case (_, _) =>
                    n.toString 
            }            
        }.toList
    }
}
