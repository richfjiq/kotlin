package com.richdev.firstkotlinprogram

/*
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
 */

fun main(args: Array<String>) {
    /*
    // small number to greater
     */
    var x: Byte = 127
    var y: Int = x.toInt()
    var z: Double = y.toDouble()

    println(x) // 127
    println(y) // 127
    println(z) // 127.0

    //    greater number to small number => data lost
    var a: Double = 132.32
    var b: Int = a.toInt()
    var c: Byte = b.toByte()

    println(a) // 132.32
    println(b) // 132
    println(c) // -124
}