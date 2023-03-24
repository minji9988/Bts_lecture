//1. setOnClickListen: 버튼을 클릭하면 변화가 생기도록 해보자!
// 예) 버튼 클릭하면 다른 화면으로 전환한다.
//2. intent: 화면전환에 대해 알아보자.

package com.bokchi.bts_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭되었다는 것을 프로그램한테 알려주기
        // 이미지를 imaage1란 변수(박스) 안에 넣어주기
        val image1 = findViewById<ImageView>(R.id.bts_image_1)

        // image1이 클릭이 되면 어떻게 되는지 알려주기 위해
        // setOnClickListenr를 사용
        image1.setOnClickListener{

            //이미지 클릭하면 toast message를 띄어라!
            Toast.makeText(this, "1번 클릭", Toast.LENGTH_LONG).show()

            //2. 이미지를 클릭하면, 클릭한 이미지를 더 크게 보여줌
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }
    }
}