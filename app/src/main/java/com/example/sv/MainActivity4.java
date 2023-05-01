package com.example.sv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    ImageView  info, info2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        info = findViewById(R.id.info);
        info2 = findViewById(R.id.info2);

        Intent intent = this.getIntent();


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(i);
            }
        });
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(i);
            }
        });
    }


}