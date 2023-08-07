import kotlin.reflect.KClass

class TerminalCommand(
    val params: Map<String,KClass<*>>,
    private val code: TerminalCommandScope.() -> Unit
) {
    constructor(code: TerminalCommandScope.() -> Unit) : this(mapOf(), code)

    operator fun invoke(
        scope: TerminalCommandScope
    ) {
        code.invoke(scope)
    }
}