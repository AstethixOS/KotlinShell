package com.github.AstethixOS.KotlinShell

class Arguments(
    private val args: String
) {
    val raw = args
    val asList: List<String>
        get() = args.split(' ')
}