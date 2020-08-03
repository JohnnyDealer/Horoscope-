package com.example.windowmain.roman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.windowmain.R;

public class ChoiceCompatibility extends AppCompatActivity
{
    private Button oven, telec, blizneci, rak, lev, deva, vesi, kozerog, vodolei, strelec, ribi, scorpion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_compatibility);
    }

    public void onClick(View v)
    {
        String znak = "";
        switch (v.getId())
        {
            case R.id.oven:
                znak = "oven";
                break;
            case R.id.telec:
                znak = "telec";
                break;
            case R.id.blizneci:
                znak = "blizneci";
                break;
            case R.id.rak:
                znak = "rak";
                break;
            case R.id.lev:
                znak = "lev";
                break;
            case R.id.deva:
                znak = "deva";
                break;
            case R.id.vesi:
                znak = "vesi";
                break;
            case R.id.kozerog:
                znak = "kozerog";
                break;
            case R.id.vodolei:
                znak = "vodolei";
                break;
            case R.id.strelec:
                znak = "strelec";
                break;
            case R.id.ribi:
                znak = "ribi";
                break;
            case R.id.scorpion:
                znak = "scorpion";
                break;
            default:
                break;
        }

        Intent intent = new Intent();
        intent.putExtra("znak", znak);
        setResult(RESULT_OK, intent);
        finish();
    }
}
