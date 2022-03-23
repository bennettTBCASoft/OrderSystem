package com.example.ordersystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ev_drinkName = findViewById<EditText>(R.id.ev_drinkName)
        val radioGroup_sugar = findViewById<RadioGroup>(R.id.radioGroup_sugar)
        val radioGroup_ice = findViewById<RadioGroup>(R.id.radioGroup_ice)

        findViewById<Button>(R.id.btn_sent).setOnClickListener {
            if (ev_drinkName.length() < 1) {
                Toast.makeText(this,"請輸入飲料名",Toast.LENGTH_SHORT).show()
            } else {
                val bundle = Bundle()
                bundle.putString("drink", ev_drinkName.text.toString())
                // 不用宣告每一個RadioButton findViewById，用checkedRadioButtonId去取得選到的RadioButton
                bundle.putString("sugar", radioGroup_sugar.findViewById<RadioButton>(radioGroup_sugar.checkedRadioButtonId).text.toString())
                bundle.putString("ice", radioGroup_ice.findViewById<RadioButton>(radioGroup_ice.checkedRadioButtonId).text.toString())
                setResult(Activity.RESULT_OK, Intent().putExtras(bundle))
                finish()
            }
        }

    }
}