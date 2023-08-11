package com.github.AstethixOS.KotlinShell

class Shell(
    private val exit: () -> Unit = {},
    private val onHistoryChange: () -> Unit = {}
) {
    val history: MutableList<CommandOutput> = mutableListOf()
    var currentDir: String = ""

    fun Execute(
        prompt: String
    ) {
        val promptPreparedToProcess = prompt.split(' ')
        val OutputIndex = history.size
        history.add(
            CommandOutput(
                prompt = prompt,
                dir = currentDir
            )
        )
        onHistoryChange.invoke()

        if (promptPreparedToProcess.isNotEmpty()) {
            val command = CommandParser.ParsePromptCommand(prompt)
            command.invoke(
                TerminalCommandScope(
                    api = TerminalAPI(
                        print = {
                            history[OutputIndex].PrintRaw(this)
                            onHistoryChange.invoke()
                        },
                        clear = {
                            history.clear()
                        },
                        exit = {
                            exit.invoke()
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