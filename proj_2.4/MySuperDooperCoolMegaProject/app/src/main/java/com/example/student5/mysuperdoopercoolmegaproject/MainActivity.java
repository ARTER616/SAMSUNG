package com.example.student5.mysuperdoopercoolmegaproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    // Вызывается при создании активности
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует активность.
        setContentView(R.layout.activity_main);
        Button o = findViewById(R.id.button);
       o.setOnClickListener(new KnopkaSmerti(this));
    }
}
