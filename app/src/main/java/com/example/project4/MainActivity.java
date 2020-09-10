package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="com.gaurav.project4.ORDER";
    EditText editText,editText1,editText2,editText3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "item is ordered", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,OrderActivity.class);
                String message="Order For " +editText.getText().toString()+":"+editText1.getText().toString() +", " +editText2.getText().toString()+ " &  "+editText3.getText().toString()+ " have been placed";
                intent.putExtra(MSG,message);
                startActivity(intent);
            }
        });


    }
}