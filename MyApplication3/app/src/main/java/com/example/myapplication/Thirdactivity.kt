package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Thirdactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)
        val button2 = findViewById<Button>(R.id.button7)
        button2.setOnClickListener {
            val intent = Intent(this, Fourthactivity::class.java)
            startActivity(intent)

        }
    }
}
