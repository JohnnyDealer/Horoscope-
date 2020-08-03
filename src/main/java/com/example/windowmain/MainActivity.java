package com.example.windowmain;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button change_symbol, menu, exit;
    private TextView date, symbol;
    private MediaPlayer buttonSound;
    private TabLayout MyTabs;
    private ViewPager MyPage;
    private ImageView symbolPicture;
    final String FRAGMENT_EXTRA_INFO= "android:switcher:2131230735:0";
    final String FRAGMENT_BASIC_INFO = "android:switcher:2131230735:1";
    final String FRAGMENT_ADDITIONAL_INFO = "android:switcher:2131230735:2";
    final String DIR_SD = "MyFiles";
    final String FILENAME_SD = "Horoscope";
    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Horoscope.setHoroscope();
        buttonSound = MediaPlayer.create(this, R.raw.can);
        MyTabs = (TabLayout)findViewById(R.id.MyTabs);
        MyPage = (ViewPager)findViewById(R.id.MyPage);
        SetUpViewPager(MyPage);
        MyPage.setOffscreenPageLimit(2);
        MyPage.setCurrentItem(1,false);
        MyTabs.setupWithViewPager(MyPage);
        addListenerOnButton();
        Intent intent = new Intent(".Choice");
        startActivityForResult(intent,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String symbolText = data.getStringExtra("symbol");
        Horoscope.setSymbol(symbolText);
        symbol = findViewById(R.id.symbolBox);
        date = findViewById(R.id.dateBox);
        symbolPicture = findViewById(R.id.imageView);
        int id = getResources().getIdentifier("com.example.windowmain:drawable/" + symbolText.toLowerCase(), null, null);
        symbolPicture.setImageResource(id);
        symbol.setText("Ваш знак: " + Horoscope.getTranslateSymbol());
        date.setText(Horoscope.getDate());
        setBasicInfo();
        setElement();
        setElementText();
        setExtraInfo();
    }
    public void addListenerOnButton(){

        change_symbol = findViewById(R.id.change_symbolButton);
        menu = findViewById(R.id.menuButton);
        exit = findViewById(R.id.exitButton);
        change_symbol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay(buttonSound);
                        Intent intent = new Intent(".Choice");
                        startActivityForResult(intent,1);
                    }
                });
        menu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay(buttonSound);
                        Intent intent = new Intent(".Menu");
                        startActivity(intent);
                    }
                });
        exit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay(buttonSound);
                        AlertDialog.Builder alert_builder = new AlertDialog.Builder(MainActivity.this);
                        alert_builder.setMessage("Выйти из приложения?");
                        alert_builder.setCancelable(false);
                        alert_builder.setPositiveButton("Да", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                        alert_builder.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog alert = alert_builder.create();
                        alert.setTitle("Закрытие приложения");
                        alert.show();
                    }
                });
    }
    public void setElement(){
        Fragment fragment_additional_info = getSupportFragmentManager().findFragmentByTag(FRAGMENT_ADDITIONAL_INFO);
        try {
            //View v  = fragment_additional_info.getView().findViewById(R.id.textViewElement);
           // ((TextView)v).setText("asd");
           ((TextView) fragment_additional_info.getView().findViewById(R.id.textViewElement)).setText(Horoscope.getTranslateElement());
        }
        catch(NullPointerException e){

        }
    }
    public void setElementText(){
        Fragment fragment_additional_info = getSupportFragmentManager().findFragmentByTag(FRAGMENT_ADDITIONAL_INFO);
        try{
            ((TextView) fragment_additional_info.getView().findViewById(R.id.textViewElementText)).setText(Horoscope.getElementText());
            ((TextView) fragment_additional_info.getView().findViewById(R.id.textViewAdditional)).setText(Horoscope.getAdditionalText());
        }
        catch(NullPointerException e){

        }
    }
    public void setBasicInfo(){
        Fragment fragment_basic_info = getSupportFragmentManager().findFragmentByTag(FRAGMENT_BASIC_INFO);
        try{
            ((TextView) fragment_basic_info.getView().findViewById(R.id.textBoxToday)).setText(Horoscope.getText());
            ((TextView) fragment_basic_info.getView().findViewById(R.id.textBoxFamousPeople)).setText(Horoscope.getFamousPeople());
        }
        catch(NullPointerException e){

        }
    }
    public void setExtraInfo() {
        Fragment fragment_extra_info = getSupportFragmentManager().findFragmentByTag(FRAGMENT_EXTRA_INFO);
        try{
            ((TextView) fragment_extra_info.getView().findViewById(R.id.textViewRuler)).setText(Horoscope.getTranslateRuler());
            ((TextView) fragment_extra_info.getView().findViewById(R.id.textViewRulerText)).setText(Horoscope.getRulerText());
            ((TextView) fragment_extra_info.getView().findViewById(R.id.textViewExtraAdditional)).setText(Horoscope.getExtraAdditionalText());

        }
        catch(NullPointerException e){

        }
    }


    public void setFragments(){
        List<Fragment> MyFragments = getSupportFragmentManager().getFragments();
        Fragment fragment1 = getSupportFragmentManager().findFragmentByTag("android:switcher:2131230731:0");
        TextView testView1 = fragment1.getView().findViewById(R.id.textViewRuler);
        testView1.setText("Yesterday");
        Fragment fragment2 = getSupportFragmentManager().findFragmentByTag("android:switcher:2131230731:1");
        TextView testView2 = fragment2.getView().findViewById(R.id.textBoxToday);
        testView2.setText("Today");
        Fragment fragment3 = getSupportFragmentManager().findFragmentByTag("android:switcher:2131230731:2");
        //TextView testView3 = fragment3.getView().findViewById(R.id.textBoxTomorrow);
        //testView3.setText("Tomorrow");
    }
    public void writeFile() {
        try
        {
            FileOutputStream fileOutput = openFileOutput("example.txt", MODE_PRIVATE);
            for(int i = 0; i < Horoscope.getText().length(); i++)
            {
                fileOutput.write(((Horoscope.getText(i).getBytes())));
            }
            fileOutput.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public String readFile() {
        try {
            // открываем поток для чтения
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    openFileInput("example.txt")));
            String str = "";
            String text = "";
            // читаем содержимое
            while ((str = br.readLine()) != null) {
                //Log.d(LOG_TAG, str);
                text+=str;
            }
            return text;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    void writeFileSD() {
        // проверяем доступность SD
        if (!Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            Log.d(LOG_TAG, "SD-карта не доступна: " + Environment.getExternalStorageState());
            return;
        }
        // получаем путь к SD
        File sdPath = Environment.getExternalStorageDirectory();
        // добавляем свой каталог к пути
        sdPath = new File(sdPath.getAbsolutePath() + "/" + DIR_SD);
        // создаем каталог
        sdPath.mkdirs();
        // формируем объект File, который содержит путь к файлу
        File sdFile = new File(sdPath, FILENAME_SD);
        try {
            // открываем поток для записи
            BufferedWriter bw = new BufferedWriter(new FileWriter(sdFile));
            // пишем
            for(int i = 0; i < Horoscope.getText().length(); i++)
            {
                bw.write((Horoscope.getText(i)));
            }
            // bw.write("Содержимое файла на SD");
            // закрываем поток
            bw.close();
            Log.d(LOG_TAG, "Файл записан на SD: " + sdFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String readFileSD() {
        // проверяем доступность SD
        if (!Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            Log.d(LOG_TAG, "SD-карта не доступна: " + Environment.getExternalStorageState());
            return "";
        }
        // получаем путь к SD
        File sdPath = Environment.getExternalStorageDirectory();
        // добавляем свой каталог к пути
        sdPath = new File(sdPath.getAbsolutePath() + "/" + DIR_SD);
        // формируем объект File, который содержит путь к файлу
        File sdFile = new File(sdPath, FILENAME_SD);
        try {
            // открываем поток для чтения
            BufferedReader br = new BufferedReader(new FileReader(sdFile));
            String str = "";
            String text = "";
            // читаем содержимое
            while ((str = br.readLine()) != null) {
                text+=str;
                //Log.d(LOG_TAG, str);
            }
            return text;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
    public void checkSymbol() {
        symbol = findViewById(R.id.symbolBox);
        String str = symbol.getText().toString();
        if(str.equals("TextView"))
            symbol.setText("Знак не выбран");
        date = findViewById(R.id.dateBox);
        str = date.getText().toString();
        if(str.equals("TextView"))
            date.setVisibility(View.INVISIBLE);
    }
    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }
    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());
        Fragment fragmentYesterday = new FragmentExtraInfo();
        Fragment fragmentBasicInfo = new FragmentBasicInfo();
        Fragment fragmentAdditionalInfo = new FragmentAdditionalInfo();
        Adapter.AddFragmentPage(fragmentYesterday, "Дополнительно");
        Adapter.AddFragmentPage(fragmentBasicInfo, "Общее");
        Adapter.AddFragmentPage(fragmentAdditionalInfo, "Особенности");
        //We Need Fragment class now
        viewpage.setAdapter(Adapter);
    }
    public class MyViewPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> MyFragment = new ArrayList<>();
        private List<String> MyPageTittle = new ArrayList<>();

        public MyViewPageAdapter(FragmentManager manager){
            super(manager);
        }

        public void AddFragmentPage(Fragment frag, String title){
            MyFragment.add(frag);
            MyPageTittle.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return MyFragment.get(position);
//            Fragment fragment = null;
//            switch(position)
//            {
//                case 0:
//                    fragment = new FragmentExtraInfo();
//                    break;
//                case 1:
//                    fragment = new FragmentBasicInfo();
//                    break;
//                case 2:
//                    fragment = new FragmentAdditionalInfo();
//                    break;
//            }
//            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return MyPageTittle.get(position);
        }

        @Override
        public int getCount() {
            return MyPageTittle.size();
        }
    }
}
