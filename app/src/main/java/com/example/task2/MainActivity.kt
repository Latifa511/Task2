package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textName:EditText
    lateinit var textAge:EditText
    lateinit var toasbtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textName = findViewById(R.id.editTextTextPersonName)
        textAge = findViewById(R.id.editTextTextPersonName2)
        toasbtn = findViewById(R.id.button)

        toasbtn.setOnClickListener {
            val st = "Name : ${textName.text} \n Age :${textAge.text}"
            Toast.makeText(applicationContext,st,Toast.LENGTH_SHORT).show()
        }
    }
}