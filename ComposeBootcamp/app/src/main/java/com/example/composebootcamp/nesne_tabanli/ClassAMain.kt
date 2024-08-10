package com.example.composebootcamp.nesne_tabanli

fun main(){

    val a = ClassA()

    //println(a.x)
    //a.metod()

    //mülakatlarda burada yanıltabilirler. Bu aşağıdaki ile static'i karıştırma
    //Virtual Object (Sanal Nesne, Nameless Object denebilir)
    //println(ClassA().x) //1.nesne
    //ClassA().metod() //2.nesne      yani bu şekilde isim verilmedi ama ClassA() ile farklı nesneler oluşturuldu
    // bu üsttekiler static ekledikten sonra hata vermeye başladı onlardan dolayı yorum parantezine alındı

    println(ClassA.x) //parantez yok burada buna dikkat, yoksa static parantez varsa sanal nesne
    ClassA.metod()
}