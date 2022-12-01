package days

class Day01 : Day(1) {
    override fun part1() : Any {
        var max = 0
        val maxArray: MutableList<Int> = mutableListOf()
        inputList.forEach {
            if(it == "" || inputList.indexOf(it) == inputList.size) {
                maxArray.add(max)
                max = 0
            } else max += it.toInt()
        }
        return maxArray.maxOf { it }
    }

    override fun part2() : Any {
        var max = 0
        val maxArray: MutableList<Int> = mutableListOf()

        inputList.forEach {
            if(it == "" || inputList.indexOf(it) == inputList.size-1) {
                maxArray.add(max)
                max = 0
            } else max += it.toInt()
        }
        val max1 = maxArray.maxOf { it }
        maxArray.removeIf { it == max1 }
        val max2 = maxArray.maxOf { it }
        maxArray.removeIf { it == max2 }

        return max1 + max2 + maxArray.maxOf { it }
    }
}