package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class last4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last4)
        val button = findViewById<Button>(R.id.button37)

        button.setOnClickListener {
            val intent = Intent(this, Secondactivity::class.java)
            startActivity(intent)

        }
    }
}
