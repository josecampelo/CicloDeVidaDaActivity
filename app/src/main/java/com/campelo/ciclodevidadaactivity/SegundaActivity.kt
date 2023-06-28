package com.campelo.ciclodevidadaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

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

    override fun onDestroy() {
        Log.i("ciclo_de_vida", "onDestroy()")
        Toast.makeText(this, "Segunda Activity no estado: onDestroy()", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}