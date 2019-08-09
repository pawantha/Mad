package com.example.madapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbt.setOnClickListener {
            startActivity(Intent(this,logActivity::class.java))
        }
        join.setOnClickListener{
            startActivity(Intent(this,singinActivity::class.java))
        }
        join.setOnClickListener{
            startActivity(Intent(this,singinActivity::class.java))
        }


    }
}
