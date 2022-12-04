package days

class Day04 : Day(4) {
    private val input = inputList.map { line ->
        line.split(",").map { it.split("-") }
        .map { it[0].toInt()..it[1].toInt() }
    }.map { (left, right) -> left to right }

    override fun part1() : Any {
        return input.count {
            val firstSet = it.first.toSet()
            val secondSet = it.second.toSet()
            firstSet.containsAll(secondSet) || secondSet.containsAll(firstSet)
        }
    }

    override fun part2() : Any {
        return input.count { it.first.intersect(it.second).any() }
    }
}