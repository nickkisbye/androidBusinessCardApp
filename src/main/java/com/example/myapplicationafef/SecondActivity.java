package com.example.myapplicationafef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void goToFirstPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goToSecondPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    
        public void goToThirdPage(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
    
}
