package com.example.myapplication

fun withoutParamaeter(){
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argumet
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

