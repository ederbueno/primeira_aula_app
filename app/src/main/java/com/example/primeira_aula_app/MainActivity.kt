package com.example.primeira_aula_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var botao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.botao_teste)
        botao.setOnClickListener {
            Toast.makeText(this, "Botão Teste", Toast.LENGTH_LONG).show()
        }

    }
}