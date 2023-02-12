package com.example.calcintentweb

import android.Manifest.permission.CALL_PHONE
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Images.Media
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var ButtonDial: Button
    lateinit var ButtonCall: Button
    lateinit var ButtonSms: Button
    lateinit var ButtonStk: Button
    lateinit var ButtonEmail: Button
    lateinit var ButtonCamera: Button
    lateinit var ButtonShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        ButtonDial = findViewById(R.id.Btn_Dial)
        ButtonCall = findViewById(R.id.Btn_Call)
        ButtonSms = findViewById(R.id.Btn_Sms)
        ButtonStk = findViewById(R.id.Btn_Stk)
        ButtonEmail = findViewById(R.id.Btn_Email)
        ButtonCamera = findViewById(R.id.Btn_Camera)
        ButtonShare = findViewById(R.id.Btn_Share)

        ButtonDial.setOnClickListener {
            val simu="0723265619"
            val intent=Intent(Intent.ACTION_DIAL,Uri.fromParts("Telephone",simu,null))
            startActivity(intent)

        }
        ButtonCamera.setOnClickListener {
            val picha=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(picha)
        }
        ButtonCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntentActivity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }


        }
        ButtonEmail.setOnClickListener {

            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        ButtonSms.setOnClickListener {
            val uri = Uri.parse("smsto:07456789")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            startActivity(intent)
        }
        ButtonStk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }
        ButtonShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)

        }



    }
}