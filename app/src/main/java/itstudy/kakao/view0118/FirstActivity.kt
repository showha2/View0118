package itstudy.kakao.view0118

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        //버튼의 클릭 이벤트
        btnSubCall.setOnClickListener{
            //출력할 하위 Activity를 Intent로 생성
            //val intent = Intent(this, SubActivity::class.java)

            /*
            //암시적 인텐트
            val intent = Intent()
            intent.setAction("com.kakao.ACTION_VIEW")

            //Intent를 Activity로 호출
            startActivity(intent)

             */

            //명시적 Intent 생성
           val intent = Intent(this,
                SubActivity::class.java)
            //Intent에 데이터를 저장
            intent.putExtra("name", "사이버가수 아담")
            //액티비티 호출
            //startActivity(intent)

            //하위 액티비티로부터 데이터를 받고자 할 때 호출
            startActivityForResult(intent, 1)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 1 && resultCode == 101){
            //
            val song = data?.getStringExtra("song")
            //
            lblFirst.text = song
        }
    }
}