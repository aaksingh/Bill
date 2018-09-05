package com.example.aakash.bill;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class Bill extends AppCompatActivity {

    public int SamosaBill=0,quantitySamosa=0;
    public int ChotiBill =0,quantityChoti=0;
    public int ChaiBill=0,quantityChai=0;
    public int RandABill=0,quantityRandA=0;
    public int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
    }




    private void display(int total){
        TextView TotalBillTextView=(TextView)findViewById(R.id.TotalBill);
        TotalBillTextView.setText(""+total);
    }

    public void total(View view){


        display(ChotiBill+SamosaBill+ChaiBill+RandABill);

    }


    public void onCheckboxClicked(View view){

    }



}
