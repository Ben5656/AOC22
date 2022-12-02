package days

class Day02 : Day(2) {

    override fun part1() : Any {
        var score = 0

        inputSplitList.forEach { (opponent, you) ->
            when(opponent){
                "A" -> { // rock
                    if(you == "X") score += 1+3 // draw
                    if(you == "Y") score += 2+6 // win
                    if(you == "Z") score += 3+0 // loss
                }

                "B" -> { // paper
                    if(you == "X") score += 1+0 // loss
                    if(you == "Y") score += 2+3 // draw
                    if(you == "Z") score += 3+6 // win
                }

                "C" -> { // scissors
                    if(you == "X") score += 1+6 // win
                    if(you == "Y") score += 2+0 // loss
                    if(you == "Z") score += 3+3 // draw
                }
            }
        }
        return score
    }

    override fun part2() : Any {
        var score = 0

        inputSplitList.forEach { (opponent, you) ->
            when(opponent){
                "A" -> { // rock
                    if(you == "X") score += 3+0 // scissors + loss
                    if(you == "Y") score += 1+3 // rock + draw
                    if(you == "Z") score += 2+6 // paper + win
                }

                "B" -> { // paper
                    if(you == "X") score += 1+0 // rock + lose
                    if(you == "Y") score += 2+3 // paper + draw
                    if(you == "Z") score += 3+6 // scissors + win
                }

                "C" -> { // scissors
                    if(you == "X") score += 2+0 // paper + loss
                    if(you == "Y") score += 3+3 // scissors + draw
                    if(you == "Z") score += 1+6 // rock + lose
                }
            }
        }
        return score
    }
}