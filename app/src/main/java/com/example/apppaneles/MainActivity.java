package com.example.apppaneles;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int DELAY_TIME=5000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crea un intent para abrir la segunda actividad
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                startActivity(intent);

                // Cierra la actividad actual para que el usuario no pueda volver a ella presionando el botón de retroceso
                finish();
            }
        }, DELAY_TIME);
    }
}