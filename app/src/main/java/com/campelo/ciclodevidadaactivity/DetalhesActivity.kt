package com.campelo.ciclodevidadaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class DetalhesActivity : AppCompatActivity() {

    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        btnVoltar = findViewById(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        Log.i("ciclo_de_vida", "onDestroy()")
        Toast.makeText(this, "Detalhes Activity no estado: onDestroy()", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}