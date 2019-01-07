package com.example.ARTER616.exnum252;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class main_login_a_password extends AppCompatActivity {

    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> login = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_a_password);
        login.add("admin_ahah");
        password.add("admin_lol");
    }

    public void onClick(View view) {
        EditText log = findViewById(R.id.editText);
        EditText pass = findViewById(R.id.editText2);
        TextView text = findViewById(R.id.textView);
        if (login.indexOf(log.getText().toString()) > -1 && password.indexOf(pass.getText().toString()) > -1) {
            text.setTextColor(getResources().getColor(R.color.green));
            text.setText("Верно");
            log.setText("");
            pass.setText("");
        } else {
            text.setTextColor(getResources().getColor(R.color.red));
            text.setText("Вы ошиблись в логине или пароле");
            log.setText("");
            pass.setText("");
        }
    }
}
