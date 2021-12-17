package com.example.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img=findViewById<ImageView>(R.id.img)
        val lottie=findViewById<com.airbnb.lottie.LottieAnimationView>(R.id.lottie)

      lottie.animate().translationY(-1600F).setDuration(1000).setStartDelay(4000)
//       val startDelay = img.animate().translationY(1400F).setDuration(1000).setStartDelay(4000)


        img.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }

    }
}
