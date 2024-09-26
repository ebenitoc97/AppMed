package com.example.fourscreenapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SummaryActivity : AppCompatActivity() {

    private lateinit var tvSummary: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        tvSummary = findViewById(R.id.tvSummary)

        // Aquí puedes mostrar el resumen de las selecciones anteriores
        tvSummary.text = "Resumen de la selección:\n\n- Fecha: ... \n- Texto ingresado: ... \n- Ítems seleccionados: ..."
    }
}
