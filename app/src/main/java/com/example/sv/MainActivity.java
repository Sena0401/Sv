package com.example.sv;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView showHideBtn;
    EditText username, password;
    ImageView btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showHideBtn = findViewById(R.id.showHideBtn);
        btnlogin = findViewById(R.id.btnlogin);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        showHideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showHideBtn.getText().toString().equals("Show")) {
                    showHideBtn.setText("Hide");
                    password.setTransformationMethod(null);
                } else {
                    showHideBtn.setText("Show");
                    password.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    callActivity();
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void callActivity() {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}
