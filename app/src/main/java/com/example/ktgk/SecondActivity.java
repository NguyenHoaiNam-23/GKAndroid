package com.example.ktgk;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity{
    EditText edMail, edPass;
    Button btnBack;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        edMail = findViewById(R.id.edMail);
        edPass = findViewById(R.id.edPass);
        btnBack = findViewById(R.id.btnback);
        String name = getIntent().getStringExtra("Email");
        String pass = getIntent().getStringExtra("Password");
        edMail.setText(name);
        edPass.setText(pass);
        btnBack.setOnClickListener(v1 -> {
            finish();
        });
    }
}
