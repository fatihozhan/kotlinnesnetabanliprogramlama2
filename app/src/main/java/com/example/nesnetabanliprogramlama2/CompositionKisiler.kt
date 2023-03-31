package com.example.nesnetabanliprogramlama2

fun main(){
    val adres = Adres("Nevşehir", "Acıgöl")
    val kisi = Kisiler1("Fatih", 25, adres)
    println(kisi.ad)
    println(kisi.yas)
    println(kisi.adres.il)
    println(kisi.adres.ilce)
}