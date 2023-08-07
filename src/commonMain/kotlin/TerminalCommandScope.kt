class TerminalCommandScope(
    private val api: TerminalAPI,
    val data: Map<String,Any> = mapOf()
) {
    constructor(api: TerminalAPI,vararg data: Any) : this(api, mapOf("data" to data.toList()))

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
        api.print.invoke(conversionResult)
    }

    fun PrintRaw(
        data: String
    ) {
        api.print.invoke(data)
    }
}