package com.example.buyqk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        // Auto-navigate to Login after 3 seconds if no button is clicked
        Handler(Looper.getMainLooper()).postDelayed({
            // Check if we are still in SplashActivity before auto-transitioning
            if (!isFinishing) {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }, 3000)
    }
}