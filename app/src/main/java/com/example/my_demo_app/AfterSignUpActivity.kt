package com.example.my_demo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_after_sign_up.*

class AfterSignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_sign_up)
        val intent=Intent(this, MainActivity::class.java)
        Button_AfterSignUpActivity_GoBack.setOnClickListener { startActivity(intent) }
    }
}
