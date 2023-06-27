package com.campelo.ciclodevidadaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {

    private lateinit var btnSair: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        btnSair = findViewById(R.id.btnSair)
        btnSair.setOnClickListener {
            finish()
        }
    }
}