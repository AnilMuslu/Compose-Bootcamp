package com.example.composebootcamp.nesne_tabanli

class Fonksiyonlar {

    var mesaj:String? = null // nullable değişken olmasını sağlar
    lateinit var yazi:String //lateinit sadece "var" ile kullanılır. Bunu ben daha sonra tanımlayacağım diye söz vermektir. Tanımlamazsan çöker

    // lateinit var sayi:Int // Int gibi double gibi yapılarda (primitive) lateinit kullanılmaz

    // void : geri dönüş değeri olmayanlar
    // return olanlar: geri dönüş değeri olanlar

    //void örneği
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
        yazi = "Merhaba" // lateinit yerinde vaat ettiğimiz tanımlamayı yapma
    }

    // return örneği
    fun selamla2() : String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametre : yani dışarıdan bilgi almak anlamında, parantezi içerisinde bir değişken tanımlayacağız
    fun selamla3(isim:String){ //fonksiyondaki parametreye val var yazmana gerek yok
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading : Önemlidir, mülakatlarda bol bol sorulur
    //ayni fonksiyonu aynı isimle sınıf içerisinde tanımlamanı sağlar, ancak parametrelerin tipi farklı olmalıdır
    fun carp(sayi1:Int, sayi2:Int){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1:Double, sayi2:Double){
        println("Çarpma : ${sayi1*sayi2}")
    }

    fun carp(sayi1:Int, sayi2:Int, isim: String){
        println("Çarpma : ${sayi1*sayi2} - İşlem yapan : $isim")
    }
}