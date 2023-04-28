package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {
    print("Please enter the first number: ");
    var number1: Int = readLine()!!.toInt();

    print("Please enter the second number: ");
    var number2: Int = readLine()!!.toInt();

    show(number1, number2);

    var a = add(number1, number2);
    println("Sum of the numbers = $a");

    var b = findMinimumNumber(number1, number2);
    println("The minimum number is $b");
}

fun show(num1: Int, num2: Int): Unit {
    println("You entered $num1 and $num2");
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2;
}

fun findMinimumNumber(num1: Int, num2: Int): Int {
    return if(num1 < num2) num1 else num2;
}
