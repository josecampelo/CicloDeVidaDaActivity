package com.campelo.ciclodevidadaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnEntrar: Button
    private lateinit var btnDetalhes: Button
    private lateinit var btnEncerrar: Button
    private lateinit var intent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_de_vida", "onCreate()")
        Toast.makeText(this, "Primeira Activity no estado: onCreate()", Toast.LENGTH_SHORT).show()
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
        Toast.makeText(this, "Primeira Activity no estado: onStart()", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Log.i("ciclo_de_vida", "onResume()")
        Toast.makeText(this, "Primeira Activity no estado: onResume()", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Log.i("ciclo_de_vida", "onPause()")
        Toast.makeText(this, "Primeira Activity no estado: onPause()", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.i("ciclo_de_vida", "onStop()")
        Toast.makeText(this, "Primeira Activity no estado: onStop()", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onRestart() {
        Log.i("ciclo_de_vida", "onRestart()")
        Toast.makeText(this, "Primeira Activity no estado: onRestart()", Toast.LENGTH_SHORT).show()
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("ciclo_de_vida", "onDestroy()")
        Toast.makeText(this, "Primeira Activity no estado: onDestroy()", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}