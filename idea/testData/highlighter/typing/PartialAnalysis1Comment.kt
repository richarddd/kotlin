
// RUNTIME_WITH_FULL_JDK
// CHARS: '// some comment\n'

class PartialAnalysis1A {
    fun someFun1(count: Int, separator: String = ", ") : String {
        return (1..count).toList().joinToString(separator) { it.toString() }
    }

    fun someFun1(count: Int) : String {
        return someFun1(count, ",")
    }

    fun someFun2(count: Int) : Int {
        return (1..count).sum()
    }

    fun someFun3(count: Int) : Int {
        return (1..count).fold(1,  { mul, next -> mul * next})
    }

    fun someFun4(count: Int) : Map<Int, String> {
        val map = mutableMapOf<Int, String>()
        (1 .. count).forEach { v ->
            map[v] = v.toString()
        }
        return map.toMap()
    }
}

class PartialAnalysis1B {
    fun someFun1(count: Int, separator: String = ", ") : String {
        return (1..count).toList().joinToString(separator) { it.toString() }
    }

    fun someFun1(count: Int) : String {
        return someFun1(count, ",")
    }

    fun someFun2(count: Int) : Int {
        return (1..count).sum()
    }

    fun someFun3(count: Int) : Int {
        return (1..count).fold(1,  { mul, next -> mul * next})
    }

    fun someFun4(count: Int) : Map<Int, String> {
        val map = mutableMapOf<Int, String>()
        (1 .. count).forEach { v ->
            map[v] = v.toString()
        }
        return map.toMap()
    }

    fun someFunN(count: Int) : Map<Int, String> {
        val foo = 1 <caret>
        val map = mutableMapOf<Int, String>()
        (1 .. count).forEach { v ->
            map[v] = v.toString()
        }
        return map.toMap()
    }

}

val Long.nsToMs get() = (this * 1e-6).toLong()

val Long.asString get() = toString()
