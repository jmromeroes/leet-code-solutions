object Solution {
    
    val m: Map[Char, Int] = Map(
        'a' -> 2,
        'b' -> 3,
        'c' -> 3,
        'd' -> 2,
        'e' -> 1,
        'f' -> 2,
        'g' -> 2,
        'h' -> 2,
        'i' -> 1,
        'j' -> 2,
        'k' -> 2,
        'l' -> 2,
        'm' -> 3,
        'n' -> 3,
        'o' -> 1,
        'p' -> 1,
        'q' -> 1,
        'r' -> 1,
        's' -> 2,
        't' -> 1,
        'u' -> 1,
        'v' -> 3,
        'w' -> 1,
        'x' -> 3,
        'y' -> 1,
        'z' -> 3
    )
    
    def findWords(words: Array[String]): Array[String] = {
        words.filter(w => w.toLowerCase.groupBy(m.get(_).get).keys.toList.length == 1)   
    }
}
