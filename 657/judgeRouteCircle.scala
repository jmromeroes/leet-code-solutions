object Solution {
    def judgeCircle(moves: String): Boolean = {
        var x = 0
        var y = 0
        
        moves.foreach( l =>
          l match {
            case 'U' =>
              y = y + 1
            case 'D' =>
              y = y - 1
            case 'R' =>
              x = x + 1
            case 'L' =>
              x = x - 1
          }
        )
        
        (x == 0) && (y == 0)
    }
}
