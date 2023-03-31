package com.example.seletorpaises


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView



class PaisesActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paises)
        supportActionBar?.hide()

        val nomePais = intent.getStringExtra("Pais")

        var btnPesquisaPais = findViewById<Button>(R.id.btnVoltar)
        var txtNomePais = findViewById<TextView>(R.id.txtNomePais)
        var txtPopulacaoPais = findViewById<TextView>(R.id.txtPopulacaoPais)
        var txtAreaPais = findViewById<TextView>(R.id.txtAreaPais)
        var txtLocalizacaoPais = findViewById<TextView>(R.id.txtLocalizacaoPais)
        var imgBandeira = findViewById<ImageView>(R.id.imgBandeira)
        var imgMapa = findViewById<ImageView>(R.id.imgMapa)

        when(nomePais){
            "Brasil" -> {
                txtLocalizacaoPais.setText("América do Sul")
                txtAreaPais.setText("8.516.000 km²")
                txtPopulacaoPais.setText("214,3 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.brasil)
                imgMapa.setImageResource(R.drawable.mapa_brasil)
            }
            "Canadá" -> {
                txtLocalizacaoPais.setText("América do Norte")
                txtAreaPais.setText("9.984.670 km²")
                txtPopulacaoPais.setText("37,7 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.canada)
                imgMapa.setImageResource(R.drawable.mapa_canada)
            }
            "País de Gales" -> {
                txtLocalizacaoPais.setText("Europa")
                txtAreaPais.setText("20.735 km²")
                txtPopulacaoPais.setText("3,2 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.gales)
                imgMapa.setImageResource(R.drawable.mapa_gales)
            }
            "México" -> {
                txtLocalizacaoPais.setText("América do Norte")
                txtAreaPais.setText("1.964.375 km²")
                txtPopulacaoPais.setText("130 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.mexico)
                imgMapa.setImageResource(R.drawable.mapa_mexico)
            }
            "Holanda" -> {
                txtLocalizacaoPais.setText("Europa Ocidental")
                txtAreaPais.setText("41.543 km²")
                txtPopulacaoPais.setText("17,173 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.holanda)
                imgMapa.setImageResource(R.drawable.mapa_holanda)
            }
            "Japão" -> {
                txtLocalizacaoPais.setText("Leste da Ásia")
                txtAreaPais.setText("377.930 km²")
                txtPopulacaoPais.setText("126 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.japao)
                imgMapa.setImageResource(R.drawable.mapa_japao)
            }
        }

        btnPesquisaPais.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            finish()
            startActivity(i)
        }
    }
}
