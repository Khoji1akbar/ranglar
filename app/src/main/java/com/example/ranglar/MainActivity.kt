package com.example.ranglar

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ranglar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnKetingisi.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }



    }

    override fun onResume() {
        super.onResume()
        binding.ekran.setBackgroundColor(MyDat.color)
    }
}