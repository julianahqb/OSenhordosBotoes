package com.example.osenhordosbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Três diferentes formas de tratar o evento de clique do botão e abrir uma activity

        //2a. forma
        Button btnFilme2 = findViewById(R.id.btnFilme2);
        btnFilme2.setOnClickListener(this);

        //3a. forma
        Button btnFilme3 = findViewById(R.id.btnFilme3);
        btnFilme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Filme3Activity.class);
                startActivity(intent);
            }
        });

    }

    //1a. forma (deprecated)
    public void abrir(View view) {
        Intent intent = new Intent(this, Filme1Activity.class);
        startActivity(intent);
    }

    //2a. forma
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnFilme2)
            startActivity(new Intent(this, Filme2Activity.class));
    }
}