import org.junit.jupiter.api.Test

class Test() {
    @Test
    fun PrintTest() {
        BuiltInCommands["print"]?.invoke(
            TerminalCommandScope(
                print = { println(this) },
                "hello",
                "world"
            )
        )
    }
}