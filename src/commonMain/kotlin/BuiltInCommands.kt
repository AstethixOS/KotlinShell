var BuiltInCommands: Map<String, TerminalCommand> = mapOf(
    "print" to TerminalCommand {
        val arguments = (data["data"] as? List<*>)?.let {
            Print(*it.toTypedArray())
        }
    }
)