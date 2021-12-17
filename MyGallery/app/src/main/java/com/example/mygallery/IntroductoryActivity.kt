package com.example.mygallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class IntroductoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)

        val name1 = findViewById<TextView>(R.id.name1)
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.name1)
        messageTextView.text = message



        var imageview=findViewById<ImageView>(R.id.imageview)

        val img1=findViewById<ImageView>(R.id.img1)
        img1.setOnClickListener {
            imageview.setImageResource(R.drawable.i1)
        }
        val img2=findViewById<ImageView>(R.id.img2)
        img2.setOnClickListener {
            imageview.setImageResource(R.drawable.i2)
        }
        val img3=findViewById<ImageView>(R.id.img3)
        img3.setOnClickListener {
            imageview.setImageResource(R.drawable.i3)
        }
        val img4=findViewById<ImageView>(R.id.img4)
        img4.setOnClickListener {
            imageview.setImageResource(R.drawable.i4)
        }
        val img5=findViewById<ImageView>(R.id.img5)
        img5.setOnClickListener {
            imageview.setImageResource(R.drawable.i5)
        }
        val img6=findViewById<ImageView>(R.id.img6)
        img6.setOnClickListener {
            imageview.setImageResource(R.drawable.i6)
        }
        val img7=findViewById<ImageView>(R.id.img7)
        img7.setOnClickListener {
            imageview.setImageResource(R.drawable.i7)
        }
        val img8=findViewById<ImageView>(R.id.img8)
        img8.setOnClickListener {
            imageview.setImageResource(R.drawable.i8)
        }
        val img9=findViewById<ImageView>(R.id.img9)
        img9.setOnClickListener {
            imageview.setImageResource(R.drawable.i9)
        }
        val img10=findViewById<ImageView>(R.id.img10)
        img10.setOnClickListener {
            imageview.setImageResource(R.drawable.i10)
        }

    }
}