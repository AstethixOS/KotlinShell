import kotlin.reflect.KClass

class TerminalCommand(
    private val code: TerminalCommandScope.() -> Unit,
    val params: Map<String,KClass<*>>
) {
    constructor(code: TerminalCommandScope.() -> Unit) : this(code, mapOf())

    operator fun invoke(
        scope: TerminalCommandScope
    ) {
        code.invoke(scope)
    }
}