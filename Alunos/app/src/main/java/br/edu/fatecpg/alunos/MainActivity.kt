package br.edu.fatecpg.alunos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editNome = findViewById<EditText>(R.id.editNome)
        val btnContinuar = findViewById<Button>(R.id.btnContinuar)

        btnContinuar.setOnClickListener {
            val nome = editNome.text.toString().trim()
            if (nome.isEmpty()) {
                Toast.makeText(
                    this, "digite o nome do aluno", Toast.LENGTH_SHORT
                ).show()
            } else {
                val intent = Intent(this, SegundaActivity::class.java)

                intent.putExtra("nome_aluno", nome)
                startActivity(intent)
            }
        }
    }
}