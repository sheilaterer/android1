package com.example.sheila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toastbutton: Button
    lateinit var toastbutton2: Button
    lateinit var toastbutton3: Button
    lateinit var myform: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastbutton = findViewById(R.id.btn1)
        toastbutton2 = findViewById(R.id.btn2)
        toastbutton3 = findViewById(R.id.btn3)
        myform = findViewById(R.id.btn4)

        toastbutton.setOnClickListener {
            Toast.makeText(applicationContext, "You did it successfully", Toast.LENGTH_LONG).show()

            }
        toastbutton2.setOnClickListener {
            Toast.makeText(applicationContext, "You are amazing", Toast.LENGTH_LONG).show()
        }
        toastbutton3.setOnClickListener {
            Toast.makeText(applicationContext, "You are the best", Toast.LENGTH_LONG).show()
        }
        myform.setOnClickListener {
            Toast.makeText(applicationContext, "You are in", Toast.LENGTH_LONG).show()
            val form=Intent(this,formActivity::class.java)
            startActivity(form)

        }

    }
}