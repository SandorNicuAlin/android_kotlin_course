package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {
    var ages: ArrayList<Int> = ArrayList<Int>()

    ages.add(10);
    ages.add(1, 15);
    ages.add(20);

    println(ages)
    println("----")

    ages.remove(15);
    println(ages)

    var cars: ArrayList<String> = arrayListOf<String>("Opel", "BMW")

    println("-----")
    println(cars)

    var carsAndAges = arrayListOf<Any>("Opel", 20, "BMW", 15, false);

    println("-------")
    println(carsAndAges)
}