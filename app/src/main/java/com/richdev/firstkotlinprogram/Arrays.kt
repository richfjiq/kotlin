package com.richdev.firstkotlinprogram

fun main(args: Array<String>) {
    val age = arrayOf(1,2,3,)
    println("First element of Array = " + age[0])
    println("Second element of Array = " + age.get(1))
    println("Third element of Array = " + age[2])
    println("----------------------------------------------")
    val cars = arrayOf("Mercedes", "BMW", "Opel")
    println("First element of cars Array = " + cars[0])
    println("Second element of cars Array = " + cars.get(1))
    println("Third element of cars Array = " + cars[2])
    println("----------------------------------------------")
    cars.set(2, "Honda")
    println("First element of cars Array = " + cars[0])
    println("Second element of cars Array = " + cars.get(1))
    println("Third element of cars Array = " + cars[2])
    println("----------------------------------------------")
    println("size of cars array = " + cars.size)
    val carsAndAge = arrayOf("Mercedes", 5, "Opel", 10)
    println("First element of carsAndAge Array = " + carsAndAge[0])
    println("Second element of carsAndAge Array = " + carsAndAge.get(1))
    println("Third element of carsAndAge Array = " + carsAndAge[2])
    println("Third element of carsAndAge Array = " + carsAndAge[3])
    // Error: Index 4 out of bounds for length 4
    // carsAndAge.set(4, 20)
    // println("Third element of carsAndAge Array = " + carsAndAge[4])
}