package com.example.view_databinding

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.view_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MyViewModel

    private var showName: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        //ProfileLayoutBinding
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)


        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.boton.setOnClickListener {
            viewModel.setMyName("Carlos")
            viewModel.setGreeting("Hola a Todos!!")
        }

        setContentView(binding.root)
    }
}