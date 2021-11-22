package com.example.entregabotones1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import com.example.entregabotones1.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.b1.setOnClickListener {
            var aleatorio=Random.nextInt(0,100)
            binding.tvb1.text= aleatorio.toString()

        }

        binding.b2.setOnClickListener {
            var aleatorio=Random.nextInt(97,122)
            binding.tvb1.text=aleatorio.toChar().toString()


        }

        binding.b3.setOnClickListener {
            var palabra:String=""
            repeat(5){palabra+=Random.nextInt(97,122).toChar().toString()}
            binding.tvb1.text=palabra

        }

        binding.tvb1.doOnTextChanged { text, start, before, count ->
                if(text!!.length<5){
                    binding.b4.setOnClickListener{
                        binding.tvb1.isVisible
                    }
                }else{

                }

        }


    }
}