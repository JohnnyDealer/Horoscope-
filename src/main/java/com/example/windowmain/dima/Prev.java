package com.example.windowmain.dima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.windowmain.R;
import com.example.windowmain.dima.SuccessTest;

public class Prev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev);
    }

    public void Go(View view){
        Intent Test = new Intent(this, SuccessTest.class);
        startActivity(Test);
    }
}
