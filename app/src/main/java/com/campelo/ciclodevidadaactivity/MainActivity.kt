package com.campelo.ciclodevidadaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnEntrar: Button
    private lateinit var btnDetalhes: Button
    private lateinit var btnEncerrar: Button
    private lateinit var intent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar = findViewById(R.id.btnEntrar)
        btnDetalhes = findViewById(R.id.btnDetalhes)
        btnEncerrar = findViewById(R.id.btnEncerrar)

        btnEntrar.setOnClickListener {
            intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }

        btnDetalhes.setOnClickListener {
            intent = Intent(this, DetalhesActivity::class.java)
            startActivity(intent)
        }

        btnEncerrar.setOnClickListener {
            finish()
        }
    }
}