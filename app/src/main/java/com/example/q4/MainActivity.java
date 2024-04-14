package com.example.q4;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView name;
    Button btnred,btnblue,btnyellow,btngreen,btnpurple,btnstyle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
       name=(TextView) findViewById((R.id.name));
       btnred=(Button) findViewById(R.id.btnred);
        btnblue=(Button) findViewById(R.id.btnblue);
        btnyellow=(Button) findViewById(R.id.btnyellow);
        btngreen=(Button) findViewById(R.id.btngreen);
        btnpurple=(Button) findViewById(R.id.btnpurple);
        btnstyle=(Button)findViewById(R.id.btnstyle);

        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setTextColor(Color.RED);

            }
        });
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setTextColor(Color.GREEN);
            }
        });
        btnblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setTextColor(Color.BLUE);
            }
        });
        btnpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setTextColor(Color.rgb(128,0,128));
            }
        });
        btnyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setTextColor(Color.YELLOW);
            }
        });
        btnstyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setTypeface(Typeface.MONOSPACE);
            }
        });

    }
}