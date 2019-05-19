package com.example.pd2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class transactionhistory extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<com.example.pd2.history> history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactionhistory);

        lv = this.findViewById(R.id.lv);

        // Create a few food objects in Food array
        history = new ArrayList<>();
        history.add(new history("P4", "$4", "$2/hr" , "Visa" , "20"));
        history.add(new history("Admiral Vista", "$6", "$2/hr" , "MasterCard", "100"));
        history.add(new history("Block 519A", "$2", "$2/hr" , "Visa" , "5"));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new historyadapter(this, R.layout.history_row, history);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {


                String carparkName = history.get(position).getName();
                String carparkTotalPrice = history.get(position).getCost();
                String carparkLot = history.get(position).getLot();

                String[] carpark = {carparkName , carparkTotalPrice , carparkLot};

                Intent intent = new Intent(transactionhistory.this, map.class);
                intent.putExtra("carpark", carpark);
                map.btnBook.setVisibility(View.INVISIBLE);

                startActivity(intent);
            }
        });
    }
}
