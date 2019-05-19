package com.example.pd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aboutus extends AppCompatActivity {
TextView tvContent , tvProblem;
Button btnReport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        tvContent = findViewById(R.id.textViewContent);
        tvProblem = findViewById(R.id.textViewProblems);
        btnReport = findViewById(R.id.buttonReport);
        setTitle("About Us");
        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String duration = etDuration.getText().toString();
//                String address = etAddress.getText().toString();
//                String[] info = {duration , address};
                Intent intent = new Intent(aboutus.this , faq.class);
                startActivity(intent);


            }
        });


        tvContent.setText("The main purpose of this app is to compare the rates between multiple carparks which are within the vicinity so that the user will have different options to choose from on which carpark he would want to park at." +
                "The user would also be able to book the carparks (If the carpark allows the user to do it) and also the user will be able to view about his transaction history.");
        tvProblem.setText("Problems that i am unable to solve are the hiding of the button in rate.java when the user clicks from the transaction history to show more details about the transaction history" +
                "(such as the image and the rate of the place) and also my alternative way of showing more details by which when the user clicks on the arrayadapter, it will show more details of the selected transaction.");
    }
}
