package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_move;
    private EditText et_test;
    private String str;
    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //onCreate 앱이 실행할 때 이 밑에 있는 구문들을 한번 실행을 해줘라
        setContentView(R.layout.activity_main); //이 자바파일의 콘텐트뷰를 이쪽으로 연결해라

        et_test = findViewById(R.id.et_test);
        btn_move = findViewById(R.id.btn_move);
        test = (ImageView)findViewById(R.id.test);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class); //인자 두개를 적는다 첫번쨰는 현재 액티비티 두번째는 이동하고 싶은 액티비티
                intent.putExtra("str", str); //name은 전달받는 액티비티에서 사용할 별칭 뒤의 str은 실제 데이터
                startActivity(intent); //액티비티 이동
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "홍드로이드 잘생김", Toast.LENGTH_SHORT).show();//토스트 메시지  //getApplicationContext는 현재 애플리케이션
            }
        });


    }
}