package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class last2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last2)
        val button = findViewById<Button>(R.id.button23)

        button.setOnClickListener {
            val intent = Intent(this, last3::class.java)
            startActivity(intent)

        }
    }

}
