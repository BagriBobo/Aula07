package com.example.aula07

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula07.databinding.ActivityDynamicBinding

class DynamicActivity : AppCompatActivity() {

    lateinit var binding: ActivityDynamicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDynamicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFrag01.setOnClickListener {
            val fragment = FragmentTest01()
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer,fragment).commit()
        }
        binding.buttonFrag02.setOnClickListener {
            val fragment = FragmentTest02()
            supportFragmentManager.beginTransaction().replace(R.id.fragContainer,fragment).commit()
        }
    }
}