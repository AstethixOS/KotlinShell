class TerminalCommandScope(
    private val api: TerminalAPI,
    private val data: String = ""
) {
    var args: Arguments = Arguments(data)
    fun Print(
        vararg it: Any?,
        splitter: String = " "
    ) {
        val input = it.toList()
        api.print.invoke(
            input.joinToString(
                separator = splitter
            )
        )
    }

    fun PrintRaw(
        data: String
    ) {
        api.print.invoke(data)
    }

    fun Exit() {
        api.exit.invoke()
    }

}