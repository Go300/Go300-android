package com.example.muslimbeibytuly.go300

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val usernameEditText = findViewById<EditText>(R.id.username_edit_text)
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton?.setOnClickListener {
            val username = usernameEditText.text
        }
    }
}
