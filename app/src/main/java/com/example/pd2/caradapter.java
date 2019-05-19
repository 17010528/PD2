package com.example.pd2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class caradapter extends ArrayAdapter<com.example.pd2.carpark> {

    private ArrayList<com.example.pd2.carpark> carpark;
    private Context context;
    private TextView tvCarpark , tvPrice , tvLot ;

    public caradapter(Context context, int resource, ArrayList<com.example.pd2.carpark> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        carpark = objects;
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
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvCarpark =         rowView.findViewById(R.id.textViewCarparkPayment);
        // Get the ImageView object
        tvPrice =             rowView.findViewById(R.id.textViewPrice);

        tvLot = rowView.findViewById(R.id.textViewLot);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        com.example.pd2.carpark currentPark = carpark.get(position);
        // Set the TextView to show the food

        tvCarpark.setText(currentPark.getName());
        tvPrice.setText(currentPark.getCost());
        tvLot.setText(currentPark.getLot());
        // Set the image to star or nostar accordingly

        // Return the nicely done up View to the ListView
        return rowView;
    }


}
