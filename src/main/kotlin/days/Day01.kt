package days

class Day01 : Day(1) {

    private var max = 0
    private val maxArray: MutableList<Int> = mutableListOf()

    private val calories = inputList.forEach {
        if(it == "" || inputList.indexOf(it) == inputList.size) {
            maxArray.add(max)
            max = 0
        } else max += it.toInt()
    }
    override fun part1() : Any {
        return maxArray.maxOf { it }
    }

    override fun part2() : Any {
        return maxArray.sorted().takeLast(3).sum()
    }
}