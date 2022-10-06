package com.example.kotlinbasics.assignments

fun main() {
    print("D1 :")
    var D1= readln().toInt()

    print("D2 : ")
    var D2= readln().toInt()

    print("S1 :")
    var S1= readln().toString()
    println(clc(D1, D2, S1))

}


fun clc(D1: Int, D2: Int, S1:String): Int {

    val result=  when(S1){
        "+"->{
            D1+D2
        }
        "-"->{
            (D1-D2)
        }
        "*"->{
            D1*D2
        }
        "*"->{
            D1/D2
        }else ->{
            0
        }

    }
    return result
}