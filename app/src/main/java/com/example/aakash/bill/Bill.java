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

import dalvik.system.PathClassLoader;

public class Bill extends AppCompatActivity {

    public int SamosaBill = 0;
    public int ChotiBill = 0;
    public int ChaiBill = 0;
    public int RandABill = 0,PakodaBill=0,ColdDrinkBill=0;
    public int total = 0;
    EditText editText,editText2,editText3,editText4,editText5,editText6;
    boolean samosa=false,chai=false,choti=false,pakoda=false,colddrink=false,randa=false;

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

        if(samosa) {
            SamosaBill = Integer.parseInt(editText.getText().toString());
            if(SamosaBill>0) {
                SamosaBill = 5 * SamosaBill;
            }
            else {
                SamosaBill=0;
            }
        }
        else{
            SamosaBill=0;
        }

        if(choti) {
            ChotiBill = Integer.parseInt(editText2.getText().toString());
            if(ChotiBill>0) {
                ChotiBill = 10 * ChotiBill;
            }
            else{
                ChotiBill=0;
            }
        }
        else {
            ChotiBill=0;
        }

        if(chai) {

                ChaiBill = Integer.parseInt(editText3.getText().toString());
            if(ChaiBill>0) {
                ChaiBill = 7 * ChaiBill;
            }
            else{
                ChaiBill=0;
            }
        }
        else {
            ChaiBill=0;

        }


        if(randa) {

                RandABill = Integer.parseInt(editText4.getText().toString());
            if(RandABill>0) {
                RandABill = 16 * RandABill;
            }
            else {
                RandABill=0;
            }
        }
        else {
            RandABill=0;
        }


        if(pakoda) {

                PakodaBill = Integer.parseInt(editText6.getText().toString());
            if(PakodaBill>0) {
                PakodaBill = 10 * PakodaBill;
            }
            else {
                PakodaBill=0;
            }
        }
        else {
            PakodaBill=0;
        }

        if (colddrink) {

                ColdDrinkBill = Integer.parseInt(editText5.getText().toString());
            if(ColdDrinkBill>0) {
                ColdDrinkBill = 15 * ColdDrinkBill;
            }
            else {
                ColdDrinkBill=0;
            }
        }
        else {
            ColdDrinkBill=0;
        }

        int FinalBill=SamosaBill + ChaiBill + ChotiBill + RandABill + PakodaBill + ColdDrinkBill;
        display(FinalBill);
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
                    samosa=true;

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
                    editText2 = (EditText) findViewById(R.id.plaintextChoti);
                    editText2.setEnabled(true);
                    editText2.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText2.setFocusable(true);
                    editText2.setFocusableInTouchMode(true);
                    editText2.requestFocus();
                    choti=true;

                } else {
                    editText2 = (EditText) findViewById(R.id.plaintextChoti);
                    editText2.setEnabled(false);
                    editText2.setInputType(InputType.TYPE_NULL);
                    editText2.setFocusable(false);
                    editText2.setFocusableInTouchMode(false);

                    editText2.clearFocus();

                }
                break;
            case R.id.checkbox_Chai:
                if (checked) {
                    editText3 = (EditText) findViewById(R.id.plaintextChai);
                    editText3.setEnabled(true);
                    editText3.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText3.setFocusable(true);
                    editText3.setFocusableInTouchMode(true);
                    editText3.requestFocus();
                    chai=true;
                } else {
                    editText3 = (EditText) findViewById(R.id.plaintextChai);
                    editText3.setEnabled(false);
                    editText3.setInputType(InputType.TYPE_NULL);
                    editText3.setFocusable(false);
                    editText3.setFocusableInTouchMode(false);

                    editText3.clearFocus();

                }
                break;
            case R.id.checkbox_RandA:
                if (checked) {
                    editText4 = (EditText) findViewById(R.id.plaintextRandA);
                    editText4.setEnabled(true);
                    editText4.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText4.setFocusable(true);
                    editText4.setFocusableInTouchMode(true);
                    editText4.requestFocus();
                    randa=true;
                } else {
                    editText4 = (EditText) findViewById(R.id.plaintextRandA);
                    editText4.setEnabled(false);
                    editText4.setInputType(InputType.TYPE_NULL);
                    editText4.setFocusable(false);
                    editText4.setFocusableInTouchMode(false);

                    editText4.clearFocus();

                }
                break;

            case R.id.checkbox_Colddrink:
                if (checked) {
                    editText5 = (EditText) findViewById(R.id.plaintextColdDrink);
                    editText5.setEnabled(true);
                    editText5.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText5.setFocusable(true);
                    editText5.setFocusableInTouchMode(true);
                    editText5.requestFocus();
                    colddrink=true;
                } else {
                    editText5 = (EditText) findViewById(R.id.plaintextColdDrink);
                    editText5.setEnabled(false);
                    editText5.setInputType(InputType.TYPE_NULL);
                    editText5.setFocusable(false);
                    editText5.setFocusableInTouchMode(false);

                    editText.clearFocus();


                }
                break;

            case R.id.checkbox_Pakoda:
                if (checked) {
                    editText6 = (EditText) findViewById(R.id.plaintextPakoda);
                    editText6.setEnabled(true);
                    editText6.setInputType(InputType.TYPE_CLASS_TEXT);
                    editText6.setFocusable(true);
                    editText6.setFocusableInTouchMode(true);
                    editText6.requestFocus();
                    pakoda=true;
                } else {
                    editText6 = (EditText) findViewById(R.id.plaintextPakoda);
                    editText6.setEnabled(false);
                    editText6.setInputType(InputType.TYPE_NULL);
                    editText6.setFocusable(false);
                    editText6.setFocusableInTouchMode(false);

                    editText6.clearFocus();

                }
                break;
        }
    }


}





