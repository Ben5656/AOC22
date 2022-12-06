package days

class Day05 : Day(5) {

    /* Real implementation much more hard-coded and needs cleaning up before git posting when I get the chance */

    override fun part1() : Any {

        val stacks = mutableListOf<String>()
        stacks += "BSVZGPW"
        stacks += "JVBCZF"
        stacks += "VLMHNZDC"
        stacks += "LDMZPFJB"
        stacks += "VFCGJBQH"
        stacks += "GFQTSLB"
        stacks += "LGCZV"
        stacks += "NLG"
        stacks += "JFHC"

        inputList.forEach { line ->
            if(line.isNotEmpty()) {
                // move
                if(line[0] == 'm'){
                    val stripWhiteSpace = line.replace(" ", "")
                    val replaceWord = stripWhiteSpace.replace("move", "m").replace("from", "f").replace("to", "t")

                    val amt = replaceWord.substring(replaceWord.indexOf("m")+1, replaceWord.indexOf("f")).toInt()
                    val origin = replaceWord.substring(replaceWord.indexOf("f")+1, replaceWord.indexOf("t")).toInt()
                    val dest = replaceWord.substring(replaceWord.indexOf("t")+1, replaceWord.length).toInt()

                    if(amt >= 3){
                            stacks[dest - 1] = stacks[origin - 1].take(amt).reversed()
                            stacks[origin - 1] = stacks[origin - 1].drop(amt)
                    } else {
                            stacks[dest - 1] = stacks[origin - 1].take(amt)
                            stacks[origin - 1] = stacks[origin - 1].dropLast(1)
                    }
                }
            }
        }

        return stacks.toString()
    }

    override fun part2() : Any {

        return 0
    }
}