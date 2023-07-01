package com.example.hesap_makesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
/*import kotlinx.android.synthetic.main.activity_main.buton_carpma
import kotlinx.android.synthetic.main.activity_main.sayı
import kotlinx.android.synthetic.main.activity_main.sayı2
import kotlinx.android.synthetic.main.activity_main.sonuc
import kotlinx.android.synthetic.main.activity_main.toplama_buton*/

class MainActivity : AppCompatActivity() {
    private lateinit var sayı:TextView
    private lateinit var sayı2:TextView
    private lateinit var toplama_buton:Button
    private lateinit var buton_carpma:Button
    private lateinit var sonuc:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sonuc.text="0"
        toplama_buton.setOnClickListener {
            val alinan_sayi1=sayı.text.toString()
            val alinan_sayi2=sayı2.text.toString()
            val sayı=alinan_sayi1.toInt()
            val sayı2=alinan_sayi2.toInt()
            val toplam=sayı+sayı2
            sonuc.text=toplam.toString()

        }
        buton_carpma.setOnClickListener {
            val alinan_sayi1=sayı.text.toString()
            val alinan_sayi2=sayı2.text.toString()
            val sayı=alinan_sayi1.toInt()
            val sayı2=alinan_sayi2.toInt()
            val toplam=sayı*sayı2
            sonuc.text=toplam.toString()

        }



    }
}