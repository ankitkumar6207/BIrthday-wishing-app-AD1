package com.example.bw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Name;
    public static  final String Extra_Name="com.example.bw.Name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


    }
    public void openActivity(View view)
    {
        Intent intent =new Intent(this,MainActivity2.class);
        Name = findViewById(R.id.Name);
        String nameText=Name.getText().toString();
        intent.putExtra(Extra_Name,nameText);
        startActivity(intent);

    }
}