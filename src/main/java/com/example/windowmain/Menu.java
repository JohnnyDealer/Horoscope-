package com.example.windowmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button myHoroscope, compatibility, affairs, test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        myHoroscope = findViewById(R.id.myHoroscopeButton);
        compatibility = findViewById(R.id.compatibilityButton);
        affairs = findViewById(R.id.affairsButton);
        test = findViewById(R.id.testButton);
        myHoroscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".MyHoroscope");
                startActivity(intent);
                finish();
            }
        });
        compatibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".Compatibility");
                startActivity(intent);
                finish();
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".SuccessTest");
                startActivity(intent);
                finish();
            }
        });
        affairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".Affairs");
                startActivity(intent);
                finish();
            }
        });


    }
}
