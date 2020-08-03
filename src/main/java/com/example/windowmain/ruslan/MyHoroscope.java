package com.example.windowmain.ruslan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.windowmain.Horoscope;
import com.example.windowmain.R;

public class MyHoroscope extends AppCompatActivity {

    private TextView symbol, date;
    private Spinner sphereSpinner, horoscopeDateSpinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_horoscope);
        symbol = findViewById(R.id.mySymbolBox);
        symbol.setText(Horoscope.getSymbol());
        date = findViewById(R.id.myDateBox);
        date.setText(Horoscope.getDate());
        //Спиннеры
        sphereSpinner = findViewById(R.id.sphereSpinner);
        horoscopeDateSpinner = findViewById(R.id.horoscopeDateSpinner);
        setSpinnerAdapter(sphereSpinner, Horoscope.getSpheres());
        setSpinnerAdapter(horoscopeDateSpinner, Horoscope.getHoroscopeDays());
        addListenerOnSpinner();
    }

    public void setSpinnerAdapter(Spinner spinner, String[] items) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    public void addListenerOnSpinner(){

        sphereSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int position, long id) {
                String item = (String) parent.getItemAtPosition(position);
                TextView sphereText = findViewById(R.id.sphereTextBox);
                switch (item) {
                    case "Общее описание":
                        sphereText.setText("На первый взгляд Девы кажутся многим погрязшими в материальных проблемах и бытовых мелочах, но это впечатление обманчиво. Просто эти люди необыкновенно внимательны и непроизвольно отмечают несовершенства этого мира, особенно в тех областях, где исправить ситуацию в их силах. Именно поэтому среднестатистическая Дева печется о чистоте в доме - подобно Маленькому принцу, человек этого знака старается привести в порядок свою планету, а если это невозможно, то хотя бы принадлежащий ему уголок.");
                        break;
                    case "Карьера и профессия":
                        sphereText.setText("Тут описание карьеры и профессии");
                        break;
                    case "Здоровье":
                        sphereText.setText("Тут описание здоровья");
                        break;
                    case "Психологический портрет":
                        sphereText.setText("Тут описание портрета");
                        break;
                    case "Брак и совместимость":
                        sphereText.setText("Тут описание брака и совместимости");
                        break;
                }
            }
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });

        horoscopeDateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View selectedItemView, int position, long id) {
                String item = (String) parent.getItemAtPosition(position);
                TextView horoscopeText = findViewById(R.id.horoscopeTextBox);
                switch (item) {
                    case "сегодня":
                        horoscopeText.setText("Не самый простой день. Есть шанс совершить ошибку, сделать шаг, о котором почти сразу придется пожалеть. Многие склонны торопиться, принимать решения на ходу, хотя стоило бы спокойно обдумать сложившуюся ситуацию. Помните, что у вас есть возможность взять небольшую паузу, чтобы во всем разобраться.");
                        break;
                    case "завтра":
                        horoscopeText.setText("Тут гороскоп на завтра");
                        break;
                    case "неделю":
                        horoscopeText.setText("Тут гороскоп на неделю");
                        break;
                    case "месяц":
                        horoscopeText.setText("Тут гороскоп на месяц");
                        break;
                    case "год":
                        horoscopeText.setText("Тут гороскоп на год");
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String symbolText = data.getStringExtra("symbol");
        //Horoscope.setSymbol(symbolText);
        //symbol.setText(Horoscope.getSymbol());
        //date.setText(Horoscope.getDate());
    }

}
