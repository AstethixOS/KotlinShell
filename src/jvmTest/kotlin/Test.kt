import org.junit.jupiter.api.Test

class Test() {
    @Test
    fun PrintTest() {
        var ShellInstance = Shell()
        ShellInstance.Execute("print hello world")
    }
}