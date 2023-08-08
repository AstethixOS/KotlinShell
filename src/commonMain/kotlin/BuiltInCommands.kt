var BuiltInCommands: Map<String, TerminalCommand> = mapOf(
    "print" to TerminalCommand {
        Print(*args.asList.toTypedArray())
    },

    "exit" to TerminalCommand {
        Exit()
    }
)