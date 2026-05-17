package com.richdev.firstkotlinprogram

fun main(args: Array<String>) {
    val mySetArray = arrayListOf<Any>("Kotlin", 2, 2.5, "K", true, "Kotlin")
    println("size = ${mySetArray.size}")
    println(mySetArray.last())
    println("+++++++++++++ set of +++++++++++++++")
    val mySetArray02 = setOf<Any>("Kotlin", 2, 2.5, "K", true, "Kotlin")
    println("size = ${mySetArray02.size}")
    println(mySetArray02.last())
}