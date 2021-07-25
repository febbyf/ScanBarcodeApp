package com.example.scanbarcodefebby;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    Button btn_masuk, btn_masuk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_masuk = (Button) findViewById(R.id.btn_masuk);
        btn_masuk2 = (Button) findViewById(R.id.btn_masuk2);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, LoginForm.class);
                Home.this.startActivity(intent);
                Home.this.finish();
            }
        });

        btn_masuk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
