package com.example.classe

fun String.toLetterList(): List<String> {
    return this.map { it.toString() }

}

fun main(){
    val nome=  ("Hevellyn")
    val nome2 = ("Danilo")
    val letras = nome.toLetterList()
    val letras2= nome2.toLetterList()
    println(letras)
    println(letras2)

}
