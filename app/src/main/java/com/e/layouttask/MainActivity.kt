package com.e.layouttask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1Button = findViewById<Button>(R.id.fragment1Button)
        fragment1Button.setOnClickListener({
            val fragmentManager = supportFragmentManager
            val transactionA = fragmentManager.beginTransaction()
            val fragmentA = Fragment1()
            transactionA.replace(R.id.frameContainer, fragmentA)
            transactionA.commit()
        })

        val fragment2Button = findViewById<Button>(R.id.fragment2Button)
        fragment2Button.setOnClickListener({
            val fragmentManager = supportFragmentManager
            val transactionA = fragmentManager.beginTransaction()
            val fragmentA = Fragment2()
            transactionA.replace(R.id.frameContainer, fragmentA)
            transactionA.commit()
        })
    }
}
