package com.example.bindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("W123", "Ali" )

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = student
        //binding.tvId.text = student.id
        //binding.tvName.text = student.name

        binding.button.setOnClickListener(){


        }

        //val tv :TextView = findViewById(R.id.tvId)
        //tv.text = student.id

        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



    }
}


