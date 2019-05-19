package com.example.pd2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class mainactivity extends AppCompatActivity {
    Button btnAbout ;
    ImageButton btnHistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Location and Duration");

        final EditText etDuration = findViewById(R.id.editTextDuration);
        final EditText etAddress = findViewById(R.id.editTextAddress);

        btnAbout = findViewById(R.id.buttonAbout);
        btnHistory = findViewById(R.id.buttonHistory);

        Button btnFind = findViewById(R.id.buttonFind);



        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String duration = etDuration.getText().toString();
                String address = etAddress.getText().toString();
                String[] info = {duration , address};
                Intent intent = new Intent(mainactivity.this , rate.class);
                intent.putExtra("info" , info);
                startActivity(intent);


            }
        });


        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainactivity.this , aboutus.class);
                startActivity(intent);


            }
        });


        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainactivity.this , transactionhistory.class);
                startActivity(intent);


            }
        });
    }
}
