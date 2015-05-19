package com.example.sebastian.szybkanotatka;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class StartNotatka extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_notatka);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Dodaje pozycje menu do paska akcji za pomocą metody inflate
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_start_notatka, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Obsługa naciśnięcia elementów paska akcji
        switch (item.getItemId()) {
            case R.id.zapisz:
                zapisz();
                return true;
            case R.id.action_settings:
                action_settings();
                return true;
            case R.id.start:
                start();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void action_settings() {
        Intent intent = new Intent(new Intent(StartNotatka.this, MainActivity2Activity.class));
        startActivity(intent);
    }

    private void zapisz() {
        Intent intent = new Intent(new Intent(StartNotatka.this, MainActivity.class));
        startActivity(intent);

    }

    private void start() {
        Intent intent = new Intent(new Intent(StartNotatka.this, StartNotatka.class));
        startActivity(intent);

    }



}
