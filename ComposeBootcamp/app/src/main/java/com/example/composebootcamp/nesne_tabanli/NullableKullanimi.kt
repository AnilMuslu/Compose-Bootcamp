package com.example.composebootcamp.nesne_tabanli

fun main(){
    // Nullable, Null Safety denir

    // var mesaj = "Merhaba" // ben bunu baştan içerisine değer aktarmadan yapmak istiyorum
    var mesaj:String? = null // sonuna soru işareti koymak null özelliği alabilen değişkeni tanımlarken kullanılmalıdır

    mesaj = "Merhaba" // bu tanımı vermezsek aşağıdaki yöntem 2 null yazdırır ama program çökmez

    // Yöntem 2
    println("Yöntem 1 : ${mesaj?.uppercase()}") //Nullable sayesinde değişkenin null olup olmadığını tekrar kontrol etmemizi sağlar

    // Yöntem 2
    println("Yöntem 2 : ${mesaj!!.uppercase()}") // Bu şekilde !! kullanımı sorun olmayacağını taahhüt etmek anlamındadır. Çökme yaşanabilir. Eminsen kullan

    // Yöntem 3
    if (mesaj != null){
        println("Yöntem 3 : ${mesaj.uppercase()}")
    }else{
        println("Yöntem 3 : Sonuç Null")
    }

    // Yöntem 4
    mesaj?.let {
        println("Yöntem 4 : ${it.uppercase()}") // yukarıdaki mesaj tanımını kapatırsan sonuç değişir, dene
    }
}