package com.example.nesnetabanliprogramlama2.paket1

import com.example.nesnetabanliprogramlama2.paket2.B

class A : B() {

    fun fonksiyon(){
    val b = B()
    println(internalDegisken)
    println(publicDegisken)
    println(varsayilanDegisken)
    println(protectedDegisken) // Erişilebilmesi için o sınıf içerisinden türetilmesi gerekir
//    println(privateDegisken) // Sadece o sınıf içerisinden erişilebilir

    }
}