package days

class Day06 : Day(6) {
    override fun part1() : Any {
        inputList.forEach {
            val window = it.windowed(4, 1)
            window.forEachIndexed { index, s ->
                if(uniqueChars(s, 1)) {
                    return index+4
                }
            }
        }
        return 0
    }

    override fun part2() : Any {
        inputList.forEach {
            val window = it.windowed(14, 1)
            window.forEachIndexed { index2, s ->
                if(uniqueChars(s, 2)) {
                    return index2+14
                }
            }
        }
        return 0
    }

    private fun uniqueChars(s: String, part: Int) : Boolean {
        return if(part == 1) s.toSet().size == 4
        else s.toSet().size == 14
    }
}