package com.example.sheila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity : AppCompatActivity() {
    lateinit var mynext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        mynext=findViewById(R.id.nxt)

        mynext.setOnClickListener {
            var mynext= Intent(this,ProductActivity::class.java)
            startActivity(mynext)
        }
    }
}