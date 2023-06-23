package com.example.edukids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvMaterias: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponent()
        initUI ()

    }



    private fun initComponent() {
        rvMaterias = findViewById(R.id.rvMaterias)
    }

    private fun initUI() {

    }
}