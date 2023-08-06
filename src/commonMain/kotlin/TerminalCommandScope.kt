class TerminalCommandScope(
    private val print: String.() -> Unit,
    private val data: Map<String,Any> = mapOf()
) {
    constructor(print: String.() -> Unit) : this(print, mapOf())

    fun Print(
        vararg it: Any
    ) {
        var conversionResult: String = ""
        for (i in it) {
            conversionResult += i.toString()
        }
        print.invoke(conversionResult)
    }

    fun PrintRaw(
        data: String
    ) {
        print.invoke(data)
    }
}