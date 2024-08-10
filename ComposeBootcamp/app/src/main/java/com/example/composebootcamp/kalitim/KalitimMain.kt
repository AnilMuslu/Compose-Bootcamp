package com.example.composebootcamp.kalitim

fun main(){
    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true, 50)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

}