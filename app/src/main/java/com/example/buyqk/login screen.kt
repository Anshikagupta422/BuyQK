package com.example.buyqk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvSplash = findViewById<TextView>(R.id.tvSplash)
        val tvRegister = findViewById<TextView>(R.id.tvRegister)
        val btnLanguage = findViewById<ImageButton>(R.id.btnLanguage)

        btnLogin.setOnClickListener {
            // Login Code
        }

        tvSplash.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
            finish()
        }

        tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        btnLanguage.setOnClickListener {
            showLanguageMenu(it as ImageButton)
        }
    }

    private fun showLanguageMenu(view: ImageButton) {
        val popup = PopupMenu(this, view)
        popup.menu.add("English")
        popup.menu.add("Hindi")

        popup.setOnMenuItemClickListener { item ->
            when (item.title) {
                "English" -> {
                    Toast.makeText(this, "Language set to English", Toast.LENGTH_SHORT).show()
                    // Add locale change logic here
                }
                "Hindi" -> {
                    Toast.makeText(this, "भाषा हिंदी में सेट की गई", Toast.LENGTH_SHORT).show()
                    // Add locale change logic here
                }
            }
            true
        }
        popup.show()
    }
}