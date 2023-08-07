class TerminalCommandScope(
    private val print: String.() -> Unit,
    val data: Map<String,Any> = mapOf()
) {
    constructor(print: String.() -> Unit,vararg data: Any) : this(print, mapOf("data" to data.toList()))

    fun Print(
        vararg it: Any?,
        splitter: String = " "
    ) {
        val input = it.toList()
        var conversionResult: String = ""
        for (a in input) {
            conversionResult += a.toString()
            if (a != input.last()) {
                conversionResult += splitter
            }
        }
        print.invoke(conversionResult)
    }

    fun PrintRaw(
        data: String
    ) {
        print.invoke(data)
    }
}