package com.example.luckydicerollgame

fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    if (rollResult == luckyNumber) {
        println("You win!")
    } else {
        println("You didn't win, try again!")
    }
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

