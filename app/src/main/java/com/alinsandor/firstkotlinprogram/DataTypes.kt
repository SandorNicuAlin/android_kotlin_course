package com.alinsandor.firstkotlinprogram

fun main(args: Array<String>) {
    var a: Boolean = true
    var b: Char = 'R';
    var c: Byte = 12
    var d: Short = -356;
    var e: Int = 43543;
    var f: Long = -4324324324L;
    var g: Float = 5.6876F;
    var h: Double = 7.234234235233523;
    var i: String = "Hello";

    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(g)
    println(h)
    println(i)

    var longData: Long = 12312312;
    var byteData: Byte = longData.toByte();
    println(byteData);
}