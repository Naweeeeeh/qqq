package com.example.opboom

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class WelcomeActivity : Activity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcomepage)
        val welcomeButton = findViewById<Button>(R.id.welcomeID)


        welcomeButton.setOnClickListener {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // welcome page
    }
}