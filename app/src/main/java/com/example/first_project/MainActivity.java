package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
        // activity_main은 res/layout/activity_main의 세팅값을 반₩
    }

    /**
     * onCreate() 다음에 호출되는 함수
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}

