package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {

    // immutable
    println("---------immutable map of---------------")
    var ages: Map<String, Int> = mapOf<String, Int>("david" to 20, "ronaldo" to 25);

    println("Age of David : ${ages["david"]}");
    println("Age of Ronaldo : ${ages["ronaldo"]}");

    println(ages);

    // mutable
    var mutableAges: MutableMap<String, Int> = mutableMapOf<String, Int>("david" to 20, "ronaldo" to 25);

    mutableAges.put("buffon", 30);

    println("---------mutable map of---------------")

    println("Age of David : ${mutableAges["david"]}");
    println("Age of Ronaldo : ${mutableAges["ronaldo"]}");
    println("Age of Buffon : ${mutableAges["buffon"]}");

    println(mutableAges);
}