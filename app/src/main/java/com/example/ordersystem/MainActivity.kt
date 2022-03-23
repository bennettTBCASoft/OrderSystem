package com.example.ordersystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultLaunch = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            result.data?.extras?.let {
                if(result.resultCode == Activity.RESULT_OK) {
                    findViewById<TextView>(R.id.tv_meal).text =
                                "飲料： ${it.getString("drink")}\n\n" +
                                "甜度： ${it.getString("sugar")}\n\n" +
                                "冰塊： ${it.getString("ice")}"
                }
            }
        }

        findViewById<Button>(R.id.btn_select).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            resultLaunch.launch(intent)
        }

    }
}