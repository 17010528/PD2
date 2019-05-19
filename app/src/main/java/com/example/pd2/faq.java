package com.example.pd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class faq extends AppCompatActivity {
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        btnSubmit = findViewById(R.id.buttonSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String duration = etDuration.getText().toString();
//                String address = etAddress.getText().toString();
//                String[] info = {duration , address};
                Intent intent = new Intent(faq.this , mainactivity.class);
                startActivity(intent);


            }
        });
    }
}
