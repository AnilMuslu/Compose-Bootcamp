package com.example.composebootcamp.nesne_tabanli.paket2

import com.example.composebootcamp.nesne_tabanli.paket1.A

class B : A() { // bu şekilde A kalıtım alınır
    fun metod(){
        val a = A() // kullanmak istediğimiz class farklı bir pakette ise yukarıda import edilmelidir.

    }
}