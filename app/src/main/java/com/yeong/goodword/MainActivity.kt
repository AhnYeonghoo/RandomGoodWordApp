package com.yeong.goodword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yeong.goodword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenseList = mutableListOf<String>()
        sentenseList.add("검정화면에 대충 한글씨 쓰면 명언같다")
        sentenseList.add("사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다.")
        sentenseList.add("결점이 없는 친구를 사귀려고 한다면 평생 친구를 가질 수 없을 것이다.")
        sentenseList.add("자기 아이에게 육체적 노동을 가르치지 않는 것은 약탈과 강도를 가르치는 것과 마찬가지다.")
        sentenseList.add("승자는 눈을 밣아 길을 만들지만 패자는 눈이 녹기를 기다린다.")
        sentenseList.add("두 개의 화살을 갖지 마라, 두 번째 화살이 있기 때문에 첫 번째 화살에 집중하지 않게 된다.")
        sentenseList.add("그 사람 입장에 서기 전까지 절대 그 사람을 욕하거나 책망하지 마라.")
        sentenseList.add("뛰어난 말에게도 체력이 필요하다.")



        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {

            val intent = Intent(this, SentenseActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenseList.random())
    }



}