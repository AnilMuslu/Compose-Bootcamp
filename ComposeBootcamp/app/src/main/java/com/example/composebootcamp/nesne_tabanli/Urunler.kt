package com.example.composebootcamp.nesne_tabanli

class Urunler(var id: Int, var ad: String, var fiyat: Int) {


    init { // başka yerlerde constructor olarak geçer
        // bu sınıftan nesne oluşturulduğu anda bu çalışır
        println("Nesne oluşturuldu.")

    }

    fun bilgiAl(){
        println("------------------")
        println("Id    : ${id}")
        println("Ad    : ${ad}")
        println("Fiyat : ${fiyat} TL")

        // this.ad gibi this demek burada bulunduğu sınıfın nesnesini temsil eder
        // super keywordu ise kalıtım yoluyla gelen üst sınıfı temsil eder
    }
}