package com.ford.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button buttonNextScreen;
    private TextView input1;
    private TextView pounds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        buttonNextScreen=findViewById(R.id.nextScreen);
        input1 = findViewById(R.id.input1);
        pounds = findViewById(R.id.pounds);
//        button1.setOnClickListener(view -> {
//            Toast.makeText(MainActivity.this,"Submitted successfully!",Toast.LENGTH_LONG).show();
//            String s = input1.getText().toString();
//            Integer kg = Integer.parseInt(s);
//            double pound = 2.205 * kg;
//            pounds.setText("The value in Pounds is: "+pound);
//
//        });
        buttonNextScreen.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity.this,ScrollViewActivity.class);
            startActivity(intent1);
            finish();
        });

    }
    public void kgToPounds(View view)
    {
        String s = input1.getText().toString();
        Integer kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        pounds.setText("The value in Pounds is: "+pound);
    }

}