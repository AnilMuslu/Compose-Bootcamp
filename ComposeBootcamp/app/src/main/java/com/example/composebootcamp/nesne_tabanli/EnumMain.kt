package com.example.composebootcamp.nesne_tabanli

fun main(){
    ucretHesapla(KonserveBoyut.ORTA, 55)
}

fun ucretHesapla(boyut:KonserveBoyut, adet:Int){
    when(boyut){ //boyuta göre ücret tarifesi seçmeye yarıcal
        KonserveBoyut.KUCUK -> println("Toplam maliyet : ${adet*130} ₺")
        KonserveBoyut.ORTA -> println("Toplam maliyet : ${adet*210} ₺")
        KonserveBoyut.BUYUK -> println("Toplam maliyet : ${adet*460} ₺")
    }
}