package com.example.composebootcamp.Odev2

fun main(){
    val f = Odev2Fonksiyonlar()

    // 1) Fahrenhiet Dönüştürücü
    val celciusDerece = 20.0
    val fahrenhietDerece = f.fahrenhietDonusturucu(celciusDerece)
    println("$celciusDerece Celcius derecenin Fahrenhiet Karşılığı : $fahrenhietDerece")

    // 2) Dikdörtgen çevre hesaplama
    val kenar1 = 3
    val kenar2 = 2
    f.dikdortgenCevreHesapla(kenar1, kenar2)

    // 3) Faktoriyel hesaplama
    val sayi = 4
    val faktoriyel = f.faktoriyelHesapla(sayi)
    println("$sayi sayısının faktoriyeli : $faktoriyel")

    // 4) Kelime içerisindeki "a" harfini saydırma
    val kelime = "Allan Saint Maximin"
    f.aSayaci(kelime)

    // 5) İç açılar toplamı bulma
    val kenarSayisi = 3
    val icAcilarToplami = f.icAcilarToplamiHesapla(kenarSayisi)
    println("Kenar sayısı $kenarSayisi olan şeklin iç açılar toplamı : $icAcilarToplami")

    // 6) Maaş hesaplama
    val calismaGunu = 21
    val maas = f.maasHesapla(calismaGunu)
    println("$calismaGunu gün çalışma ile alınacak toplam maaş: $maas TL")

    // 7) Kota kullanım ücreti hesaplama
    val kullanim = 51
    val ucret = f.kotaUcretiHesapla(kullanim)
    println("$kullanim GB internet kullanımının kota kullanım ücreti : $ucret")
}