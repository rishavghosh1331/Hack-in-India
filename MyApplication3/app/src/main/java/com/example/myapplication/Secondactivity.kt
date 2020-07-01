package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Secondactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, Thirdactivity::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.button3)
        button1.setOnClickListener {
            val intent = Intent(this, Thirdactivity::class.java)
            startActivity(intent)
        }
    }
}
