package idea.testData.highlighter.typing
// RUNTIME_WITH_FULL_JDK
// CHARS: 'val value = someFun3(count = 5)\n'
// INSPECTIONS: 'UnusedSymbol'

class PartialAnalysis1A {
    fun someFun1(count: Int) : String {
        return (1..count).joinToString(",") { it.toString() }
    }

    fun someFun2(count: Int) : Int {
        return (1..count).sum()
    }

    private fun someFun3(count: Int) : Int {
        return (1..count).fold(1,  { mul, next -> mul * next})
    }

    private fun someFun4(count: Int) : Map<Int, String> {
        val map = mutableMapOf<Int, String>()
        (1 .. count).forEach { v ->
            map[v] = v.toString()
        }
        return map.toMap()
    }
}

class PartialAnalysis1B {
    fun someFun1(count: Int) : String {
        return (1..count).joinToString(",") { it.toString() }
    }

    fun someFun2(count: Int) : Int {
        return (1..count).sum()
    }

    private fun someFun3(count: Int) : Int {
        return (1..count).fold(1,  { mul, next -> mul * next})
    }

    fun someFun4(count: Int) : Map<Int, String> {
        val map = mutableMapOf<Int, String>()
        (1 .. count).forEach { v ->
            map[v] = v.toString()
        }
        return map.toMap()
    }

    private fun someFunN(count: Int) : Map<Int, String> {
        <caret>
        val map = mutableMapOf<Int, String>()
        (1 .. count).forEach { v ->
            map[v] = v.toString()
        }
        return map.toMap()
    }

}

val Long.nsToMs get() = (this * 1e-6).toLong()

val Long.asString get() = toString()
