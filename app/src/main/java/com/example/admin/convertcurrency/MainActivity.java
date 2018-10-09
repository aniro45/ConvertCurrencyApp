package com.example.admin.convertcurrency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {




    public void ButtonClicked(View view) {



            EditText EnteredAmount = (EditText) findViewById(R.id.EnteredAmount);

             String s= EnteredAmount.getText().toString();

            Log.i("Amount Entered", EnteredAmount.getText().toString());



        Double ConvertedAmount = (Double.parseDouble(EnteredAmount.getText().toString()));
        Double Rupees = ConvertedAmount * 71.64;


        Log.i("Converted Amount", String.valueOf(Rupees));


        Toast.makeText(MainActivity.this, String.format("%.2f", Rupees) + "Rs", Toast.LENGTH_SHORT).show();


        }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
