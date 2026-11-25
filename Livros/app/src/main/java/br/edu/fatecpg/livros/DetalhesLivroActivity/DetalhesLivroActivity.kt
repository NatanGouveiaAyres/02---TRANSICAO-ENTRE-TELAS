package br.edu.fatecpg.livros.DetalhesLivroActivity

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.livros.R

class DetalhesLivroActivity : AppCompatActivity() {
    private lateinit var txtTitulo: TextView
    private lateinit var txtAutor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes_livro)

        val txtTitulo = findViewById<TextView>(R.id.txtTitulo)
        val txtAutor = findViewById<TextView>(R.id.txtAutor)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"
    }
}