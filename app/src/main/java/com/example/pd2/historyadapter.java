package com.example.pd2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class historyadapter extends ArrayAdapter<history> {
    private ArrayList<com.example.pd2.history> history;
    private Context context;
    private TextView tvCarpark , tvPrice , tvPaymentMethod , tvRate;
    private ImageView ivCarpark;
    private LinearLayout history_layout , tap_layout;
    private Boolean visible = false;




    public historyadapter(Context context, int resource, ArrayList<com.example.pd2.history> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        history = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.history_row, parent, false);

        // Get the TextView object
        tvCarpark =         rowView.findViewById(R.id.textViewCarparkH);
        // Get the ImageView object
        tvPrice =             rowView.findViewById(R.id.textViewPriceH);

        tvRate = rowView.findViewById(R.id.textViewRateH);

        tvPaymentMethod = rowView.findViewById(R.id.textViewPaymentMethodH);

        history_layout = rowView.findViewById(R.id.history_layout);

        tap_layout = rowView.findViewById(R.id.tap_layout);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        com.example.pd2.history currentPark = history.get(position);
        // Set the TextView to show the food

        tvCarpark.setText(currentPark.getName());
        tvPrice.setText(currentPark.getCost());
        tvRate.setText(currentPark.getRate());
        tvPaymentMethod.setText(currentPark.getPaymentMethod());


        tap_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (visible == false){
                    history_layout.setVisibility(View.VISIBLE);
                    visible = true;
                }else{
                    history_layout.setVisibility(View.GONE);
                    visible = false;
                }
            }
        });


        // Set the image to star or nostar accordingly

        // Return the nicely done up View to the ListView
        return rowView;
    }


}

