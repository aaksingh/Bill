package com.example.aakash.bill;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    private void displaySamosaBill(int SamosaBill,int SamosaQuantity){
       /* TextView SamosaBillTextView = (TextView)findViewById(R.id.billSamosa);
        SamosaBillTextView.setText(NumberFormat.getCurrencyInstance().format(SamosaBill));*/

        TextView SamosaQuantityView = (TextView)findViewById(R.id.SamosaQuanity);
        SamosaQuantityView.setText("Quant. " + SamosaQuantity);


    }

    public void plusSamosa(View view){
         quantitySamosa++;
         SamosaBill=(quantitySamosa*7);
         total+=SamosaBill;
         displaySamosaBill(SamosaBill,quantitySamosa);

    }

    public void minusSamosa(View view){
        if(quantitySamosa>0){
            quantitySamosa--;
        }
        SamosaBill=(quantitySamosa*7);
        total+=SamosaBill;
        displaySamosaBill(SamosaBill,quantitySamosa);

    }

    private void displayChotiBill(int ChotiBill,int ChotiQuantity){

        /*TextView ChotiBillTextView = (TextView)findViewById(R.id.billChoti);
        ChotiBillTextView.setText(NumberFormat.getCurrencyInstance().format(ChotiBill));*/

        TextView ChotiQuantityView =(TextView)findViewById(R.id.ChotiaQuanity);
        ChotiQuantityView.setText("Quant. "+ChotiQuantity);

    }

    public void plusChoti(View view){
        quantityChoti++;

        ChotiBill=quantityChoti*10;

        displayChotiBill(ChotiBill,quantityChoti);
    }

    public void minusChoti(View view){
        if(quantityChoti>0){
            quantityChoti--;
        }
        ChotiBill=quantityChoti*10;

        displayChotiBill(ChotiBill,quantityChoti);
    }


    private void display(int total){
        TextView TotalBillTextView=(TextView)findViewById(R.id.TotalBill);
        TotalBillTextView.setText(""+total);
    }

    public void total(View view){


        display(ChotiBill+SamosaBill+ChaiBill+RandABill);

    }

    private void displayChaiBill(int ChaiBill,int ChaiQuantity) {

        /*TextView ChaiBillTextView = (TextView) findViewById(R.id.billChai);
        ChaiBillTextView.setText(NumberFormat.getCurrencyInstance().format(ChaiBill));*/

        TextView ChotiQuantityView = (TextView) findViewById(R.id.ChaiQuanity);
        ChotiQuantityView.setText("Quant. " + ChaiQuantity);
    }



    public void minusChai(View view){
        if(quantityChai>0) {

            quantityChai--;
        }
        ChaiBill=quantityChai*7;
        displayChaiBill(ChaiBill,quantityChai);
    }


    public void plusChai(View view){
        quantityChai++;
        ChaiBill=quantityChai*7;
        displayChaiBill(ChaiBill,quantityChai);
    }

    private void displayRandABill(int RandABill,int RandAQuantity) {

        /*TextView RandABillTextView = (TextView) findViewById(R.id.billRandA);
        RandABillTextView.setText(NumberFormat.getCurrencyInstance().format(RandABill));*/

        TextView RandAQuantityView = (TextView) findViewById(R.id.RandAQuanity);
        RandAQuantityView.setText("Quant. " + RandAQuantity);
    }

    public void minusRandA(View view){
        if(quantityRandA>0) {

            quantityRandA--;
        }
        RandABill=quantityRandA*16;
        displayRandABill(RandABill,quantityRandA);
    }


    public void plusRandA(View view){
        quantityRandA++;
        RandABill=quantityRandA*16;
        displayRandABill(RandABill,quantityRandA);
    }
}
