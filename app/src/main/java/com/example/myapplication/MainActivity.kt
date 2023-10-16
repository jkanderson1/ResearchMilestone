package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun FunctionClicked(view:View){

        var displayText : TextView = findViewById(R.id.Greeting)
        displayText.setText("Thats Great!")
    }

    fun FunctionClicked1(view:View){

        var displayText : TextView = findViewById(R.id.Greeting)
        displayText.setText("I'm sorry to hear that :(")
    }

}