package br.edu.fatecpg.livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.livros.DetalhesLivroActivity.DetalhesLivroActivity

class MainActivity : AppCompatActivity() {
    private lateinit var edtTitulo: EditText
    private lateinit var edtAutor: EditText
    private lateinit var btnCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
         btnCadastrar = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = edtTitulo.text.toString().trim()
            val autor = edtAutor.text.toString().trim()

            if (titulo.isEmpty() || autor.isEmpty()) {
                Toast.makeText(
                    this,
                    "Preencha o título e o autor.",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            val intent = Intent(this, DetalhesLivroActivity::class.java)
            intent.putExtra("titulo", titulo)
            intent.putExtra("autor", autor)

            startActivity(intent)
        }
    }
}