package com.example.my_demo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val intent=Intent(this, AfterSignUpActivity::class.java)
        Button_SignUpActivity_Signup.setOnClickListener { startActivity(intent) }
    }
}
