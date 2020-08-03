package com.example.windowmain.semen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.windowmain.Horoscope;
import com.example.windowmain.R;
import com.google.android.material.tabs.TabLayout;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PageActivity extends AppCompatActivity {
    String temp1 = Horoscope.getSymbol().toLowerCase();
    String text1 = null;
    String text2 = null;
    FragmentOne frag1;
    FragmentTwo frag2;
    FragmentTransaction fTrans;
    View fragView1;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        int id = getResources().getIdentifier("com.example.windowmain:drawable/" + Horoscope.getSymbol().toLowerCase(), null, null);
        image1.setImageResource(id);
        //TextView frtext2 = findViewById(R.id.fragmenttext2);
        TextView textView = findViewById(R.id.text1);
        textView.setText("Гороскопическая связь между гороскопами");
        Bundle arguments = getIntent().getExtras();
        frag1 = new FragmentOne();
        frag2 = new FragmentTwo();
        fTrans = getSupportFragmentManager().beginTransaction();
        fTrans.add(R.id.frgmCont, frag2, "fragment2");
        fTrans.hide(frag2);
        fTrans.add(R.id.frgmCont, frag1, "fragment1");
        fTrans.commit();

        if (arguments != null) {
            String temp2= arguments.get("temp").toString();
            int drawable = (int) arguments.get("drawable");
            image2.setImageResource(drawable);
            MyTask mt = new MyTask(temp2);
            mt.execute();
        }
    }

    public void Action(View v) {
        List<Fragment> MyFragments = getSupportFragmentManager().getFragments();
        fTrans = getSupportFragmentManager().beginTransaction();
        Fragment fragment1 = getSupportFragmentManager().findFragmentByTag("fragment1");
        Fragment fragment2 = getSupportFragmentManager().findFragmentByTag("fragment2");
        switch (v.getId()) {
            case R.id.button:
                fTrans.hide(frag2);
                fTrans.show(frag1);
                break;
            case R.id.button2:
                fTrans.hide(frag1);
                fTrans.show(frag2);
                break;
        }
        fTrans.commit();
    }

    class MyTask extends AsyncTask<Void, Void, Void> {

        String temp2;
        String temp = null;


        public MyTask(String temp) {
            this.temp2 = temp;
        }

        @Override
        protected Void doInBackground(Void... params) {
            String link = "https://dailyhoro.ru/compatibility/show/friends/?z1=" + temp1 + "&z2=" + temp2;
            Element element;
            Document doc = null;

            try {
                doc = Jsoup.connect(link).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (doc != null) {
                element = doc.select("div.left_different").get(0);
                temp = element.text();
                String[] obzezka1 = temp.split("Узнать совместимость с другими знаками Зодиака");
                text1 = obzezka1[0];


            }
            String link2 = "https://dailyhoro.ru/compatibility/show/colleagues/?z1=" + temp1 + "&z2=" + temp2;
            Element element2;
            Document doc2 = null;

            try {
                doc2 = Jsoup.connect(link2).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (doc2 != null) {
                element2 = doc2.select("div.left_different").get(0);
                temp = element2.text();
                String[] obzezka2 = temp.split("Узнать совместимость с другими знаками Зодиака");
                text2 = obzezka2[0];


            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
//            Fragment fragment1 = getSupportFragmentManager().findFragmentById(R.id.Frame1);
//            ((TextView)fragment1.getView().findViewById(R.id.fragmenttext1)).setText(text1);
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            Fragment fragment = (Fragment) fragmentManager
//                    .findFragmentById(R.id.Frame1);
//            if (fragment != null)
//                ((TextView)fragment.getView().findViewById(R.id.fragmenttext1)).setText(text1);
            fTrans.hide(frag2);
            fTrans.show(frag1);
            ((TextView)frag1.getView().findViewById(R.id.fragmenttext1)).setText(text1);
            ((TextView)frag2.getView().findViewById(R.id.fragmenttext2)).setText(text2);

        }
    }

}
