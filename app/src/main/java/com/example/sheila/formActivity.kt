package com.example.sheila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class formActivity : AppCompatActivity() {
    lateinit var nxt: Button
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        nxt = findViewById(R.id.btn)
        btn = findViewById(R.id.BtnPay)

        nxt.setOnClickListener {
            var mynext = Intent(this, feedbackActivity::class.java)
            startActivity(mynext)
        }
        btn.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}