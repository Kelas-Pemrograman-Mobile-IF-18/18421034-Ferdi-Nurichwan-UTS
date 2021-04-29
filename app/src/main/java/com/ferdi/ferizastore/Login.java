package com.ferdi.ferizastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ornach.nobobutton.NoboButton;

public class Login extends AppCompatActivity {

    Button btnDaftar;
    NoboButton btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnLogin = (NoboButton) findViewById(R.id.btnLogin);

        btnDaftar.setOnClickListener((v -> {
            Intent i = new Intent(Login.this, Register.class);
            startActivity(i);
            finish();
        }));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Menu.class);
                startActivity(i);
                finish();
            }
        });

    }
}