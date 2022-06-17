package com.example.mvvmkullanimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)

        tasarim.textView.text = "0"

        tasarim.buttonCarpma.setOnClickListener {
            val alinan1 = tasarim.editTextSayi1.text.toString()
            val alinan2 = tasarim.editTextSayi2.text.toString()

            val sayi1 = alinan1.toInt()
            val sayi2 = alinan2.toInt()

            val toplam = sayi1 * sayi2
            tasarim.textView.text = toplam.toString()
        }

        tasarim.buttonToplama.setOnClickListener {

            val alinan1 = tasarim.editTextSayi1.text.toString()
            val alinan2 = tasarim.editTextSayi2.text.toString()

            val sayi1 = alinan1.toInt()
            val sayi2 = alinan2.toInt()

            val toplam = sayi1 + sayi2
            tasarim.textView.text = toplam.toString()
        }
        val kisi = Kisiler(11111,"Ahmet",1.98)
        buttonGoToB.setOnClickListener {
            val intent = Intent(this@MainActivity,ActivityB::class.java)
            intent.putExtra("nesne",kisi)

            startActivity(intent)
        }


    }
}