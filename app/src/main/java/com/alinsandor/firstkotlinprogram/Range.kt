package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {

    var myCharRange = 'a'.rangeTo('k');
    var myChar = 'k' in myCharRange;
    println(myChar);

}