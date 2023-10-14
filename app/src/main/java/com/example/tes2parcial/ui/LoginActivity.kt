package com.example.tes2parcial.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tes2parcial.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLog: Button = findViewById(R.id.btnLogin)

        btnLog.setOnClickListener{
            this.login();
        }


    }
    private fun login()
    {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}