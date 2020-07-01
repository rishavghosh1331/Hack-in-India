package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class lastactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lastactivity)
        val button = findViewById<Button>(R.id.button15)

        button.setOnClickListener {
            val intent = Intent(this, last1::class.java)
            startActivity(intent)

        }
    }
}
