package com.example.seletorpaises

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog



class MainActivity : DebugActivity() {

    var paisInstancia: Pais = Pais()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val ListaPaises: List<String> = listOf("Brasil", "Japão", "Holanda", "México", "País de Gales", "Canadá")
        var btnPesquisa = findViewById<Button>(R.id.btnPesquisaPais)
        var pais = findViewById<EditText>(R.id.editTextPais)

        btnPesquisa.setOnClickListener{
            paisInstancia.ValorPais = pais.text.toString()
            val i = Intent(this, PaisesActivity::class.java)
            i.putExtra("Pais", paisInstancia.ValorPais)

            val alertDialog: AlertDialog
            val builder = AlertDialog.Builder(this)

            if(paisInstancia.ValorPais  == ""){
                builder.setTitle("Erro")
                builder.setMessage("Digite o Nome do País Corretamente")
                alertDialog = builder.create()
                alertDialog.show()
            }
            else if(paisInstancia.ValorPais  !in ListaPaises){
                builder.setTitle("Erro")
                builder.setMessage("O país não foi encontrado, tente pesquisar por outra nação")
                alertDialog = builder.create()
                alertDialog.show()
            }
            else{
                finish()
                startActivity(i)
            }
        }
    }
}


