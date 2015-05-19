package com.example.sebastian.szybkanotatka;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class MainActivity2Activity extends ActionBarActivity {

    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }


    public void odczytaj_notatke(View view) throws IOException {
        textView3=(TextView)findViewById(R.id.textView3);
        FileInputStream fis = openFileInput("notatka.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        StringBuffer sb = new StringBuffer();
        while (bis.available()!=0){
            char c = (char) bis.read();
            sb.append(c);

        }
        textView3.setText(sb);
        bis.close();
        fis.close();
    }
}
