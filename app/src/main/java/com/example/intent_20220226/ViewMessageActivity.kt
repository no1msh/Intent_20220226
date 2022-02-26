package com.example.intent_20220226

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        이전화면에서 보내준 문구를 변수로 담아두자

        val message = intent.getStringExtra("메세지")

        txtMessage.text = message
    }
}