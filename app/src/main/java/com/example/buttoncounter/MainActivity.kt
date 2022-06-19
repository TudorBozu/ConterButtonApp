package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // declar varibile
        var editText1:EditText?=null
        var button1: Button?=null
        var textView:TextView?=null

        // using function findViewById
        editText1 = findViewById<EditText>(R.id.editText1)
        button1 = findViewById<Button>(R.id.button1)
        textView = findViewById<TextView>(R.id.textviwe)
        textView.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        button1?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                textView?.append("Produs nume:"+editText1?.text)
                textView?.append("\n")
                editText1.text.clear()
                editText1.setText("")
            }
        })

    }
}