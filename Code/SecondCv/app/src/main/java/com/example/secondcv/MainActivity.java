//Code written by Maryam ElMarjany


package com.example.secondcv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import  android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;


import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText enteredValue;
    TextView textView,textView2,textView3,textView4,textView5;
    Button convert;
    Spinner from,to;
    Boolean m=false,f=false,in=false,y=false,mi=false,Cm=false,Ci=false,Cmi=false,Cy=false,Cf=false,k=false,cm=false,mm=false,micro=false,nano=false,Ck=false,Ccm=false,Cmm=false,Cmicro=false,Cnano=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing  the aforementioned variables representing the buttons,spinner and  textview, and connecting them with the Layout
       enteredValue=(EditText) findViewById(R.id.enteredValue);
       textView=(TextView)findViewById(R.id.textView);
       convert=(Button) findViewById(R.id.cnvrt);
       from=(Spinner)findViewById(R.id.spinner_from);
       to=(Spinner) findViewById(R.id.spinner_to);
       textView2=(TextView) findViewById(R.id.textView2);
       textView3=(TextView) findViewById(R.id.textView3);
       textView4=(TextView) findViewById(R.id.textView4);
       textView5=(TextView) findViewById(R.id.textView5);

//Creating an array list that will store the conversion units
        List<String> list=new ArrayList<>();
        list.add("Choose a unit");
        list.add("INCH");
        list.add("METRE");
        list.add("FOOT");
        list.add("YARD");
        list.add("MILE");
        list.add("KILOMETRE");
        list.add("CENTIMETRE");
        list.add("MILLIMETRE");
        list.add("MICROMETRE");
        list.add("NANOMETRE");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
        from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
             String str =adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,"Converting from "+str ,Toast.LENGTH_SHORT).show();
                //Setting the boolean values,whenever the user chooses a conversion unit
                switch(str){
                    case"Choose a unit":

                        textView2.setText(" ");
                        break;
                    case"METRE":

                        textView2.setText("M");
                        break;
                    case"KILOMETRE":

                        textView2.setText("KM");
                        break;
                    case"MILLIMETRE":

                        textView2.setText("MM");
                        break;
                    case"MICROMETRE":

                        textView2.setText("µM");
                        break;
                    case"CENTIMETRE":

                        textView2.setText("CM");
                        break;
                    case"NANOMETRE":

                        textView2.setText("NM");
                        break;
                    case "INCH":

                        textView2.setText("INCHES");
                        break;
                    case"FOOT":

                        textView2.setText("FT");
                        break;
                    case"YARD":

                        textView2.setText("YARDS");
                        break;
                    case"MILE":

                        textView2.setText("MILES");
                        break;
                    default:
                        break;
                }

            }





            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
        to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String str =adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,"Converting to  "+str ,Toast.LENGTH_SHORT).show();
                switch(str){
                    case "Choose a unit":

                        textView3.setText(" ");
                        break;
                    case"METRE":

                        textView3.setText("M");
                        break;
                    case"KILOMETRE":

                        textView3.setText("KM");
                        break;
                    case"CENTIMETRE":

                        textView3.setText("CM");
                        break;
                    case"MICROMETRE":

                        textView3.setText("µM");
                        break;
                    case"MILLIMETRE":

                        textView3.setText("MM");
                        break;
                    case"NANOMETRE":

                        textView3.setText("NM");
                        break;
                    case "INCH":

                        textView3.setText("INCHES");
                        break;
                    case"FOOT":

                        textView3.setText("FT");
                        break;
                    case"YARD":

                        textView3.setText("YARDS");
                        break;
                    case"MILE":

                        textView3.setText("MILES");
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
















                                                }
}