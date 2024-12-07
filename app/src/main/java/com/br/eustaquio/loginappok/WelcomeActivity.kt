package com.br.eustaquio.loginappok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome) // Verifique o nome correto do layout!

        // Obter o usuário autenticado
        val user = FirebaseAuth.getInstance().currentUser

        // Vincular a TextView pelo ID
        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)

        // Recuperar a mensagem do recurso de string
        val welcomeMessage = getString(R.string.welcome_message, user?.email ?: "Guest")

        // Definir o texto formatado na TextView
        welcomeTextView.text = welcomeMessage
    }
}
