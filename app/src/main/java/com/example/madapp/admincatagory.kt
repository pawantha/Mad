 package com.example.madapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admincatagory.*

 class admincatagory : AppCompatActivity()
{




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admincatagory)
        pizza.setOnClickListener {
            startActivity(Intent(this,adremoveActivity::class.java))
        }
    }
}
