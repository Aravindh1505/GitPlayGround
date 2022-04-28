package com.aravindh.gitplayground.programs

fun main() {

    var initialAmount = 1

    for (i in 1..30) {
        println("Day $i = $initialAmount")
        initialAmount *= 2
    }
}