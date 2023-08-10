package com.github.AstethixOS.KotlinShell

class Shell() {
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

        if (promptPreparedToProcess.isNotEmpty()) {
            val command = CommandParser.ParsePromptCommand(prompt)
            command.invoke(
                TerminalCommandScope(
                    api = TerminalAPI(
                        print = {
                            history[OutputIndex].PrintRaw(this)
                        },
                        clear = {
                            history.clear()
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