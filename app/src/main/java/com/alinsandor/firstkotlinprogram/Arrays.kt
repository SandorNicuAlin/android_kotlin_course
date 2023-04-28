package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {
    var ages: Array<Int> = arrayOf(1, 2, 3);

    println("First element of the array = ${ages[0]}")
    println("Second element of the array = ${ages.get(1)}")
    println("Third element of the array = ${ages[2]}")

    println("---------------------------------------")

    var cars: Array<String> = arrayOf("Mercedes", "BMW", "Opel")

    println("First element of cars array = ${cars[0]}")
    println("Second element of cars array = ${cars[1]}")
    println("Third element of cars array = ${cars[2]}")

    println("---------------------------------------")

    cars.set(2, "Ford");

    println("First element of cars array = ${cars[0]}")
    println("Second element of cars array = ${cars[1]}")
    println("Third element of cars array = ${cars[2]}")

    println("---------------------------------------")

    println("Size of cars array = ${cars.size}")

    var carsAndAge = arrayOf("Merceder", 5, "Opel", 10)

    println("---------------------------------------")

    println("First element of carsAndAge array = ${carsAndAge[0]}")
    println("Second element of carsAndAge array = ${carsAndAge[1]}")
    println("Third element of carsAndAge array = ${carsAndAge[2]}")
    println("Third element of carsAndAge array = ${carsAndAge[3]}")

    carsAndAge.set(4, 20);

}