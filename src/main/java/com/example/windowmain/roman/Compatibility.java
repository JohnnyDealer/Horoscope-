package com.example.windowmain.roman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.windowmain.R;

import java.util.Objects;

public class Compatibility extends AppCompatActivity
    {

        private Button znak1, znak2, check;
        private TextView znak1Text, znak2Text, procent;
        private ImageView ovenImage1, telecImage1, blizneciImage1, rakImage1, levImage1, devaImage1, vesiImage1, kozerogImage1, vodoleiImage1, strelecImage1, ribiImage1, scorpionImage1, ovenImage2, telecImage2, blizneciImage2, rakImage2, levImage2, devaImage2, vesiImage2, kozerogImage2, vodoleiImage2, strelecImage2, ribiImage2, scorpionImage2;
        private TextView ovenoven, oventelec, ovenblizneci, ovenrak, ovenlev, ovendeva, ovenvesi, ovenscorpion, ovenstrelec, ovenkozerog, ovenvodolei, ovenribi, telectelec, telecblizneci, telecrak, teleclev, telecdeva, telecvesi, telecscorpion, telecstrelec, teleckozerog, telecvodolei, telecribi, blizneciblizneci, bliznecirak, bliznecilev, bliznecideva, bliznecivesi, blizneciscorpion, bliznecistrelec, bliznecikozerog, bliznecivodolei, blizneciribi, rakrak, raklev, rakdeva, rakvesi, rakscorpion, rakstrelec, rakkozerog, rakvodolei, rakribi, levlev, levdeva, levvesi, levscorpion, levstrelec, levkozerog, levvodolei, levribi, devadeva, devavesi, devascorpion, devastrelec, devakozerog, devavodolei, devaribi, vesivesi, vesiscorpion, vesistrelec, vesikozerog, vesivodolei, vesiribi, scorpionscorpion, scorpionstrelec, scorpionkozerog, scorpionvodolei, scorpionribi, strelecstrelec, streleckozerog, strelecvodolei, strelecribi, kozerogkozerog, kozerogvodolei, kozerogribi, vodoleivodolei, vodoleiribi, ribiribi;
        private ProgressBar progressBar;
        private  ImageView mj;

        final int REQUEST_CODE_ZNAK1 = 1;
        final int REQUEST_CODE_ZNAK2 = 2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_compatibility);
            znak1Text = (TextView) findViewById(R.id.znak1Text);
            znak2Text = (TextView) findViewById(R.id.znak2Text);
            procent = findViewById(R.id.procent);

            progressBar = findViewById(R.id.progressBar);

            mj = findViewById(R.id.mj);

            ovenImage1 = findViewById(R.id.ovenImage1);
            telecImage1 = findViewById(R.id.telecImage1);
            blizneciImage1 = findViewById(R.id.blizneciImage1);
            rakImage1 = findViewById(R.id.rakImage1);
            levImage1 = findViewById(R.id.levImage1);
            devaImage1 = findViewById(R.id.devaImage1);
            vesiImage1 = findViewById(R.id.vesiImage1);
            kozerogImage1 = findViewById(R.id.kozerogImage1);
            vodoleiImage1 = findViewById(R.id.vodoleiImage1);
            strelecImage1 = findViewById(R.id.strelecImage1);
            ribiImage1 = findViewById(R.id.ribiImage1);
            scorpionImage1 = findViewById(R.id.scorpionImage1);

            ovenImage2 = findViewById(R.id.ovenImage2);
            telecImage2 = findViewById(R.id.telecImage2);
            blizneciImage2 = findViewById(R.id.blizneciImage2);
            rakImage2 = findViewById(R.id.rakImage2);
            levImage2 = findViewById(R.id.levImage2);
            devaImage2 = findViewById(R.id.devaImage2);
            vesiImage2 = findViewById(R.id.vesiImage2);
            kozerogImage2 = findViewById(R.id.kozerogImage2);
            vodoleiImage2 = findViewById(R.id.vodoleiImage2);
            strelecImage2 = findViewById(R.id.strelecImage2);
            ribiImage2 = findViewById(R.id.ribiImage2);
            scorpionImage2 = findViewById(R.id.scorpionImage2);

            ovenoven = (TextView) findViewById(R.id.OvenOven);
            oventelec = (TextView) findViewById(R.id.ovenTelec);
            ovenblizneci = (TextView) findViewById(R.id.ovenBlizneci);
            ovenrak = (TextView) findViewById(R.id.ovenRak);
            ovenlev = (TextView) findViewById(R.id.ovenLev);
            ovendeva = (TextView) findViewById(R.id.DevaOven);
            ovenvesi = (TextView) findViewById(R.id.ovenVesi);
            ovenscorpion = (TextView) findViewById(R.id.ovenScorpion);
            ovenstrelec = (TextView) findViewById(R.id.ovenStrelec);
            ovenkozerog = (TextView) findViewById(R.id.ovenKozerog);
            ovenvodolei = (TextView) findViewById(R.id.ovenVodolei);
            ovenribi = (TextView) findViewById(R.id.RibiOven);
            telectelec = (TextView) findViewById(R.id.TelecTelec);
            telecblizneci = (TextView) findViewById(R.id.telecBlizneci);
            telecrak = (TextView) findViewById(R.id.telecRak);
            teleclev = (TextView) findViewById(R.id.telecLev);
            telecdeva = (TextView) findViewById(R.id.devaTelec);
            telecvesi = (TextView) findViewById(R.id.telecVesi);
            telecscorpion = (TextView) findViewById(R.id.telecScorpion);
            telecstrelec = (TextView) findViewById(R.id.telecStrelec);
            teleckozerog = (TextView) findViewById(R.id.telecKozerog);
            telecvodolei = (TextView) findViewById(R.id.telecVodolei);
            telecribi = (TextView) findViewById(R.id.ribiTelec);
            blizneciblizneci = (TextView) findViewById(R.id.BlizneciBlizneci);
            bliznecirak = (TextView) findViewById(R.id.blizneciRak);
            bliznecilev = (TextView) findViewById(R.id.blizneciLev);
            bliznecideva = (TextView) findViewById(R.id.devaBlizneci);
            bliznecivesi = (TextView) findViewById(R.id.blizneciVesi);
            blizneciscorpion = (TextView) findViewById(R.id.blizneciScorpion);
            bliznecistrelec = (TextView) findViewById(R.id.blizneciStrelec);
            bliznecikozerog = (TextView) findViewById(R.id.blizneciKozerog);
            bliznecivodolei = (TextView) findViewById(R.id.blizneciVodolei);
            blizneciribi = (TextView) findViewById(R.id.ribiBlizneci);
            rakrak = (TextView) findViewById(R.id.RakRak);
            raklev = (TextView) findViewById(R.id.rakLev);
            rakdeva = (TextView) findViewById(R.id.devaRak);
            rakvesi = (TextView) findViewById(R.id.rakVesi);
            rakscorpion = (TextView) findViewById(R.id.rakScorpion);
            rakstrelec = (TextView) findViewById(R.id.rakStrelec);
            rakkozerog = (TextView) findViewById(R.id.rakKozerog);
            rakvodolei = (TextView) findViewById(R.id.rakVodolei);
            rakribi = (TextView) findViewById(R.id.ribiRak);
            levlev = (TextView) findViewById(R.id.LevLev);
            levdeva = (TextView) findViewById(R.id.devaLev);
            levvesi = (TextView) findViewById(R.id.levVesi);
            levscorpion = (TextView) findViewById(R.id.levScorpion);
            levstrelec = (TextView) findViewById(R.id.levStrelec);
            levkozerog = (TextView) findViewById(R.id.levKozerog);
            levvodolei = (TextView) findViewById(R.id.levVodolei);
            levribi = (TextView) findViewById(R.id.ribiLev);
            devadeva = (TextView) findViewById(R.id.devaDeva);
            devavesi = (TextView) findViewById(R.id.devaVesi);
            devascorpion = (TextView) findViewById(R.id.devaScorpion);
            devastrelec = (TextView) findViewById(R.id.devaStrelec);
            devakozerog = (TextView) findViewById(R.id.devaKozerog);
            devavodolei = (TextView) findViewById(R.id.devaVodolei);
            devaribi = (TextView) findViewById(R.id.devaRibi);
            vesivesi = (TextView) findViewById(R.id.VesiVesi);
            vesiscorpion = (TextView) findViewById(R.id.VesiScorpion);
            vesistrelec = (TextView) findViewById(R.id.vesiStrelec);
            vesikozerog = (TextView) findViewById(R.id.vesiKozerog);
            vesivodolei = (TextView) findViewById(R.id.vesiVodolei);
            vesiribi = (TextView) findViewById(R.id.ribiVesi);
            scorpionscorpion = (TextView) findViewById(R.id.ScorpionScorpion);
            scorpionstrelec = (TextView) findViewById(R.id.scorpionStrelec);
            scorpionkozerog = (TextView) findViewById(R.id.scorpionKozerog);
            scorpionvodolei = (TextView) findViewById(R.id.scorpionVodolei);
            scorpionribi = (TextView) findViewById(R.id.ribiScorpion);
            strelecstrelec = (TextView) findViewById(R.id.StrelecStrelec);
            streleckozerog = (TextView) findViewById(R.id.strelecKozerog);
            strelecvodolei = (TextView) findViewById(R.id.strelecVodolei);
            strelecribi = (TextView) findViewById(R.id.ribiStrelec);
            kozerogkozerog = (TextView) findViewById(R.id.KozerogKozerog);
            kozerogvodolei = (TextView) findViewById(R.id.kozerogVodolei);
            kozerogribi = (TextView) findViewById(R.id.ribiKozerog);
            vodoleivodolei = (TextView) findViewById(R.id.VodoleiVodolei);
            vodoleiribi = (TextView) findViewById(R.id.ribiVodolei);
            ribiribi = (TextView) findViewById(R.id.ribiRibi);
        }

        public void onClick(View v) {
            Intent intent = new Intent(this, ChoiceCompatibility.class);
            switch (v.getId())
            {
                case R.id.znak1:
                    progressBar.setProgress(0);
                    procent.setText(null);
                    mj.setVisibility(View.INVISIBLE);

                    devaImage1.setVisibility(View.INVISIBLE);
                    ovenImage1.setVisibility(View.INVISIBLE);
                    telecImage1.setVisibility(View.INVISIBLE);
                    blizneciImage1.setVisibility(View.INVISIBLE);
                    rakImage1.setVisibility(View.INVISIBLE);
                    levImage1.setVisibility(View.INVISIBLE);
                    vesiImage1.setVisibility(View.INVISIBLE);
                    scorpionImage1.setVisibility(View.INVISIBLE);
                    strelecImage1.setVisibility(View.INVISIBLE);
                    kozerogImage1.setVisibility(View.INVISIBLE);
                    vodoleiImage1.setVisibility(View.INVISIBLE);
                    ribiImage1.setVisibility(View.INVISIBLE);
                    startActivityForResult(intent, REQUEST_CODE_ZNAK1);
                    break;
                case R.id.znak2:
                    progressBar.setProgress(0);
                    procent.setText(null);
                    mj.setVisibility(View.INVISIBLE);

                    devaImage2.setVisibility(View.INVISIBLE);
                    ovenImage2.setVisibility(View.INVISIBLE);
                    telecImage2.setVisibility(View.INVISIBLE);
                    blizneciImage2.setVisibility(View.INVISIBLE);
                    rakImage2.setVisibility(View.INVISIBLE);
                    levImage2.setVisibility(View.INVISIBLE);
                    vesiImage2.setVisibility(View.INVISIBLE);
                    scorpionImage2.setVisibility(View.INVISIBLE);
                    strelecImage2.setVisibility(View.INVISIBLE);
                    kozerogImage2.setVisibility(View.INVISIBLE);
                    vodoleiImage2.setVisibility(View.INVISIBLE);
                    ribiImage2.setVisibility(View.INVISIBLE);
                    startActivityForResult(intent, REQUEST_CODE_ZNAK2);
                    break;
                case R.id.check:
                    String znak1 = znak1Text.getText().toString();
                    String znak2 = znak2Text.getText().toString();
                    mj.setVisibility(View.VISIBLE);
                    ovenoven.setVisibility(View.INVISIBLE);
                    oventelec.setVisibility(View.INVISIBLE);
                    ovenblizneci.setVisibility(View.INVISIBLE);
                    ovenrak.setVisibility(View.INVISIBLE);
                    ovenlev.setVisibility(View.INVISIBLE);
                    ovendeva.setVisibility(View.INVISIBLE);
                    ovenvesi.setVisibility(View.INVISIBLE);
                    ovenscorpion.setVisibility(View.INVISIBLE);
                    ovenstrelec.setVisibility(View.INVISIBLE);
                    ovenkozerog.setVisibility(View.INVISIBLE);
                    ovenvodolei.setVisibility(View.INVISIBLE);
                    ovenribi.setVisibility(View.INVISIBLE);
                    telectelec.setVisibility(View.INVISIBLE);
                    telecblizneci.setVisibility(View.INVISIBLE);
                    telecrak.setVisibility(View.INVISIBLE);
                    teleclev.setVisibility(View.INVISIBLE);
                    telecdeva.setVisibility(View.INVISIBLE);
                    telecvesi.setVisibility(View.INVISIBLE);
                    telecscorpion.setVisibility(View.INVISIBLE);
                    telecstrelec.setVisibility(View.INVISIBLE);
                    teleckozerog.setVisibility(View.INVISIBLE);
                    telecvodolei.setVisibility(View.INVISIBLE);
                    telecribi.setVisibility(View.INVISIBLE);
                    rakrak.setVisibility(View.INVISIBLE);
                    raklev.setVisibility(View.INVISIBLE);
                    rakdeva.setVisibility(View.INVISIBLE);
                    rakvesi.setVisibility(View.INVISIBLE);
                    rakscorpion.setVisibility(View.INVISIBLE);
                    rakstrelec.setVisibility(View.INVISIBLE);
                    rakkozerog.setVisibility(View.INVISIBLE);
                    rakvodolei.setVisibility(View.INVISIBLE);
                    rakribi.setVisibility(View.INVISIBLE);
                    blizneciblizneci.setVisibility(View.INVISIBLE);
                    bliznecirak.setVisibility(View.INVISIBLE);
                    bliznecilev.setVisibility(View.INVISIBLE);
                    bliznecideva.setVisibility(View.INVISIBLE);
                    bliznecivesi.setVisibility(View.INVISIBLE);
                    blizneciscorpion.setVisibility(View.INVISIBLE);
                    bliznecistrelec.setVisibility(View.INVISIBLE);
                    bliznecikozerog.setVisibility(View.INVISIBLE);
                    bliznecivodolei.setVisibility(View.INVISIBLE);
                    blizneciribi.setVisibility(View.INVISIBLE);
                    levlev.setVisibility(View.INVISIBLE);
                    levdeva.setVisibility(View.INVISIBLE);
                    levvesi.setVisibility(View.INVISIBLE);
                    levscorpion.setVisibility(View.INVISIBLE);
                    levstrelec.setVisibility(View.INVISIBLE);
                    levkozerog.setVisibility(View.INVISIBLE);
                    levvodolei.setVisibility(View.INVISIBLE);
                    levribi.setVisibility(View.INVISIBLE);
                    devadeva.setVisibility(View.INVISIBLE);
                    devavesi.setVisibility(View.INVISIBLE);
                    devascorpion.setVisibility(View.INVISIBLE);
                    devastrelec.setVisibility(View.INVISIBLE);
                    devakozerog.setVisibility(View.INVISIBLE);
                    devavodolei.setVisibility(View.INVISIBLE);
                    devaribi.setVisibility(View.INVISIBLE);
                    vesivesi.setVisibility(View.INVISIBLE);
                    vesiscorpion.setVisibility(View.INVISIBLE);
                    vesistrelec.setVisibility(View.INVISIBLE);
                    vesikozerog.setVisibility(View.INVISIBLE);
                    vesivodolei.setVisibility(View.INVISIBLE);
                    vesiribi.setVisibility(View.INVISIBLE);
                    scorpionscorpion.setVisibility(View.INVISIBLE);
                    scorpionstrelec.setVisibility(View.INVISIBLE);
                    scorpionkozerog.setVisibility(View.INVISIBLE);
                    scorpionvodolei.setVisibility(View.INVISIBLE);
                    scorpionribi.setVisibility(View.INVISIBLE);
                    strelecstrelec.setVisibility(View.INVISIBLE);
                    streleckozerog.setVisibility(View.INVISIBLE);
                    strelecvodolei.setVisibility(View.INVISIBLE);
                    strelecribi.setVisibility(View.INVISIBLE);
                    kozerogkozerog.setVisibility(View.INVISIBLE);
                    kozerogvodolei.setVisibility(View.INVISIBLE);
                    kozerogribi.setVisibility(View.INVISIBLE);
                    vodoleivodolei.setVisibility(View.INVISIBLE);
                    vodoleiribi.setVisibility(View.INVISIBLE);
                    ribiribi.setVisibility(View.INVISIBLE);
                    if (znak1.equals("oven") && Objects.equals(znak2, "oven"))
                    {
                        ovenoven.setVisibility(View.VISIBLE);
                        procent.setText("91%");
                        progressBar.setProgress(91);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "telec") || Objects.equals(znak1, "telec") && Objects.equals(znak2, "oven")) {
                        oventelec.setVisibility(View.VISIBLE);
                        procent.setText("81%");
                        progressBar.setProgress(81);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "blizneci") || Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "oven")) {
                        ovenblizneci.setVisibility(View.VISIBLE);
                        procent.setText("65%");
                        progressBar.setProgress(65);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "rak") || Objects.equals(znak1, "rak") && Objects.equals(znak2, "oven")) {
                        ovenrak.setVisibility(View.VISIBLE);
                        procent.setText("81%");
                        progressBar.setProgress(81);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "lev") || Objects.equals(znak1, "lev") && Objects.equals(znak2, "oven")) {
                        ovenlev.setVisibility(View.VISIBLE);
                        procent.setText("100%");
                        progressBar.setProgress(100);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "deva") || Objects.equals(znak1, "deva") && Objects.equals(znak2, "oven")) {
                        ovendeva.setVisibility(View.VISIBLE);
                        procent.setText("84%");
                        progressBar.setProgress(84);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "vesi") || Objects.equals(znak1, "vesi") && Objects.equals(znak2, "oven")) {
                        ovenvesi.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "oven")) {
                        ovenscorpion.setVisibility(View.VISIBLE);
                        procent.setText("97%");
                        progressBar.setProgress(97);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "oven")) {
                        ovenstrelec.setVisibility(View.VISIBLE);
                        procent.setText("92%");
                        progressBar.setProgress(92);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "oven")) {
                        ovenkozerog.setVisibility(View.VISIBLE);
                        procent.setText("82%");
                        progressBar.setProgress(82);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "oven")) {
                        ovenvodolei.setVisibility(View.VISIBLE);
                        procent.setText("82%");
                        progressBar.setProgress(82);
                    }
                    if (Objects.equals(znak1, "oven") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "oven")) {
                        ovenribi.setVisibility(View.VISIBLE);
                        procent.setText("87%");
                        progressBar.setProgress(87);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "telec")) {
                        telectelec.setVisibility(View.VISIBLE);
                        procent.setText("93%");
                        progressBar.setProgress(93);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "blizneci") || Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "telec")) {
                        telecblizneci.setVisibility(View.VISIBLE);
                        procent.setText("73%");
                        progressBar.setProgress(73);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "rak") || Objects.equals(znak1, "rak") && Objects.equals(znak2, "telec")) {
                        telecrak.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "lev") || Objects.equals(znak1, "lev") && Objects.equals(znak2, "telec")) {
                        teleclev.setVisibility(View.VISIBLE);
                        procent.setText("96%");
                        progressBar.setProgress(96);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "deva") || Objects.equals(znak1, "deva") && Objects.equals(znak2, "telec")) {
                        telecdeva.setVisibility(View.VISIBLE);
                        procent.setText("92%");
                        progressBar.setProgress(92);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "vesi") || Objects.equals(znak1, "vesi") && Objects.equals(znak2, "telec")) {
                        telecvesi.setVisibility(View.VISIBLE);
                        procent.setText("92%");
                        progressBar.setProgress(92);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "telec")) {
                        telecscorpion.setVisibility(View.VISIBLE);
                        procent.setText("100%");
                        progressBar.setProgress(100);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "telec")) {
                        telecstrelec.setVisibility(View.VISIBLE);
                        procent.setText("81%");
                        progressBar.setProgress(81);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "telec")) {
                        teleckozerog.setVisibility(View.VISIBLE);
                        procent.setText("98%");
                        progressBar.setProgress(98);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "telec")) {
                        telecvodolei.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "telec") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "telec")) {
                        telecribi.setVisibility(View.VISIBLE);
                        procent.setText("91%");
                        progressBar.setProgress(91);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "rak")) {
                        rakrak.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "lev") || Objects.equals(znak1, "lev") && Objects.equals(znak2, "rak")) {
                        raklev.setVisibility(View.VISIBLE);
                        procent.setText("57%");
                        progressBar.setProgress(57);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "deva") || Objects.equals(znak1, "deva") && Objects.equals(znak2, "rak")) {
                        rakdeva.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "vesi") || Objects.equals(znak1, "vesi") && Objects.equals(znak2, "rak")) {
                        rakvesi.setVisibility(View.VISIBLE);
                        procent.setText("94%");
                        progressBar.setProgress(94);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "rak")) {
                        rakscorpion.setVisibility(View.VISIBLE);
                        procent.setText("91%");
                        progressBar.setProgress(91);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "rak")) {
                        rakstrelec.setVisibility(View.VISIBLE);
                        procent.setText("82%");
                        progressBar.setProgress(82);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "rak")) {
                        rakkozerog.setVisibility(View.VISIBLE);
                        procent.setText("96%");
                        progressBar.setProgress(96);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "rak")) {
                        rakvodolei.setVisibility(View.VISIBLE);
                        procent.setText("84%");
                        progressBar.setProgress(84);
                    }
                    if (Objects.equals(znak1, "rak") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "rak")) {
                        rakribi.setVisibility(View.VISIBLE);
                        procent.setText("100%");
                        progressBar.setProgress(100);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "blizneci")) {
                        blizneciblizneci.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "rak") || Objects.equals(znak1, "rak") && Objects.equals(znak2, "blizneci")) {
                        bliznecirak.setVisibility(View.VISIBLE);
                        procent.setText("63%");
                        progressBar.setProgress(63);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "lev") || Objects.equals(znak1, "lev") && Objects.equals(znak2, "blizneci")) {
                        bliznecilev.setVisibility(View.VISIBLE);
                        procent.setText("81%");
                        progressBar.setProgress(81);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "deva") || Objects.equals(znak1, "deva") && Objects.equals(znak2, "blizneci")) {
                        bliznecideva.setVisibility(View.VISIBLE);
                        procent.setText("93%");
                        progressBar.setProgress(93);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "vesi") || Objects.equals(znak1, "vesi") && Objects.equals(znak2, "blizneci")) {
                        bliznecivesi.setVisibility(View.VISIBLE);
                        procent.setText("89%");
                        progressBar.setProgress(89);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "blizneci")) {
                        blizneciscorpion.setVisibility(View.VISIBLE);
                        procent.setText("93%");
                        progressBar.setProgress(93);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "blizneci")) {
                        bliznecistrelec.setVisibility(View.VISIBLE);
                        procent.setText("100%");
                        progressBar.setProgress(100);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "blizneci")) {
                        bliznecikozerog.setVisibility(View.VISIBLE);
                        procent.setText("82%");
                        progressBar.setProgress(82);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "blizneci")) {
                        bliznecivodolei.setVisibility(View.VISIBLE);
                        procent.setText("93");
                        progressBar.setProgress(93);
                    }
                    if (Objects.equals(znak1, "blizneci") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "blizneci")) {
                        blizneciribi.setVisibility(View.VISIBLE);
                        procent.setText("82%");
                        progressBar.setProgress(82);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "lev")) {
                        levlev.setVisibility(View.VISIBLE);
                        procent.setText("91%");
                        progressBar.setProgress(91);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "deva") || Objects.equals(znak1, "deva") && Objects.equals(znak2, "lev")) {
                        levdeva.setVisibility(View.VISIBLE);
                        procent.setText("86%");
                        progressBar.setProgress(86);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "vesi") || Objects.equals(znak1, "vesi") && Objects.equals(znak2, "lev")) {
                        levvesi.setVisibility(View.VISIBLE);
                        procent.setText("91%");
                        progressBar.setProgress(91);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "lev")) {
                        levscorpion.setVisibility(View.VISIBLE);
                        procent.setText("99%");
                        progressBar.setProgress(99);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "lev")) {
                        levstrelec.setVisibility(View.VISIBLE);
                        procent.setText("93%");
                        progressBar.setProgress(93);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "lev")) {
                        levkozerog.setVisibility(View.VISIBLE);
                        procent.setText("92%");
                        progressBar.setProgress(92);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "lev")) {
                        levvodolei.setVisibility(View.VISIBLE);
                        procent.setText("97%");
                        progressBar.setProgress(97);
                    }
                    if (Objects.equals(znak1, "lev") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "lev")) {
                        levribi.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "deva")) {
                        devadeva.setVisibility(View.VISIBLE);
                        procent.setText("75%");
                        progressBar.setProgress(75);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "vesi") || Objects.equals(znak1, "vesi") && Objects.equals(znak2, "deva")) {
                        devavesi.setVisibility(View.VISIBLE);
                        procent.setText("74%");
                        progressBar.setProgress(74);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "deva")) {
                        devascorpion.setVisibility(View.VISIBLE);
                        procent.setText("98%");
                        progressBar.setProgress(98);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "deva")) {
                        devastrelec.setVisibility(View.VISIBLE);
                        procent.setText("72%");
                        progressBar.setProgress(72);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "deva")) {
                        devakozerog.setVisibility(View.VISIBLE);
                        procent.setText("61%");
                        progressBar.setProgress(61);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "deva")) {
                        devavodolei.setVisibility(View.VISIBLE);
                        procent.setText("72%");
                        progressBar.setProgress(72);
                    }
                    if (Objects.equals(znak1, "deva") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "deva")) {
                        devaribi.setVisibility(View.VISIBLE);
                        procent.setText("67%");
                        progressBar.setProgress(67);
                    }
                    if (Objects.equals(znak1, "vesi") && Objects.equals(znak2, "vesi")) {
                        vesivesi.setVisibility(View.VISIBLE);
                        procent.setText("96%");
                        progressBar.setProgress(96);
                    }
                    if (Objects.equals(znak1, "vesi") && Objects.equals(znak2, "scorpion") || Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "vesi")) {
                        vesiscorpion.setVisibility(View.VISIBLE);
                        procent.setText("99%");
                        progressBar.setProgress(99);
                    }
                    if (Objects.equals(znak1, "vesi") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "vesi")) {
                        vesistrelec.setVisibility(View.VISIBLE);
                        procent.setText("100%");
                        progressBar.setProgress(100);
                    }
                    if (Objects.equals(znak1, "vesi") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "vesi")) {
                        vesikozerog.setVisibility(View.VISIBLE);
                        procent.setText("92%");
                        progressBar.setProgress(92);
                    }
                    if (Objects.equals(znak1, "vesi") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "vesi")) {
                        vesivodolei.setVisibility(View.VISIBLE);
                        procent.setText("98%");
                        progressBar.setProgress(98);
                    }
                    if (Objects.equals(znak1, "vesi") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "vesi")) {
                        vesiribi.setVisibility(View.VISIBLE);
                        procent.setText("64%");
                        progressBar.setProgress(64);
                    }
                    if (Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "scorpion")) {
                        scorpionscorpion.setVisibility(View.VISIBLE);
                        procent.setText("100%");
                        progressBar.setProgress(100);
                    }
                    if (Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "strelec") || Objects.equals(znak1, "strelec") && Objects.equals(znak2, "scorpion")) {
                        scorpionstrelec.setVisibility(View.VISIBLE);
                        procent.setText("92%");
                        progressBar.setProgress(92);
                    }
                    if (Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "scorpion")) {
                        scorpionkozerog.setVisibility(View.VISIBLE);
                        procent.setText("93%");
                        progressBar.setProgress(93);
                    }
                    if (Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "scorpion")) {
                        scorpionvodolei.setVisibility(View.VISIBLE);
                        procent.setText("68%");
                        progressBar.setProgress(68);
                    }
                    if (Objects.equals(znak1, "scorpion") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "scorpion")) {
                        scorpionribi.setVisibility(View.VISIBLE);
                        procent.setText("97%");
                        progressBar.setProgress(97);
                    }
                    if (Objects.equals(znak1, "strelec") && Objects.equals(znak2, "strelec")) {
                        strelecstrelec.setVisibility(View.VISIBLE);
                        procent.setText("98%");
                        progressBar.setProgress(98);
                    }
                    if (Objects.equals(znak1, "strelec") && Objects.equals(znak2, "kozerog") || Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "strelec")) {
                        streleckozerog.setVisibility(View.VISIBLE);
                        procent.setText("71%");
                        progressBar.setProgress(71);
                    }
                    if (Objects.equals(znak1, "strelec") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "strelec")) {
                        strelecvodolei.setVisibility(View.VISIBLE);
                        procent.setText("96%");
                        progressBar.setProgress(96);
                    }
                    if (Objects.equals(znak1, "strelec") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "strelec")) {
                        strelecribi.setVisibility(View.VISIBLE);
                        procent.setText("71%");
                        progressBar.setProgress(71);
                    }
                    if (Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "kozerog")) {
                        kozerogkozerog.setVisibility(View.VISIBLE);
                        procent.setText("83%");
                        progressBar.setProgress(83);
                    }
                    if (Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "vodolei") || Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "kozerog")) {
                        kozerogvodolei.setVisibility(View.VISIBLE);
                        procent.setText("81%");
                        progressBar.setProgress(81);
                    }
                    if (Objects.equals(znak1, "kozerog") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "kozerog")) {
                        kozerogribi.setVisibility(View.VISIBLE);
                        procent.setText("66%");
                        progressBar.setProgress(66);
                    }
                    if (Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "vodolei")) {
                        vodoleivodolei.setVisibility(View.VISIBLE);
                        procent.setText("75%");
                        progressBar.setProgress(75);
                    }
                    if (Objects.equals(znak1, "vodolei") && Objects.equals(znak2, "ribi") || Objects.equals(znak1, "ribi") && Objects.equals(znak2, "vodolei")) {
                        vodoleiribi.setVisibility(View.VISIBLE);
                        procent.setText("99%");
                        progressBar.setProgress(99);
                    }
                    if (Objects.equals(znak1, "ribi") && Objects.equals(znak2, "ribi")) {
                        ribiribi.setVisibility(View.VISIBLE);
                        procent.setText("99%");
                        progressBar.setProgress(99);
                    }
                    break;
                default:
                    break;
            }
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            switch (requestCode)
            {
                case REQUEST_CODE_ZNAK1:
                    String znak11 = data.getStringExtra("znak");
                    znak1Text.setText(znak11);
                    String znak111 = znak1Text.getText().toString();
                    if ("oven".equals(znak111)) {
                        ovenImage1.setVisibility(View.VISIBLE);
                    } else if ("telec".equals(znak111)) {
                        telecImage1.setVisibility(View.VISIBLE);
                    } else if ("blizneci".equals(znak111)) {
                        blizneciImage1.setVisibility(View.VISIBLE);
                    } else if ("rak".equals(znak111)) {
                        rakImage1.setVisibility(View.VISIBLE);
                    } else if ("lev".equals(znak111)) {
                        levImage1.setVisibility(View.VISIBLE);
                    } else if ("deva".equals(znak111)) {
                        devaImage1.setVisibility(View.VISIBLE);
                    } else if ("vesi".equals(znak111)) {
                        vesiImage1.setVisibility(View.VISIBLE);
                    } else if ("scorpion".equals(znak111)) {
                        scorpionImage1.setVisibility(View.VISIBLE);
                    } else if ("strelec".equals(znak111)) {
                        strelecImage1.setVisibility(View.VISIBLE);
                    } else if ("kozerog".equals(znak111)) {
                        kozerogImage1.setVisibility(View.VISIBLE);
                    } else if ("vodolei".equals(znak111)) {
                        vodoleiImage1.setVisibility(View.VISIBLE);
                    } else if ("ribi".equals(znak111)) {
                        ribiImage1.setVisibility(View.VISIBLE);
                    }
                    break;
                case REQUEST_CODE_ZNAK2:
                    String znak22 = data.getStringExtra("znak");
                    znak2Text.setText(znak22);
                    switch (znak22)
                    {
                        case "oven":
                            ovenImage2.setVisibility(View.VISIBLE);
                            break;
                        case "telec":
                            telecImage2.setVisibility(View.VISIBLE);
                            break;
                        case "blizneci":
                            blizneciImage2.setVisibility(View.VISIBLE);
                            break;
                        case "rak":
                            rakImage2.setVisibility(View.VISIBLE);
                            break;
                        case "lev":
                            levImage2.setVisibility(View.VISIBLE);
                            break;
                        case "deva":
                            devaImage2.setVisibility(View.VISIBLE);
                            break;
                        case "vesi":
                            vesiImage2.setVisibility(View.VISIBLE);
                            break;
                        case "scorpion":
                            scorpionImage2.setVisibility(View.VISIBLE);
                            break;
                        case "strelec":
                            strelecImage2.setVisibility(View.VISIBLE);
                            break;
                        case "kozerog":
                            kozerogImage2.setVisibility(View.VISIBLE);
                            break;
                        case "vodolei":
                            vodoleiImage2.setVisibility(View.VISIBLE);
                            break;
                        case "ribi":
                            ribiImage2.setVisibility(View.VISIBLE);
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }