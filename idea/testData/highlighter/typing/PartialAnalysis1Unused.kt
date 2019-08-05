package idea.testData.highlighter.typing
// RUNTIME_WITH_FULL_JDK
// CHARS: 'val value = someFun3(count = 5)\n'
// INSPECTIONS: 'UnusedSymbol'

class <warning descr="Class \"PartialAnalysis1A\" is never used"><info descr="null" textAttributesKey="KOTLIN_CLASS">PartialAnalysis1A</info></warning> {
    fun <warning descr="Function \"someFun1\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun1</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info> {
        return (1..<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">joinToString</info>(",") { <info descr="null" textAttributesKey="KOTLIN_PARAMETER"><info descr="Automatically declared based on the expected type" textAttributesKey="KOTLIN_CLOSURE_DEFAULT_PARAMETER">it</info></info>.<info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toString</info>() }
    }

    fun <warning descr="Function \"someFun2\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun2</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info> {
        return (1..<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">sum</info>()
    }

    <info descr="null" textAttributesKey="KOTLIN_BUILTIN_ANNOTATION">private</info> fun <warning descr="Function \"someFun3\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun3</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info> {
        return (1..<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">fold</info>(1,  { <info descr="null" textAttributesKey="KOTLIN_PARAMETER">mul</info>, <info descr="null" textAttributesKey="KOTLIN_PARAMETER">next</info> -> <info descr="null" textAttributesKey="KOTLIN_PARAMETER">mul</info> * <info descr="null" textAttributesKey="KOTLIN_PARAMETER">next</info>})
    }

    <info descr="null" textAttributesKey="KOTLIN_BUILTIN_ANNOTATION">private</info> fun <warning descr="Function \"someFun4\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun4</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_TRAIT">Map</info><<info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>, <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info>> {
        val <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info> = <info descr="null" textAttributesKey="KOTLIN_PACKAGE_FUNCTION_CALL">mutableMapOf</info><<info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>, <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info>>()
        (1 .. <info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">forEach</info> { <info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info> ->
            <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info>[<info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info>] = <info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info>.<info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toString</info>()
        }
        return <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info>.<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">toMap</info>()
    }
}

class <warning descr="Class \"PartialAnalysis1B\" is never used"><info descr="null" textAttributesKey="KOTLIN_CLASS">PartialAnalysis1B</info></warning> {
    fun <warning descr="Function \"someFun1\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun1</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info> {
        return (1..<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">joinToString</info>(",") { <info descr="null" textAttributesKey="KOTLIN_PARAMETER"><info descr="Automatically declared based on the expected type" textAttributesKey="KOTLIN_CLOSURE_DEFAULT_PARAMETER">it</info></info>.<info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toString</info>() }
    }

    fun <warning descr="Function \"someFun2\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun2</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info> {
        return (1..<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">sum</info>()
    }

    <info descr="null" textAttributesKey="KOTLIN_BUILTIN_ANNOTATION">private</info> fun <warning descr="Function \"someFun3\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun3</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info> {
        return (1..<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">fold</info>(1,  { <info descr="null" textAttributesKey="KOTLIN_PARAMETER">mul</info>, <info descr="null" textAttributesKey="KOTLIN_PARAMETER">next</info> -> <info descr="null" textAttributesKey="KOTLIN_PARAMETER">mul</info> * <info descr="null" textAttributesKey="KOTLIN_PARAMETER">next</info>})
    }

    fun <warning descr="Function \"someFun4\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFun4</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_TRAIT">Map</info><<info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>, <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info>> {
        val <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info> = <info descr="null" textAttributesKey="KOTLIN_PACKAGE_FUNCTION_CALL">mutableMapOf</info><<info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>, <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info>>()
        (1 .. <info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">forEach</info> { <info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info> ->
            <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info>[<info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info>] = <info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info>.<info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toString</info>()
        }
        return <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info>.<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">toMap</info>()
    }

    <info descr="null" textAttributesKey="KOTLIN_BUILTIN_ANNOTATION">private</info> fun <warning descr="Function \"someFunN\" is never used"><info descr="null" textAttributesKey="KOTLIN_FUNCTION_DECLARATION">someFunN</info></warning>(<info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>: <info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>) : <info descr="null" textAttributesKey="KOTLIN_TRAIT">Map</info><<info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>, <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info>> {
        <caret>
        val <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info> = <info descr="null" textAttributesKey="KOTLIN_PACKAGE_FUNCTION_CALL">mutableMapOf</info><<info descr="null" textAttributesKey="KOTLIN_CLASS">Int</info>, <info descr="null" textAttributesKey="KOTLIN_CLASS">String</info>>()
        (1 .. <info descr="null" textAttributesKey="KOTLIN_PARAMETER">count</info>).<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">forEach</info> { <info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info> ->
            <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info>[<info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info>] = <info descr="null" textAttributesKey="KOTLIN_PARAMETER">v</info>.<info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toString</info>()
        }
        return <info descr="null" textAttributesKey="KOTLIN_LOCAL_VARIABLE">map</info>.<info descr="null" textAttributesKey="KOTLIN_EXTENSION_FUNCTION_CALL">toMap</info>()
    }

}

val <info descr="null" textAttributesKey="KOTLIN_CLASS">Long</info>.<warning descr="Property \"nsToMs\" is never used"><info descr="null" textAttributesKey="KOTLIN_EXTENSION_PROPERTY">nsToMs</info></warning> <info descr="null" textAttributesKey="KOTLIN_KEYWORD">get</info>() = (this * 1e-6).<info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toLong</info>()

val <info descr="null" textAttributesKey="KOTLIN_CLASS">Long</info>.<warning descr="Property \"asString\" is never used"><info descr="null" textAttributesKey="KOTLIN_EXTENSION_PROPERTY">asString</info></warning> <info descr="null" textAttributesKey="KOTLIN_KEYWORD">get</info>() = <info descr="null" textAttributesKey="KOTLIN_FUNCTION_CALL">toString</info>()
