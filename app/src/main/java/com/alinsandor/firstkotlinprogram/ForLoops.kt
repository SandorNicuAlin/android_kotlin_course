package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {

//    for (number in 1..10) {
//        println(number);
//    }

//    var sum: Int = 0;
//    for (x in 0..5) {
//        println(x)
//        sum += x;
//    }
//    println("sum: $sum");

//    var sum: Int = 0;
//    for (x in 0..10) {
//        if(x % 2 == 0) {
//            println(x)
//            sum += x;
//        }
//    }
//    println("sum of even numbers: $sum");

//    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10);
//    for (y in myNumberArray) {
//        println(y);
//    }

//    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10);
//    for (y in 0..(myNumberArray.size)-1) { //    for (y in 0 until (myNumberArray.size)) {
//        println("myNumberArray[$y] = ${myNumberArray[y]}");
//    }

//    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10);
//    for (y in myNumberArray.indices) {
//        println("myNumberArray[$y] = ${myNumberArray[y]}");
//    }

    // for each
    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10);
    myNumberArray.forEach { println(it) }

}