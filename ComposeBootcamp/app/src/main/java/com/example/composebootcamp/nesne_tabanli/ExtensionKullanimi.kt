package com.example.composebootcamp.nesne_tabanli

fun main(){
    val sonuc = 5 carp 4
    println("Sonuç : $sonuc")
}

infix fun Int.carp(sayi:Int) : Int { // . dan sonraki isimlendirmede serbestsin, return tipini belirtmek zorunda değilsin bu extensionlarda
    return this*sayi
    // this = Int e karşılık gelir
}