package br.edu.fatecpg.alunos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val txtNome = findViewById<TextView>(R.id.txtNome)
        val txtMatricula = findViewById<TextView>(R.id.txtMatricula)
        val btnGerar = findViewById<Button>(R.id.btnGerar)

        val nome = intent.getStringExtra("nome_aluno")

        txtNome.text = "Aluno: $nome"

        btnGerar.setOnClickListener {

            val matricula = Random.nextInt(100000, 1000000)

            txtMatricula.text = "Matrícula: $matricula"
        }
    }
}