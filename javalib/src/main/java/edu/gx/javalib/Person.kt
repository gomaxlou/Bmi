package edu.gx.javalib

class Person {
    var weight = 0f
    var height = 0f

    fun getBmi(): Float {
        return weight / (height * height)
    }
}

fun main() {
    var p = Person()
    p.weight = 58f
    p.height = 1.64f
    println("Your BMI is:${p.getBmi()}")

}