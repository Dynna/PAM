package com.example.myapplication

import android.R.attr.button
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class NewActivity : AppCompatActivity() {
    lateinit var backButton: Button
    lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "MyApp"
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.textView)
        messageTextView.text = "Dear $message, welcome to the Authentic Social Network! The purpose of this application is to serve as a way to connect individuals with other people in order to share information, ideas, messages, creativity and interests. Authentic Social Network has no likes or followers, it's a platform where mental health is a priority so you are encouraged to act like your true self!"

        backButton = findViewById(R.id.button2)

        backButton.setOnClickListener {

            val lastLogin = "Last login: $message"
            val resultIntent = Intent()
            resultIntent.putExtra("LastLogin", lastLogin)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        nextButton = findViewById(R.id.button3)

        nextButton.setOnClickListener {
            val intent = Intent(this@NewActivity, HomeActivity::class.java)

            startActivityForResult(intent, 1)
        }
    }
}