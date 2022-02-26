package com.example.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturn.setOnClickListener {

//            이전화면 ( 메인 화면 ) 으로 복귀

//            val myIntent = Intent(this, MainActivity :: class.java )
//            startActivity(myIntent)

            finish()
        }
    }
}