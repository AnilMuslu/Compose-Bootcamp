package com.example.composebootcamp.nesne_tabanli

fun main(){
    val f = Fonksiyonlar()

    f.selamla1() // fun intellisense ile tamamlarken tabloda en sağında Unit yazıyorsa bu metot void anlamındadır

    val gelenSonuc = f.selamla2() // bunun en sağında String yazıyordu mesela
    println("Gelen Sonuç: $gelenSonuc")

    f.selamla3("Zeynep") // bu içerisindeki değeri parametre olarak fonksiyonun tanımlandığı yere gönderdi

    f.carp(10, 20, "Merve") //isimli parametresi olan fonksiyonu seçtik

}