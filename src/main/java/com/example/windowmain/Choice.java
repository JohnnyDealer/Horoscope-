package com.example.windowmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Choice extends AppCompatActivity {

    private Button symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
       // addListenerOnButton();
        Toast.makeText(Choice.this, "Выберите Ваш знак", Toast.LENGTH_SHORT).show();
    }
    public void sendInfo(View v)
    {
        String info = "";
        switch(v.getId())
        {
            case R.id.AriesButton:
                info = "Aries";
                break;
            case R.id.TaurusButton:
                info = "Taurus";
                break;
            case R.id.GeminiButton:
                info = "Gemini";
                break;
            case R.id.CancerButton:
                info = "Cancer";
                break;
            case R.id.LeoButton:
                info = "Leo";
                break;
            case R.id.VirgoButton:
                info = "Virgo";
                break;
            case R.id.LibraButton:
                info = "Libra";
                break;
            case R.id.ScorpioButton:
                info = "Scorpio";
                break;
            case R.id.SagittariusButton:
                info = "Sagittarius";
                break;
            case R.id.CapricornButton:
                info = "Capricorn";
                break;
            case R.id.AquariusButton:
                info = "Aquarius";
                break;
            case R.id.PiscesButton:
                info = "Pisces";
                break;
        }
        Intent intent = new Intent();
        intent.putExtra("symbol", info);
        setResult(RESULT_OK, intent);
        finish();
    }
    public void addListenerOnButton(){
        symbol = findViewById(R.id.LeoButton);

        symbol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.putExtra("name", "Тестовая строка");
                        setResult(RESULT_OK, intent);
                        finish();
//                        Intent intent = new Intent(".MainActivity");
//                        intent.putExtra("testString", "Hello!");
//                        startActivity(intent);
                    }
                });
    }
}
