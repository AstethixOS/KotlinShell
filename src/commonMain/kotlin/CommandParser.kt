object CommandParser {
    fun Parse(
        command: String
    ): TerminalCommand {
        var commandToParse = command.split(" ")
        if (commandToParse[0].isNotBlank()) {
            if (BuiltInCommands.containsKey(commandToParse[0])) {
                return BuiltInCommands[commandToParse[0]]!!
            } else {
                return TerminalCommand(
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