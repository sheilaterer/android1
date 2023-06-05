package com.example.sheila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class feedbackActivity : AppCompatActivity() {
    lateinit var nxt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        nxt=findViewById(R.id.nxt)

        nxt.setOnClickListener {
            var mynext= Intent(this,IntentActivity::class.java)
            startActivity(mynext)
        }
    }
}