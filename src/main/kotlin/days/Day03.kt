package days

class Day03 : Day(3) {
    override fun part1(): Any {
        var output = 0
        inputList.forEach { line ->
            val comp1 = line.substring(0, line.length / 2)
            val comp2 = line.substring(line.length / 2, line.length)
            comp1.toList().intersect(comp2.toList().toSet()).forEach {
                output += elfVal(it)
            }
        }

        return output
    }

    override fun part2(): Any {
        var output = 0
        for (i in inputList.indices) {
            if (i % 3 == 0) {
                inputList[i].toList().intersect(inputList[i + 1].toList().intersect(inputList[i + 2].toList().toSet())).forEach {
                    output += elfVal(it)
                }
            }
        }
        return output
    }

    private fun elfVal(input: Char): Int {
        return if (input.isUpperCase()) input.code.toByte().toInt() - 38 else input.code.toByte().toInt() - 96
    }
}