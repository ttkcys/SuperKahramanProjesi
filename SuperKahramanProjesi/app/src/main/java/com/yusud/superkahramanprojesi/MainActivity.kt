package com.yusud.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isim = ""
    private var yas : Int? = null
    private var meslek = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun superKahramanYapBtn(view : View){

        isim = isimText.text.toString()
        yas = yasText.text.toString().toIntOrNull()
        meslek = meslekText.text.toString()

        if(yas == null){
            sonucText.text = "Doğru yaşı giriniz!!"
        }else{
            val superKahraman = SuperKahraman(isim,yas!!,meslek)
            sonucText.text = "İSİM: ${superKahraman.isim} YAŞ: ${superKahraman.yas} MESLEK: ${superKahraman.meslek}"
        }

    }

}