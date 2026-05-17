package com.richdev.firstkotlinprogram

fun main(args: Array<String>) {
    // Immutable collection - cannot make any changes to the array
    val age = mapOf<String, Int>("david" to 20, "ronaldo" to 25)
    println("++++++++++++++ IMMUTABLE ++++++++++++++++++")
    println("David's age : " + age["david"])
    println("Ronaldo's age : " + age["ronaldo"])
    println("++++++++++++++++++++++++++++++++")
    // Mutable collection
    val mutableAge = mutableMapOf<String, Int>()
    mutableAge["buffon"] = 30
    println("++++++++++++++ MUTABLE ++++++++++++++++++")
    println("Buffon's age : " + mutableAge["buffon"])
}