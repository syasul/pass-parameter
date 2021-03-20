package com.example.pass_parameter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSaveButtonClick(view: View) {
        // Mengambil Data dari Edit Texts
        val username = (R.id.editTextTextEmailAddress)
        val password = (R.id.TextPassword)

        // Mulai Intent untuk New Activity dan Pass Data
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("Username", username)
        intent.putExtra("Password", password)

        startActivity(intent)
    }
}