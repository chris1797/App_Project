package com.example.first_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button Btn2 = findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            /**
             * 이걸로 log를 찍으면서 test할 수 있음, Logcat 창에서 확인 가능
             */
            @Override
            public void onClick(View view) {
                Log.d("TAG", "VALUE");
            }
        });

        findViewById(R.id.Btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                intent.putExtra("키", "위");
                startActivity(intent);
                /**
                 * 현재 class인 SubActivity.this에서 시작, MainActivity class를 호출하면
                 * MainActivity의 onCreate()가 실행됨
                 * 그 다음 onCreate() 내 setContentView(R.layout.activity_main); 창이 뜸
                 * 그러면 MainActivity를 찾을 수 없다고 logcat에 뜸
                 *
                 */
            }
        });
    }

    public void Btn1Click(View view) { // activity_sub의 onClick이랑 메소드 이름이 같아야 함
        // Toast 메시지를 띄우는 작업
        Toast toast = Toast.makeText(this, "zz", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10,10);
        toast.show();
    }
}
