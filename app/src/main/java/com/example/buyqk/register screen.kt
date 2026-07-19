package com.example.buyqk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_screen)

        val btnCreate = findViewById<Button>(R.id.btnCreate)
        val txtLogin = findViewById<TextView>(R.id.txtLogin)
        val tvSplash = findViewById<TextView>(R.id.tvSplash)
        val tvLoginBottom = findViewById<TextView>(R.id.tvLogin)

        btnCreate.setOnClickListener {
            // Register Code
        }

        txtLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        tvSplash.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
            finish()
        }

        tvLoginBottom.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}