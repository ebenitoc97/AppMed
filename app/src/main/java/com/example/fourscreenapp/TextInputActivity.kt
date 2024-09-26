package com.example.fourscreenapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TextInputActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_input)

        editText = findViewById(R.id.editText)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val text = editText.text.toString()
            Toast.makeText(this, "Texto ingresado: $text", Toast.LENGTH_SHORT).show()
        }
    }
}
