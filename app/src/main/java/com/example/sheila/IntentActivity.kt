package com.example.sheila

import android.content.Intent
import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class IntentActivity : AppCompatActivity() {

    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var stk:Button
    lateinit var call:Button
    lateinit var mynext:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        sms=findViewById(R.id.BtnSms)
        email=findViewById(R.id.BtnEmail)
        share=findViewById(R.id.BtnShare)
        camera=findViewById(R.id.BtnCamera)
        stk=findViewById(R.id.BtnStk)
        call=findViewById(R.id.BtnCall)
        mynext=findViewById(R.id.nxt)

        sms.setOnClickListener {
            val uri= parse("smsto:0717781401")
            val intent= Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "hi Sheila,..")
            startActivity(intent)
        }
        email.setOnClickListener {
            val emailIntent=Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "glory@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Madam,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))
        }
        share.setOnClickListener {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"https://github.com/sheilaterer")
            startActivity(shareIntent)
        }
        camera.setOnClickListener {
            val takePictureIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent,1)
        }
        stk.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        call.setOnClickListener {
            val dialIntent=Intent(Intent.ACTION_DIAL)
            dialIntent.data= parse("tel:" + "0717781401")
            startActivity(dialIntent)
        }
        mynext.setOnClickListener {
            var mynext= Intent(this,ImageActivity::class.java)
            startActivity(mynext)
        }
    }

}