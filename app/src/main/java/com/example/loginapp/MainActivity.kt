package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val validEmail = "turmadeandroid@praxis.com"
    private val validSenha = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextSenha = findViewById<EditText>(R.id.editTextSenha)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val senha = editTextSenha.text.toString()

            if (email == validEmail && senha == validSenha) {
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email ou senha incorretos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}