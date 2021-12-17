package com.example.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val button=findViewById<Button>(R.id.button)

        var tab_layout=findViewById<com.google.android.material.tabs.TabLayout>(R.id.tab_layout)

        tab_layout.addTab(tab_layout.newTab().setText("Login"))


        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)




        button.setOnClickListener {
            val intent = Intent(this, IntroductoryActivity::class.java)
            val message = name.text.toString()
            intent.putExtra("message_key", message)
            startActivity(intent)

    }
}}