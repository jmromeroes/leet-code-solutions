object Solution {
    def letterCasePermutation(S: String): List[String] = {
        
        def innerLetterCasePermutation(S: List[Char], cs: String): List[String] = S match {
            case x :: xs =>
              if(x.isDigit)
                innerLetterCasePermutation(xs, cs + x)
              else
                innerLetterCasePermutation(xs, cs + x.toLower) ++ innerLetterCasePermutation(xs, cs + x.toUpper)
            case Nil =>
              List(cs)
        }                                                                  
        
        innerLetterCasePermutation(S.toList, "")
    }
}
