package com.example.pd2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class map extends AppCompatActivity {

public static Button btnBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        setTitle("Maps");

        ImageView ivMap = findViewById(R.id.imageViewMap);
        TextView rate = findViewById(R.id.textViewRateH);
         btnBook = findViewById(R.id.buttonBook);


        Intent intent = getIntent();
        String carpark[] = intent.getStringArrayExtra("carpark");
        final String carparkName = carpark[0];
        final String carparkTotalPrice =  carpark[1];
        final String carparkLot = carpark[2];
        final String number = carpark[3];

        if(number.equalsIgnoreCase("1")) {
            btnBook.setVisibility(View.GONE);
        }

        if (carparkName.equalsIgnoreCase("p4")){

            ivMap.setImageResource(R.drawable.woodlands_rp2);
            rate.setText(Html.fromHtml(" <font color='#FFA500'>$2 / hr</font>"));


        }else if (carparkName.equalsIgnoreCase("admiral vista")){

            ivMap.setImageResource(R.drawable.woodlands_admiralvista);
            rate.setText(Html.fromHtml(" <font color='#00FF00'>$3 / hr</font>"));

        }else{
            ivMap.setImageResource(R.drawable.woodlands_admiraltypark);
            rate.setText(Html.fromHtml(" <font color='#FF0000'>$1 / hr</font>"));
        }
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String duration = etDuration.getText().toString();
//                String address = etAddress.getText().toString();
//                String[] info = {duration , address};
                String[] carparkMap = {carparkName , carparkTotalPrice , carparkLot};
                Intent intent = new Intent(map.this , payment.class);
                intent.putExtra("carparkMap" , carparkMap);
                startActivity(intent);


            }
        });
    }
}
