package com.example.pass_parameter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Mendapatkan Data dari Intent object dan data dari Intent
        val intent = getIntent()
        val username = intent.getStringExtra("Username")
        val password = intent.getStringExtra("Password")

        // form one Textview for the final result

        resultTv.text = "Collected info: \n\nUsername: "+username+"\nPassword: "+password
    }
}