package com.campelo.ciclodevidadaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnEntrar: Button
    private lateinit var btnDetalhes: Button
    private lateinit var btnEncerrar: Button
    private lateinit var intent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_de_vida", "onCreate()")
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

    override fun onStart() {
        Log.i("ciclo_de_vida", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ciclo_de_vida", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ciclo_de_vida", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ciclo_de_vida", "onStop()")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("ciclo_de_vida", "onRestart()")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("ciclo_de_vida", "onDestroy()")
        super.onDestroy()
    }
}