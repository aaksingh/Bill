package com.example.aakash.bill;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import java.text.NumberFormat;

public class Bill extends AppCompatActivity {

    public int SamosaBill = 0;
    public int ChotiBill = 0;
    public int ChaiBill = 0;
    public int RandABill = 0,PakodaBill=0,ColdDrinkBill=0;
    public int total = 0;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
    }


    private void display(int total) {
        TextView TotalBillTextView = (TextView) findViewById(R.id.TotalBill);
        TotalBillTextView.setText("" + total);
    }

    public void total(View view) {
        SamosaBill = Integer.parseInt(editText.getText().toString());
        SamosaBill = 5*SamosaBill;

        ChotiBill = Integer.parseInt(editText.getText().toString());
        ChotiBill = 10*ChotiBill;

        ChaiBill = Integer.parseInt(editText.getText().toString());
        ChaiBill = 7*ChaiBill;


        RandABill = Integer.parseInt(editText.getText().toString());
        RandABill = 16*RandABill;

        PakodaBill =Integer.parseInt(editText.getText().toString());
        PakodaBill =10*PakodaBill;

        ColdDrinkBill =Integer.parseInt(editText.getText().toString());
        ColdDrinkBill =15*ColdDrinkBill;



        display(SamosaBill + ChotiBill + ChaiBill + RandABill +PakodaBill + ColdDrinkBill);
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {

            case R.id.checkbox_Samosa:
                if (checked) {

                    editText = (EditText) findViewById(R.id.plaintextSamosa);
                    editText.setEnabled(true);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();

                } else {
                    editText = findViewById(R.id.plaintextSamosa);
                    editText.setEnabled(false);
                    editText.setInputType(InputType.TYPE_NULL);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);
                    editText.clearFocus();
                }
                break;      

            case R.id.checkbox_Choti:
                if (checked) {
                    editText = (EditText) findViewById(R.id.plaintextChoti);
                    editText.setEnabled(true);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                } else {
                    editText = (EditText) findViewById(R.id.plaintextChoti);
                    editText.setEnabled(false);
                    editText.setInputType(InputType.TYPE_NULL);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);

                    editText.clearFocus();

                }
                break;
            case R.id.checkbox_Chai:
                if (checked) {
                    editText = (EditText) findViewById(R.id.plaintextChai);
                    editText.setEnabled(true);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                } else {
                    editText = (EditText) findViewById(R.id.plaintextChai);
                    editText.setEnabled(false);
                    editText.setInputType(InputType.TYPE_NULL);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);

                    editText.clearFocus();

                }
                break;
            case R.id.checkbox_RandA:
                if (checked) {
                    editText = (EditText) findViewById(R.id.plaintextRandA);
                    editText.setEnabled(true);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                } else {
                    editText = (EditText) findViewById(R.id.plaintextRandA);
                    editText.setEnabled(false);
                    editText.setInputType(InputType.TYPE_NULL);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);

                    editText.clearFocus();

                }
                break;

            case R.id.checkbox_Colddrink:
                if (checked) {
                    editText = (EditText) findViewById(R.id.plaintextColdDrink);
                    editText.setEnabled(true);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                } else {
                    editText = (EditText) findViewById(R.id.plaintextColdDrink);
                    editText.setEnabled(false);
                    editText.setInputType(InputType.TYPE_NULL);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);

                    editText.clearFocus();

                }
                break;

            case R.id.checkbox_Pakoda:
                if (checked) {
                    editText = (EditText) findViewById(R.id.plaintextPakoda);
                    editText.setEnabled(true);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.requestFocus();
                } else {
                    editText = (EditText) findViewById(R.id.plaintextPakoda);
                    editText.setEnabled(false);
                    editText.setInputType(InputType.TYPE_NULL);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);

                    editText.clearFocus();

                }
                break;
        }
    }


}





