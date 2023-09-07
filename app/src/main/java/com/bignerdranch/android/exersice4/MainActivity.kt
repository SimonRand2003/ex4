package com.bignerdranch.android.exersice4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var tapButton: Button
    private var counter = Counter()
    private lateinit var display: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapButton = findViewById(R.id.tap_button)

        counter = Counter()
        display = findViewById(R.id.number)
        display?.setText(counter.getCount().toString()) //set to 0




        tapButton.setOnClickListener {
            counter!!.addCount()

            display?.setText(counter.getCount().toString())

        }



    }
}