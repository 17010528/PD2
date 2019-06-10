package com.example.pd2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class mainactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Location and Duration");

        final EditText etDuration = findViewById(R.id.editTextDuration);
        final EditText etAddress = findViewById(R.id.editTextAddress);

        Button btnFind = findViewById(R.id.buttonFind);

        FloatingActionButton fabAdd = findViewById(R.id.fabAdd);

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

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainactivity.this , addFavourite.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.about){
            Intent intent = new Intent(mainactivity.this , faq.class);
            startActivity(intent);
        }else if(id == R.id.history){
            Intent intent = new Intent(mainactivity.this , transactionhistory.class);
            startActivity(intent);
        }else if(id == R.id.addFavourite){
            Intent intent = new Intent(mainactivity.this , viewFavourite.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
