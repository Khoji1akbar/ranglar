package com.example.ranglar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ranglar.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGren.setOnClickListener {
            Toast.makeText(this , "green", Toast.LENGTH_SHORT).show()
            MyDat.color = Color.GREEN
        }


        binding.btnRed.setOnClickListener {
            Toast.makeText(this , "red", Toast.LENGTH_SHORT).show()
            MyDat.color = Color.RED
        }

    }
}