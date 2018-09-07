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

    public int SamosaBill = 0, SamosaBill1;
    public String quantitySamosa, quantityChoti, quantityRandA, quantityChai;
    public int ChotiBill = 0;
    public int ChaiBill = 0;
    public int RandABill = 0;
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
        display(SamosaBill);
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
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);

                    try{
                        SamosaBill = Integer.parseInt(editText.getText().toString());
                    }catch (Exception e){

                        
                    }
                    SamosaBill = SamosaBill * 5;
                   // display(SamosaBill);


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
        }
    }



    /*public void samosaClicked(View view) {
        editText=(EditText)findViewById(R.id.plaintextSamosa);
        quantitySamosa=editText.getText().toString();
        SamosaBill= Integer.parseInt(quantitySamosa);
        SamosaBill=SamosaBill*5;


    }
    /*
    public void chotiClicked(View view){

        editText=(EditText)findViewById(R.id.plaintextChoti);
        quantityChoti=editText.getText().toString();

    }

    public void chaiClicked(View view){
        editText=(EditText)findViewById(R.id.plaintextChai);
        quantityChai=editText.getText().toString();

    }

    public void andAClicked(View view){
        editText=(EditText)findViewById(R.id.plaintextRandA);
        quantityRandA=editText.getText().toString();


    }*/


}





