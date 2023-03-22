package com.example.viewpager_3homwork.Models

import com.example.viewpager_3homwork.R

object MyData {
    val  list = ArrayList<Data>()
    fun loddata(){
        list.add(Data("Xush kelibsiz", "Kim ko'rubdur, ey ko'nkul, ahli jahondin haxshilig', Kimki, ondin yaxshi yoq, ko'z tutma ondin yaxshilig'", R.drawable.naushnik))
        list.add(Data("Hikoyalar dunyosi", "Gar zamonni nayf qilsak ayb qilma, ye rafiq, Ko'rmadim hargiz,netoyin, bu zamondin yaxshilig'", R.drawable.bulutis))
        list.add(Data("Kitob ortidan..", "Dilrabolardan yomonlik keldi mahzum ko'ngulma, Kelmadi jonimg'a hech oromi jondin yaxshilig'.", R.drawable.qiz))
        list.add(Data("Bizga qo'shiling", "Ey ko'ngul, uchun yaxshidin ko'rdun yamonlig' asru ko'p, Emdi ko'z tutmoq ne ma'ni har yamondin yaxshilig'?", R.drawable.kottabulutis))
    }
}