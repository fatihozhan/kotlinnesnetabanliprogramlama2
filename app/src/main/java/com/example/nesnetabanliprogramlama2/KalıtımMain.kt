package com.example.nesnetabanliprogramlama2

fun main(){
    val araba = Araba("Siyah", "Otomatik", "Sedan")
    println(araba.vites)
    println(araba.kasaTipi)
    println(araba.renk)

    val nissan = Nissan("Beyaz", "Otomatik", "Sedan", "Nissan Juke")

    println(nissan.model)
    println(nissan.vites)
}