package com.example.birthdaywisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaywisher.databinding.ActivityBirthdayGreetingBinding
class BirthdayGreeting : AppCompatActivity() {
    private lateinit var binding:ActivityBirthdayGreetingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name=intent.getStringExtra("name")

        binding.textView.text="Happy Birthday $name"
    }
}