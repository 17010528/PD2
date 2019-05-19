package com.example.pd2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class rate extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<com.example.pd2.carpark> carpark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        setTitle("Carpark Rates");

        TextView tvTesting = findViewById(R.id.textViewPriceH);

        Intent intent = getIntent();
        String[] info = intent.getStringArrayExtra("info");
        String duration = info[0];
        String address = info[1];


        lv = this.findViewById(R.id.lvRate);

        // Create a few food objects in Food array
        carpark = new ArrayList<>();
        carpark.add(new carpark("P4", "$4", "20"));
        carpark.add(new carpark("Admiral Vista", "$6", "100"));
        carpark.add(new carpark("Block 519A", "$2", "5"));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new caradapter(this, R.layout.row, carpark);
        lv.setAdapter(aa);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {


                String carparkName = carpark.get(position).getName();
                String carparkTotalPrice = carpark.get(position).getCost();
                String carparkLot = carpark.get(position).getLot();


                String[] carpark = {carparkName , carparkTotalPrice , carparkLot };

                Intent intent = new Intent(rate.this, map.class);
                intent.putExtra("carpark", carpark);
                startActivity(intent);
            }
        });

    }
}
