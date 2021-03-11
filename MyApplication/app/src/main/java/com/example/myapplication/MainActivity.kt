package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var changeActivityButton: Button
    lateinit var messageEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "MyApp"
        messageEditText = findViewById(R.id.editTextTextPersonName)
        changeActivityButton = findViewById(R.id.button)
        changeActivityButton.setOnClickListener {
            val intent = Intent(this@MainActivity, NewActivity::class.java)
            val message = messageEditText.text.toString()
            intent.putExtra("message_key", message)

            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val secondValue = data!!.getStringExtra("LastLogin")
                val secondValueView: TextView = findViewById(R.id.textView2)
                secondValueView.text = secondValue
            }
        }
    }
}
