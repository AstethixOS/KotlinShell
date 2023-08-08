class TerminalAPI(
    val print: String.() -> Unit = {},
    val exit: () -> Unit = {}
)