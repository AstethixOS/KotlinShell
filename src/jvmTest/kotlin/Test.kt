import com.github.AstethixOS.KotlinShell.Shell
import org.junit.jupiter.api.Test

class Test() {
    @Test
    fun PrintTest() {
        var ShellInstance = Shell()
        ShellInstance.Execute("print hello world")
        for (i in ShellInstance.history) {
            print("${i.prompt} : ")
            for (i in i.lines) {
                print("${i}\n")
            }
        }
    }
}