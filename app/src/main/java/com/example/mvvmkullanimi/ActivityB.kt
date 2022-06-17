package com.example.mvvmkullanimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        buttonGoToC.setOnClickListener {
            val intent = Intent(this@ActivityB,ActivityC::class.java)
            startActivity(intent)
        }
    }

}