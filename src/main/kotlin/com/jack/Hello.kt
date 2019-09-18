package com.jack

import javax.print.DocFlavor

fun main() {
//    println("Hello World! by KT");
    val theHuman = Human();
    theHuman.Hello();
    val age : Int = 19;
    var weigth  = 66.5f;
    val name = "jack";

}

class Human {
    fun Hello() {
        println("Hello World! by KT");
    }
}