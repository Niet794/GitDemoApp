package com.example.gitdemoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btnHell)
        val btnExit = findViewById<Button>(R.id.btnExi)
        val btnabou = findViewById<Button>(R.id.btnAbout)

        btnHello.setOnClickListener {
            Toast.makeText(this, "Hello Ayyub!", Toast.LENGTH_SHORT).show()
        }

        btnabou .setOnClickListener {
            Toast.makeText(this, "Hello Nietin!", Toast.LENGTH_SHORT).show()
        }


        btnExit.setOnClickListener {
            finish()
            exitProcess(0)
        }
    }
}