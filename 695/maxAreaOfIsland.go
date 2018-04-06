type Pos2d struct {
    x int
    y int
}

func checkMax(grid [][]int, b *[][] bool, pos Pos2d) int{

    if pos.x < 0 || pos.y < 0 || pos.x >= len(grid[pos.y]) || pos.y >= len(grid) {
      return 0
    } else if grid[pos.y][pos.x] == 0 || (*b)[pos.y][pos.x] {
      (*b)[pos.y][pos.x] = true
      return 0
    } else {
      res1 := 0
      res2 := 0
      res3 := 0
      res4 := 0

      (*b)[pos.y][pos.x] = true

      if pos.x > 0  && !(*b)[pos.y][pos.x - 1] {
        res1 = checkMax(grid, b, Pos2d{x: pos.x - 1, y: pos.y})
      }

      if pos.y > 0 && !(*b)[pos.y - 1][pos.x] {
        res2 = checkMax(grid, b, Pos2d{x: pos.x, y: pos.y - 1})
      }

      if pos.x < len(grid[pos.y]) - 1 && !(*b)[pos.y][pos.x + 1] {
        res3 = checkMax(grid, b, Pos2d{x: pos.x + 1, y: pos.y})
      }

      if pos.y < len(grid) - 1&& !(*b)[pos.y + 1][pos.x] {
        res4 = checkMax(grid, b, Pos2d{x: pos.x, y: pos.y + 1})
      }

      return (1 + res1 + res2 + res3 + res4)
    }
}

func maxAreaOfIsland(grid [][]int) int {
    b := [][]bool{}
    maxV := 0

    for i, h:= range grid {
        b = append(b, []bool{})
        for _, _ = range h {
            b[i] = append(b[i], false)
        }
    }

    for i, h := range grid {
        for j, _ := range h {
            va := checkMax(grid, &b, Pos2d{x: j, y: i})
            if va > maxV {
              maxV = va
            }
        }
    }

    return maxV
}
