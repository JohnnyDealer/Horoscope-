package com.example.windowmain.dima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.windowmain.R;

public class SuccessTest extends AppCompatActivity {

    public final static String EXTRA_RESULT = "EXTRA_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_test);
    }
    public void Submit(View view){
        if (!IsEveryChecked()){
            TextView message = (TextView)findViewById(R.id.not_all);
            message.setText("Вы что-то пропустили.");

            return;
        }

        int sum = getSum();

        double score = (double)sum / 40 * 100;

        int passion = Integer.parseInt(getString(R.string.passion_pisces));

        boolean success;
        if (score <= passion){
            success = true;
        }
        else {
            success = false;
        }

        Intent showRes = new Intent(this, Res.class);
        showRes.putExtra(EXTRA_RESULT, success);
        startActivity(showRes);
    }

    private boolean IsEveryChecked(){
        if (!IsChecked(R.id.answeres_1))
            return false;
        if (!IsChecked(R.id.answeres_2))
            return false;
        if (!IsChecked(R.id.answeres_3))
            return false;
        if (!IsChecked(R.id.answeres_4))
            return false;
        if (!IsChecked(R.id.answeres_5))
            return false;
        if (!IsChecked(R.id.answeres_6))
            return false;
        if (!IsChecked(R.id.answeres_7))
            return false;
        if (!IsChecked(R.id.answeres_8))
            return false;
        if (!IsChecked(R.id.answeres_9))
            return false;
        if (!IsChecked(R.id.answeres_10))
            return false;

        return true;
    }
    private boolean IsChecked(int answeres_id){
        int id = ((RadioGroup)findViewById(answeres_id) )
                .getCheckedRadioButtonId();

        if (id == -1)
            return false;

        return true;
    }
    private int getSum(){
        int sum = 0;

        sum += getScore(R.id.answeres_1);
        sum += getScore(R.id.answeres_2);
        sum += getScore(R.id.answeres_3);
        sum += getScore(R.id.answeres_4);
        sum += getScore(R.id.answeres_5);
        sum += getScore(R.id.answeres_6);
        sum += getScore(R.id.answeres_7);
        sum += getScore(R.id.answeres_8);
        sum += getScore(R.id.answeres_9);
        sum += getScore(R.id.answeres_10);

        return sum;
    }
    private int getScore(int answeres_id){
        int score = Integer.parseInt(
                getCheckedRadioFor(answeres_id)
                        .getTag().toString() );

        return score;
    }
    private RadioButton getCheckedRadioFor(int answeres_id){
        int id = ((RadioGroup)findViewById(answeres_id) )
                .getCheckedRadioButtonId();

        RadioButton radio = (RadioButton) findViewById(id);

        return radio;
    }
}

