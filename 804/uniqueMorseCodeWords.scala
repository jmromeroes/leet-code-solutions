object Solution {
    
    val morseAlph: List[String] = List(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    
    def buildMorseFromString(s: List[Char]): String = s match {
        case x :: xs => morseAlph(x - 97) + buildMorseFromString(xs)
        case Nil     => "" 
    }
    
    def uniqueMorseRepresentations(words: Array[String]): Int = {
        words.map(w => buildMorseFromString(w.toList)).distinct.length
    }
    
}
