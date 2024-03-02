package com.example.demo01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView clicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicked = (TextView) findViewById(R.id.clicked);
        btn=(Button) findViewById(R.id.btn);
        clicked.setVisibility(View.INVISIBLE);
    }

    public void go(View view) {

        clicked.setVisibility(View.VISIBLE);

    }
}
