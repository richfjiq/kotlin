package com.richdev.firstkotlinprogram

fun main(args: Array<String>) {
    print("Please enter the first number : ")
    val number1: Int = readln().toInt()
    print("Please enter the second number : ")
    val number2: Int = readln().toInt()
    show(number1, number2)
    val a = add(number1, number2)
    println("Sum of the two numbers = $a")
    val b = findMinimumNumber(number1, number2)
    println("The minimum number is $b")
}

fun show(num1: Int, num2: Int)
{
    println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int): Int
{
    var sum: Int = 0
    sum = num1 + num2
    return sum
}

fun findMinimumNumber(num1: Int, num2: Int): Int
{
    var minimum: Int
    if (num1 > num2) {
        minimum = num2
    }
    else
    {
        minimum = num1
    }
    return minimum
}