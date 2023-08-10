package com.github.AstethixOS.KotlinShell

object CommandParser {
    fun ParsePromptCommand(
        command: String
    ): TerminalCommand {
        val commandToParse = command.split(" ")
        if (commandToParse[0].isNotBlank()) {
            return if (BuiltInCommands.containsKey(commandToParse[0])) {
                BuiltInCommands[commandToParse[0]]!!
            } else {
                TerminalCommand(
                    code = {
                        PrintRaw("Command not found")
                    }
                )
            }
        } else {
            return TerminalCommand(
                code = {
                    PrintRaw("Command not found")
                }
            )
        }
    }
}