package com.mualim.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edt_username)
        edtPassword = findViewById(R.id.edt_password)
        btnLogin = findViewById(R.id.btn_login)
        tvRegister = findViewById(R.id.tv_register)

        btnLogin.setOnClickListener {

        }

    }
}