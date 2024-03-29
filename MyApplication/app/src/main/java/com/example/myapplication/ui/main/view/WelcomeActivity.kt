package com.example.myapplication.ui.main.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class WelcomeActivity : AppCompatActivity() {
    lateinit var backButton: Button
    lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "MyApp"
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.textView)
        messageTextView.text = "Dear, $message " + resources.getString(R.string.agreement)

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
            val intent = Intent(this@WelcomeActivity, HomeActivity::class.java)

            startActivityForResult(intent, 1)
        }
    }
}
