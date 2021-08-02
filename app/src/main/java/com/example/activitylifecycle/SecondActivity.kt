package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn :Button = findViewById(R.id.btnAdd)
        val tv :TextView = findViewById(R.id.tvResult)

        Log.i("myActivity", "OnCreate")

        if (savedInstanceState != null){
            count = savedInstanceState.getInt("count")
            tv.text = count.toString()
        }

        btn.setOnClickListener(){
            count += 1
            tv.text = count.toString()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("myActivity", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("myActivity", "OnResume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("myActivity", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("myActivity", "OnDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("count", count)
    }
}