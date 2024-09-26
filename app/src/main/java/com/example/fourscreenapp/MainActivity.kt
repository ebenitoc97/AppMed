package com.example.fourscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnDateSelection: Button
    private lateinit var btnTextInput: Button
    private lateinit var btnListSelection: Button
    private lateinit var btnSummary: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDateSelection = findViewById(R.id.btnDateSelection)
        btnTextInput = findViewById(R.id.btnTextInput)
        btnListSelection = findViewById(R.id.btnListSelection)
        btnSummary = findViewById(R.id.btnSummary)

        btnDateSelection.setOnClickListener {
            startActivity(Intent(this, DateSelectionActivity::class.java))
        }

        btnTextInput.setOnClickListener {
            startActivity(Intent(this, TextInputActivity::class.java))
        }

        btnListSelection.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

        btnSummary.setOnClickListener {
            startActivity(Intent(this, SummaryActivity::class.java))
        }
    }
}
