package com.github.AstethixOS.KotlinShell

class CommandOutput(
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