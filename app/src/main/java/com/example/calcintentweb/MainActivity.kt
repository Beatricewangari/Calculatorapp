package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCal:Button
    lateinit var ButtonWeb:Button
    lateinit var ButtonIntent:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCal=findViewById(R.id.Btn_Calc)
        ButtonWeb=findViewById(R.id.Btn_Web)
        ButtonIntent=findViewById(R.id.Btn_Intent)

        ButtonCal.setOnClickListener {
            val calcl=Intent(this,CalculatorActivity::class.java)
            startActivity(calcl)
                    }
        ButtonWeb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }

    }

}