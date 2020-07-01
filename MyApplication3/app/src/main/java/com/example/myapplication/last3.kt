package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class last3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last3)
        val button = findViewById<Button>(R.id.button39)

        button.setOnClickListener {
            val intent = Intent(this, last4::class.java)
            startActivity(intent)

        }
    }
}
