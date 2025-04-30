package com.example.classe

fun Int.quadrado(): Int {
    return this * this
}

fun main() {

    val numero = 5
    val numero2= 60

    val resultado = numero.quadrado()
    val resultado2= numero2.quadrado()

    println(resultado)
    println(resultado2)

}
