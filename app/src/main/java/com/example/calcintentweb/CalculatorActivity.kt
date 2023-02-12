package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.calcintentweb.R.id.Edit_snum

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsub:Button
    lateinit var Buttondiv:Button
    lateinit var Buttonmult:Button
    lateinit var Editfnum:EditText
    lateinit var Editsnum:EditText
    lateinit var TextViewans:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Buttonadd=findViewById(R.id.Btn_Add)
        Buttondiv=findViewById(R.id.Btn_Div)
        Buttonsub=findViewById(R.id.Btn_Sub)
        Buttonmult=findViewById(R.id.Btn_Mult)
        Editfnum=findViewById(R.id.Edit_fnum)
        Editsnum=findViewById(R.id.Edit_snum)
        TextViewans=findViewById(R.id.Txt_Answer)

        Buttonadd.setOnClickListener {
            var fnum=Editfnum.text.toString()
            var snum=Editsnum.text.toString()
            if(fnum.isEmpty() && snum.isEmpty()){
                TextViewans.text="PLEASE ENTER THE DETAILS..!"
            }
            else{
                var Answer = fnum.toDouble()+snum.toDouble()
                TextViewans.text= Answer.toString()
            }

        }
        Buttonsub.setOnClickListener {
            var fnum=Editfnum.text.toString()
            var snum=Editsnum.text.toString()
            if(fnum.isEmpty() && snum.isEmpty()){
                TextViewans.text="PLEASE ENTER THE DETAILS..!"
            }
            else{
                var Answer = fnum.toDouble()-snum.toDouble()
                TextViewans.text= Answer.toString()
            }

        }

        Buttonmult.setOnClickListener {
            var fnum=Editfnum.text.toString()
            var snum=Editsnum.text.toString()
            if(fnum.isEmpty() && snum.isEmpty()){
                TextViewans.text="PLEASE ENTER THE DETAILS..!"
            }
            else{
                var Answer = fnum.toDouble()*snum.toDouble()
                TextViewans.text= Answer.toString()
            }

        }
        Buttondiv.setOnClickListener {
            var fnum=Editfnum.text.toString()
            var snum=Editsnum.text.toString()
            if(fnum.isEmpty() && snum.isEmpty()){
                TextViewans.text="PLEASE ENTER THE DETAILS..!"
            }
            else{
                var Answer = fnum.toDouble()/snum.toDouble()
                TextViewans.text= Answer.toString()
            }

        }
    }
}