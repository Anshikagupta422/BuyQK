package com.example.buyqk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private var hasNavigated = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            navigateToLogin()
        }
        

        // Auto-navigate to Login after 3 seconds if no button is clicked
        Handler(Looper.getMainLooper()).postDelayed({
            if (!isFinishing && !hasNavigated) {
                navigateToLogin()
            }
        }, 3000)
    }

    private fun navigateToLogin() {
        if (hasNavigated) return
        hasNavigated = true
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    private fun navigateToRegister() {
        if (hasNavigated) return
        hasNavigated = true
        startActivity(Intent(this, RegisterActivity::class.java))
        finish()
    }
}