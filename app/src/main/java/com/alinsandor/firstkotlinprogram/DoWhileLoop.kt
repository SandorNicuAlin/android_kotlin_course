package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {

    var number: Int = 1;

    do {
        println("${number++}")
    } while (number <= 15)

}