package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class last1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last1)
        val button = findViewById<Button>(R.id.button22)

        button.setOnClickListener {
            val intent = Intent(this, last2::class.java)
            startActivity(intent)

        }
    }
}
