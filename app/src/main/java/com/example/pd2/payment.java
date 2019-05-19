package com.example.pd2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class payment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        setTitle("Checkout");

        Intent intent = getIntent();
        String carparkMaps[] = intent.getStringArrayExtra("carparkMap");
        String carparkName = carparkMaps[0];
        String carparkTotalPrice = carparkMaps[1];
        String carparkLot = carparkMaps[2];

        TextView tvCarpark = findViewById(R.id.textViewCarparkPayment);
        TextView tvAvailableLots = findViewById(R.id.textViewAvailableLots);
        TextView tvPrice = findViewById(R.id.textViewTotalPrice);
        Button btnConfirm = findViewById(R.id.buttonConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(payment.this , mainactivity.class);
                startActivity(intent);
            }
        });

        tvCarpark.setText(carparkName);
        tvAvailableLots.setText(carparkLot);
        tvPrice.setText(carparkTotalPrice);


    }
}
