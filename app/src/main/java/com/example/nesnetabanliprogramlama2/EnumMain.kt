package com.example.nesnetabanliprogramlama2

fun main(){
    fun ucretAl(boyut:KonserveBoyut){
        //boyut değişkeni bu sınıftan değerler alabilir sadece
        when(boyut){
            KonserveBoyut.Kucuk -> println(20 * 30)
            KonserveBoyut.Orta -> println(30*30)
            KonserveBoyut.Buyuk -> println(40*30)
        }
    }

    ucretAl(KonserveBoyut.Orta)
}