package com.example.composebootcamp.Odev2

class Odev2Fonksiyonlar {

    // 1) Fahrenhiet Dönüştürücü
    fun fahrenhietDonusturucu(derece:Double) : Double {
        val fahrenhietDerece = (derece*1.8) + 32

        return fahrenhietDerece
    }

    // 2) Dikdörtgen çevre hesaplama
    fun dikdortgenCevreHesapla(kenar1:Int, kenar2:Int) {
        val dikdortgenCevresi = 2*kenar1 + 2*kenar2
        println("Kenar uzunlukları $kenar1 ve $kenar2 olan Dikdörtgenin çevre uzunluğu : $dikdortgenCevresi")
    }

    // 3) Faktoriyel hesaplama
    fun faktoriyelHesapla(sayi:Int) : Long {
        var i = 1
        var faktoriyel: Long = 1
        while (i <= sayi) {
            faktoriyel *= i.toLong()
            i++
        }
        return faktoriyel
    }

    // 4) Kelime içerisindeki "a" harfini saydırma
    fun aSayaci(kelime:String) {
        val aSayisi = kelime.count { it == 'a' || it == 'A' }

        println("'$kelime' Kelimesi içindeki a harfi sayısı : $aSayisi")
    }

    // 5) İç açılar toplamı bulma
    fun icAcilarToplamiHesapla(kenarSayisi:Int) : Int {
        val icAcilarToplami = (kenarSayisi - 2)* 180

        return icAcilarToplami
    }

    // 6) Maaş hesaplama
    fun maasHesapla(calisilanGunSayisi:Int) : Int {
        val maas: Int

        val gunlukCalismaSaati = 8
        val normalSaatUcreti = 10
        val mesaiSaatUcreti = 20
        val normalCalismaSaati = 160
        val toplamCalismaSaati = calisilanGunSayisi * gunlukCalismaSaati


        if ( toplamCalismaSaati <= normalCalismaSaati){
            maas = toplamCalismaSaati * normalSaatUcreti
        }else{
            val normalMaas = normalCalismaSaati * normalSaatUcreti

            val toplamMesaiSaati = toplamCalismaSaati - normalCalismaSaati
            val mesaiUcreti = toplamMesaiSaati * mesaiSaatUcreti

            maas = normalMaas + mesaiUcreti
        }
        return maas
    }

    // 7) Kota kullanım ücreti hesaplama
    fun kotaUcretiHesapla(kullanim:Int) :Int {
        val ucret: Int
        val kotaSiniri = 50

        if (kullanim <= kotaSiniri){
            ucret = 100
        }else{
            ucret = 100 + ((kullanim - kotaSiniri) * 4)
        }
        return ucret
    }
}