package com.example.birthdaywisher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.birthdaywisher.databinding.ActivityMainBinding


import android.widget.Toast



class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun createBirthdayCard(view: View) {
        val name=binding.inputData.editableText.toString()
        val intent= Intent(this,BirthdayGreeting::class.java)
//        intent.putExtra(name:"name", name)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}