package com.example.pd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class viewFavourite extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<com.example.pd2.carpark> carpark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_favourite);

        setTitle("View Favourites");





        lv = this.findViewById(R.id.lvFavourite);

        // Create a few food objects in Food array
        carpark = new ArrayList<>();
        carpark.add(new carpark("Whampoa Market", "$1/hr", "5"));
        carpark.add(new carpark("Toa Payo Hub", "$1.50/hr", "100"));
        carpark.add(new carpark("zhongshan park", "$1/hr", "20"));

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
                String number = "2";
                String[] carpark = {carparkName, carparkTotalPrice, carparkLot, number};

                Intent intent = new Intent(viewFavourite.this, map.class);
                intent.putExtra("carpark", carpark);
                startActivity(intent);
            }
        });

    }


}
