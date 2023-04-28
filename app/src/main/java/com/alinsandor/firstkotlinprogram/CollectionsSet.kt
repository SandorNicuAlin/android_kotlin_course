package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {

    /*
    var mySetArray = arrayListOf<Any>("Kotlin", 2, 2.5, "K", true, "Kotlin");

    println(mySetArray.size)
    println(mySetArray.last())
     */

    var mySetArray: Set<Any> = setOf<Any>("Kotlin", 2, 2.5, "K", true, "Kotlin");

    println(mySetArray.size)
    println(mySetArray.last())

    println(mySetArray)
}