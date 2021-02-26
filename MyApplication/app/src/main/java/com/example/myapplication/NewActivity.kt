package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    lateinit var backButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "MyApp"
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.textView)
        messageTextView.text = "$message, glad to see you here!"

        backButton = findViewById(R.id.button2)
        backButton.setOnClickListener {

            val lastLogin = "Last login: $message"
            val resultIntent = Intent()
            resultIntent.putExtra("LastLogin", lastLogin)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}