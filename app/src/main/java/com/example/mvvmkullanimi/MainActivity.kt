package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "0"

        buttonCarpma.setOnClickListener {
            val alinan1 = editTextSayi1.text.toString()
            val alinan2 = editTextSayi2.text.toString()

            val sayi1 = alinan1.toInt()
            val sayi2 = alinan2.toInt()

            val toplam = sayi1 * sayi2
            textView.text = toplam.toString()
        }

        buttonToplama.setOnClickListener {

            val alinan1 = editTextSayi1.text.toString()
            val alinan2 = editTextSayi2.text.toString()

            val sayi1 = alinan1.toInt()
            val sayi2 = alinan2.toInt()

            val toplam = sayi1 + sayi2
            textView.text = toplam.toString()
        }


    }
}