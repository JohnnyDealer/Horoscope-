package com.example.windowmain.dima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.windowmain.MainActivity;
import com.example.windowmain.R;
import com.example.windowmain.dima.SuccessTest;

public class Res extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        Intent showRes = getIntent();
        boolean success = showRes.getBooleanExtra(SuccessTest.EXTRA_RESULT, true);

        if (success){
            ((TextView)findViewById(R.id.res_header)).setText(R.string.succsess_case);
            ((TextView)findViewById(R.id.res)).setText(R.string.success);
        }
        else {
            ((TextView)findViewById(R.id.res_header)).setText(R.string.tooamb_case);
            ((TextView)findViewById(R.id.res)).setText(R.string.tooamb);
        }
    }

    public void Again(View view){
        Intent test = new Intent(this, MainActivity.class);
        startActivity(test);
    }

    public void ToMainMenu(View view){

    }
}
