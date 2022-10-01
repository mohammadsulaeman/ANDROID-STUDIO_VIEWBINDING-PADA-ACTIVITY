package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var klik : Button
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        klik = findViewById(R.id.button_klikc)

        binding.buttonKlikc.setOnClickListener {
            Toast.makeText(applicationContext, "ini sebuah Toast",Toast.LENGTH_SHORT).show()
        }
    }
}