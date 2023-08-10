package com.github.AstethixOS.KotlinShell

class TerminalAPI(
    val print: String.() -> Unit = {},
    val exit: () -> Unit = {},
    val clear: () -> Unit = {}
)