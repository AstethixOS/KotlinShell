class Shell() {
    var currentDir: String = ""

    fun Execute(
        prompt: String
    ) {
        val promptPreparedToProcess = prompt.split(' ')
        if (promptPreparedToProcess.isNotEmpty()) {
            val command = CommandParser.ParsePromptCommand(prompt)
            command.invoke(
                TerminalCommandScope(
                    api = TerminalAPI(
                        print = {
                            println(this)
                        }
                    ),
                    data = promptPreparedToProcess.drop(1).joinToString(
                        separator = " "
                    )
                )
            )
        }
    }
}