package com.example.composebootcamp.nesne_tabanli.paket1

open class A { // open dersek bu class kalıtıma açık demektir, artık B den kalıtım yapabiliriz
    var varyasilanDegisken = 1 // bu da public aslında
    public var publicDegisken = 2 // her yerden erişilebilir
    private var privateDegisken = 3 // sadece class içerisinden erişilebilir
    protected var protectedDegisken = 4 // başka classa kalıtım yoluyla verilirse erişilebilir. JAVA da aynı pakette ise erişilebilir yapar.
}