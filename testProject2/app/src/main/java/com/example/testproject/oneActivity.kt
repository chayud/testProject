package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testproject.databinding.ActivityMainBinding
import com.example.testproject.databinding.ActivityOneBinding

class oneActivity : AppCompatActivity() {


    private lateinit  var activityOneBinding : ActivityOneBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
    }
}