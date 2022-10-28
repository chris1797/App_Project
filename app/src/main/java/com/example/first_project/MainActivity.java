package com.example.first_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * App이 최초로 시작할 때 발동되는 함수
     * @param savedInstanceState  현재 UI를 일단 저장해놓는 것
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // R은 Resource의 약자,
        // activity_main은 res/layout/activity_main의 세팅값을 반환

        // SubActivity에서 넘겨준 intent 데이터를 받는 것
        Intent intent = getIntent();
        String str = intent.getExtras().getString("키");
        ((EditText)findViewById(R.id.edit_text)).setText(str);
    }

    // onCreate() 다음에 호출되는 함수
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}

