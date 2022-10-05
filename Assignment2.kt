package com.example.kotlinbasics.assignments

fun main() {
    var number= arrayListOf(1.1 , 1.2, 1.3, 1.4, 1.5)
    var arraySize=number.size
    var sum=0.0

    for (i in 0 until  number.size){
        sum+=number[i]
    }

    println("average of number :"+(sum/arraySize))
}