package com.example.first_project;

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
    }

    public void Btn1Click(View view) { // activity_sub의 onClick이랑 메소드 이름이 같아야 함
        // Toast 메시지를 띄우는 작업
        Toast toast = Toast.makeText(this, "zz", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10,10);
        toast.show();
    }
}
