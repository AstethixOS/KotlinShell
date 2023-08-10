package com.github.AstethixOS.KotlinShell

var BuiltInCommands: Map<String, TerminalCommand> = mapOf(
    "print" to TerminalCommand {
        Print(*args.asList.toTypedArray())
    },

    "exit" to TerminalCommand {
        Exit()
    },

    "clear" to TerminalCommand {
        Clear()
    }
)