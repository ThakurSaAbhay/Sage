package com.google.ai.sample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val vrbtn=findViewById<ImageButton>(R.id.vrbtn)
        val chatbtn=findViewById<ImageButton>(R.id.chatbtn)
//        vrbtn.setOnClickListener{
//            val launchIntent = packageManager.getLaunchIntentForPackage("com.Fantancy.Environment")
//            launchIntent?.let { startActivity(it) }
//        }
        chatbtn.setOnClickListener {
                val regAc = Intent(this, MainActivity::class.java)
                startActivity(regAc)
            }
        }
    }