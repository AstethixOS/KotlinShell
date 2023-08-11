package com.github.AstethixOS.KotlinShell

data class CommandOutput(
    val prompt: String,
    var lines: MutableList<String> = mutableListOf(),
    val dir: String = ""
) {
    fun PrintRaw(
        contents: String
    ) {
        println(contents)
        lines.add(contents)
    }
}