package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Order");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        textView2=findViewById(R.id.textView2);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        textView2.setText(message);
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}