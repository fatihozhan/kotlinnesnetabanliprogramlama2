package com.example.nesnetabanliprogramlama2

fun main(){
    val k1 = Kategoriler(1, "Dram")
    val k2 = Kategoriler(2, "Komedi")
    val y1 = Yonetmenler(1, "Quentin")
    val y2 = Yonetmenler(2, "Nuri Bilge Ceylan")
    val f1 = Filmler(1, "Anadolu Kartalları", 2012, k1,y1)
    println(f1.yönetmen.yonetmenAdi)
    println(f1.kategori.kategoriAd)
    println(f1.kategori.kategoriId)
    println(f1.yönetmen.yonetmenId)
    println(f1.filmAdi)
    println(f1.filmYil)
}