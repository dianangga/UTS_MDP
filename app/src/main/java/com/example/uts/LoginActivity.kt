package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    private val EMAIL_PATTERN = Pattern.compile(
        "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Penting: memuat layout XML activity_login.xml
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty()) {
                emailEditText.error = "Email tidak boleh kosong"
                return@setOnClickListener
            }

            if (!EMAIL_PATTERN.matcher(email).matches()) {
                emailEditText.error = "Format email tidak valid"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                passwordEditText.error = "Password tidak boleh kosong"
                return@setOnClickListener
            }

            // Validasi lolos
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()
        }
    }
}