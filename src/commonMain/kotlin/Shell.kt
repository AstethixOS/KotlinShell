class Shell() {
    var currentDir: String = ""

    fun Execute(
        prompt: String
    ) {
        CommandParser.Parse(prompt).invoke(
            TerminalCommandScope(
                api = TerminalAPI(
                    print = {
                        println(this)
                    },
                    exit = {
                        println("exited")
                    }
                )
            )
        )
    }
}