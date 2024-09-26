package com.example.fourscreenapp

import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DateSelectionActivity : AppCompatActivity() {

    private lateinit var calendarView: CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_selection)

        calendarView = findViewById(R.id.calendarView)
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            Toast.makeText(this, "Fecha seleccionada: $dayOfMonth/${month+1}/$year", Toast.LENGTH_SHORT).show()
        }
    }
}
