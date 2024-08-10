package com.example.composebootcamp.nesne_tabanli

fun main(){
    val urun1 = Urunler(1, "TV", 8999) // val değişmez demiştik ama burada sonra adı falan özellikleri değişiyor, yani ürünün kendisine değer atayamayız ürünü direkt değiştiremeyiz
    //Değer erişimi
    urun1.bilgiAl()
    //Değer atama
    urun1.ad = "TV Samsung"
    urun1.fiyat = 10000
    urun1.bilgiAl()

    val urun2 = Urunler(2, "Saat", 3000)
    //Değer erişimi
    urun2.bilgiAl()
}