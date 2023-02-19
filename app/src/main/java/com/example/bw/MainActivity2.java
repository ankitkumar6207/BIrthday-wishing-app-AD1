package com.example.bw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        textView =findViewById(R.id.textView);
        Intent intent = getIntent();
        String name=intent.getStringExtra(MainActivity.Extra_Name);
        textView.setText("Happy Birthday\n"+name);
        Toast.makeText(this, "Happy Birthday\n"+name, Toast.LENGTH_LONG).show();


    }
}