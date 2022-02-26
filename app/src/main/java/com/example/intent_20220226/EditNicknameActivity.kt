package com.example.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnSave.setOnClickListener {

//            입력한 닉네임을 변수로 담자.

            val inputNickname = edtNickname.text.toString()

//            putExtra를 통해서, 데이터를 담아주는 용도의 인텐트를 생성

            val resultIntent = Intent() // 단순 데이터를 담는 용도라 출발지 / 도착지 명시 필요 X

            resultIntent.putExtra("nick" , inputNickname)

//            OK 누른게 맞는지? + 어떤 데이터를 가지고 돌아갈건지 => 결과로 설정
            setResult(RESULT_OK, resultIntent)

//            이전 화면으로 복귀

            finish()
        }
    }


}