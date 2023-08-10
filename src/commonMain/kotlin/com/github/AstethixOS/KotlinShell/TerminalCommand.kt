package com.github.AstethixOS.KotlinShell

class TerminalCommand(
    private val code: TerminalCommandScope.() -> Unit
) {
    operator fun invoke(
        scope: TerminalCommandScope
    ) {
        code.invoke(scope)
    }
}