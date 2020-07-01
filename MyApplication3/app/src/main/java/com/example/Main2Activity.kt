package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R
import com.example.myapplication.lastactivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button2 = findViewById<Button>(R.id.button9)
        button2.setOnClickListener {
            val intent = Intent(this, lastactivity::class.java)
            startActivity(intent)
        }
    }
}
