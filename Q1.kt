package com.example.kotlinbasics.solution

fun main() {
    //Q1
    for(number in 1..100){
        //println(number)
        if(number == 71){
            println("Its Over")
        }else{
            println(number)
        }
    }
    // Q2
    var temp = 35
    while (temp>=10) {
        when (temp) {
            30 -> {
                println("It’s Hot")
            }

            20 -> {

                println("It’s Comfy")
            }
            15 -> {

                println("IT'S COLD!!! ")
            }else-> {
            println("just the tempe $temp")
            }

        }
        temp--
}
}