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
                        m= in=mi=f=y=k=mm=cm=micro=nano=false;
                        textView2.setText(" ");
                        break;
                    case"METRE":
                        m=true;
                        in=mi=f=y=k=mm=cm=micro=nano=false;
                        textView2.setText("M");
                        break;
                    case"KILOMETRE":

                        k=true;
                        in=mi=f=y=m=mm=cm=micro=nano=false;
                        textView2.setText("KM");
                        break;
                    case"MILLIMETRE":
                        mm=true;
                        in=mi=f=y=m=k=cm=micro=nano=false;
                        textView2.setText("MM");
                        break;
                    case"MICROMETRE":
                        micro=true;
                        in=mi=f=y=m=mm=cm=k=nano=false;
                        textView2.setText("µM");
                        break;
                    case"CENTIMETRE":
                        cm=true;
                        in=mi=f=y=m=mm=k=micro=nano=false;
                        textView2.setText("CM");
                        break;
                    case"NANOMETRE":
                        nano=true;
                        in=mi=f=y=m=mm=cm=micro=k=false;
                        textView2.setText("NM");
                        break;
                    case "INCH":
                        in=true;
                        nano=mi=f=y=m=mm=cm=micro=k=false;
                        textView2.setText("INCHES");
                        break;
                    case"FOOT":
                        f=true;
                        in=mi=nano=y=m=mm=cm=micro=k=false;
                        textView2.setText("FT");
                        break;
                    case"YARD":
                        y=true;
                        in=mi=f=nano=m=mm=cm=micro=k=false;
                        textView2.setText("YARDS");
                        break;
                    case"MILE":
                        mi=true;
                        in=nano=f=y=m=mm=cm=micro=k=false;
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
                        Cm=Cf=Cmi=Cy=Ci=Ccm=Ck=Cmicro=Cmm=Cnano=false;
                        textView3.setText(" ");
                        break;
                    case"METRE":
                        Cm=true;
                        Cf=Cmi=Cy=Ci=Ccm=Ck=Cmicro=Cmm=Cnano=false;
                        textView3.setText("M");
                        break;
                    case"KILOMETRE":
                        Ck=true;
                        Cf=Cmi=Cy=Ci=Ccm=Cm=Cmicro=Cmm=Cnano=false;
                        textView3.setText("KM");
                        break;
                    case"CENTIMETRE":
                        Ccm=true;
                        Cf=Cmi=Cy=Ci=Cm=Ck=Cmicro=Cmm=Cnano=false;
                        textView3.setText("CM");
                        break;
                    case"MICROMETRE":

                        Cmicro=true;
                        Cf=Cmi=Cy=Ci=Ccm=Ck=Cm=Cmm=Cnano=false;
                        textView3.setText("µM");
                        break;
                    case"MILLIMETRE":
                        Cmm=true;
                        Cf=Cmi=Cy=Ci=Ccm=Ck=Cmicro=Cm=Cnano=false;
                        textView3.setText("MM");
                        break;
                    case"NANOMETRE":
                        Cnano=true;
                        Cf=Cmi=Cy=Ci=Ccm=Ck=Cmicro=Cmm=Cm=false;
                        textView3.setText("NM");
                        break;
                    case "INCH":
                        Ci=true;
                        Cf=Cmi=Cy=Cnano=Ccm=Ck=Cmicro=Cmm=Cm=false;
                        textView3.setText("INCHES");
                        break;
                    case"FOOT":

                        Cf=true;
                        Cnano=Cmi=Cy=Ci=Ccm=Ck=Cmicro=Cmm=Cm=false;
                        textView3.setText("FT");
                        break;
                    case"YARD":
                        Cy=true;
                        Cf=Cmi=Cnano=Ci=Ccm=Ck=Cmicro=Cmm=Cm=false;
                        textView3.setText("YARDS");
                        break;
                    case"MILE":
                        Cmi=true;
                        Cf=Cnano=Cy=Ci=Ccm=Ck=Cmicro=Cmm=Cm=false;
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



        convert.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                //Conversion formulas from metre to other units
                try{
                    if (m) {
                        //m=false;
                        if (Ck) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr / 1000);
                        }
                        if (Cmm) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * 1000);
                        }
                        if (Ccm) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * 100);
                        }
                        if (Cmicro) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * Math.pow(10.0, 6.0));
                        }
                        if (Cnano) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * Math.pow(10.0, 9.0));
                        }
                        if (Cf) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * 3.281);
                            //Cf=false;

                        }
                        if (Cm) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr);
                            //Cm=false;
                        }
                        if (Ci) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * 39.37);
                            //Ci=false;
                        }
                        if (Cmi) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr / 1609);
                            //Cmi=false;

                        }
                        if (Cy) {
                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                            textView.setText("" + nbr * 1.094);
                            //Cy=false;

                        }

                    } else {
                        //Conversion formulas from inch to other units
                        if (in) {
                            //i=false;
                            if (Cmicro) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr * 25400);
                            }
                            if (Ck) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr / 39370);
                            }
                            if (Cmm) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr * 25.4);
                            }
                            if (Ccm) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr * 2.54);
                            }
                            if (Cnano) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr * 25400000);
                            }
                            if (Cf) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr / 12);
                                //  Cf=false;

                            }
                            if (Cm) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr / 39.37);
                                //Cm=false;
                            }
                            if (Ci) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr);
                                //Ci=false;
                            }
                            if (Cmi) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr / 63360);
                                //Cmi=false;

                            }
                            if (Cy) {
                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                textView.setText("" + nbr / 36);
                                //Cy=false;

                            }

                        } else {
                            //Conversion formulas from mile to other units
                            if (mi) {
                                // mi=false;
                                if (Ck) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 1.609

                                    );
                                }
                                if (Cmm) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 1.609e+6

                                    );
                                }
                                if (Ccm) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 160934

                                    );

                                }
                                if (Cmicro) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 1.609e+9


                                    );
                                }
                                if (Cnano) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 1.609e+12


                                    );
                                }


                                if (Cf) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 5280
                                    );
                                    //Cf=false;

                                }
                                if (Cm) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 1609
                                    );
                                    //Cm=false;
                                }
                                if (Ci) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 63360
                                    );
                                    //Ci=false;
                                }
                                if (Cmi) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr);
                                    //Cmi=false;

                                }
                                if (Cy) {
                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                    textView.setText("" + nbr * 1760);
                                    //Cy=false;

                                }

                            } else {
                                if (f) {
                                    //Conversion formulas from foot to other units
                                    //f=false;
                                    if (Ck) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr / 3281
                                        );
                                    }
                                    if (Cmm) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr * 305
                                        );
                                    }
                                    if (Ccm) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr * 30.48
                                        );
                                    }
                                    if (Cmicro) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr * 304800

                                        );
                                    }
                                    if (Cnano) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr * 3.048e+8

                                        );
                                    }
                                    if (Cf) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr
                                        );
                                        //  Cf=false;

                                    }
                                    if (Cm) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr / 3.281

                                        );
                                        //Cm=false;
                                    }
                                    if (Ci) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr * 12
                                        );
                                        //Ci=false;
                                    }
                                    if (Cmi) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr / 5280);
                                        //Cmi=false;

                                    }
                                    if (Cy) {
                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                        textView.setText("" + nbr / 3);
                                        //Cy=false;

                                    }

                                } else {
                                    if (y) {
                                        //Conversion formulas from yard to other units
                                        //y=false;
                                        if (Ck) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr / 1094
                                            );
                                        }
                                        if (Cmm) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr * 914
                                            );
                                        }
                                        if (Ccm) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr * 91.44
                                            );
                                        }
                                        if (Cnano) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr * 9.144e+8

                                            );
                                        }
                                        if (Cmicro) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr * 914400

                                            );
                                        }
                                        if (Cf) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr * 3
                                            );
                                            //  Cf=false;

                                        }
                                        if (Cm) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr / 1.094


                                            );
                                            //Cm=false;
                                        }
                                        if (Ci) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr * 36
                                            );
                                            //Ci=false;
                                        }
                                        if (Cmi) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr / 1760);
                                            //Cmi=false;

                                        }
                                        if (Cy) {
                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                            textView.setText("" + nbr);
                                            //Cy=false;

                                        }
                                    } else {
                                        if (k) {
                                            //Conversion formulas from kilometer to other units
                                            if (Ck) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr
                                                );
                                            }
                                            if (Cmm) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 1e+6

                                                );
                                            }
                                            if (Ccm) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 100000
                                                );
                                            }
                                            if (Cnano) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 1e+12

                                                );
                                            }
                                            if (Cmicro) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 1e+9

                                                );
                                            }
                                            if (Cf) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 3281
                                                );
                                                //  Cf=false;

                                            }
                                            if (Cm) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 1000


                                                );
                                                //Cm=false;
                                            }
                                            if (Ci) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 39370

                                                );
                                                //Ci=false;
                                            }
                                            if (Cmi) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr / 1.609
                                                );
                                                //Cmi=false;

                                            }
                                            if (Cy) {
                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                textView.setText("" + nbr * 1094
                                                );
                                                //Cy=false;

                                            }

                                        } else {
                                            if (cm) {
                                                //Conversion formulas from centimetre to other units
                                                if (Ck) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr / 100000

                                                    );
                                                }
                                                if (Cmm) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr * 10

                                                    );
                                                }
                                                if (Ccm) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr
                                                    );
                                                }
                                                if (Cnano) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr * 1e+7

                                                    );
                                                }
                                                if (Cmicro) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr * 10000

                                                    );
                                                }
                                                if (Cf) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr / 30.48
                                                    );
                                                    //  Cf=false;

                                                }
                                                if (Cm) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr / 100


                                                    );
                                                    //Cm=false;
                                                }
                                                if (Ci) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr / 2.54
                                                    );
                                                    //Ci=false;
                                                }
                                                if (Cmi) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr / 160934
                                                    );
                                                    //Cmi=false;

                                                }
                                                if (Cy) {
                                                    Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                    textView.setText("" + nbr / 91.44
                                                    );
                                                    //Cy=false;

                                                }

                                            } else {
                                                if (mm) {
                                                    //Conversion formulas from milimetre to other units
                                                    if (Ck) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 1e+6

                                                        );
                                                    }
                                                    if (Cmm) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr

                                                        );
                                                    }
                                                    if (Ccm) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 10
                                                        );
                                                    }
                                                    if (Cnano) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr * 1e+6

                                                        );
                                                    }
                                                    if (Cmicro) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr * 1000


                                                        );
                                                    }
                                                    if (Cf) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 305
                                                        );
                                                        //  Cf=false;

                                                    }
                                                    if (Cm) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 1000


                                                        );
                                                        //Cm=false;
                                                    }
                                                    if (Ci) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 25.4
                                                        );
                                                        //Ci=false;
                                                    }
                                                    if (Cmi) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 1.609e+6

                                                        );
                                                        //Cmi=false;

                                                    }
                                                    if (Cy) {
                                                        Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                        textView.setText("" + nbr / 914

                                                        );
                                                        //Cy=false;

                                                    }

                                                } else {
                                                    if (micro) {
                                                        //Conversion formulas from micrometre to other units

                                                        if (Ck) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 1e+9


                                                            );
                                                        }
                                                        if (Cmm) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 1000


                                                            );
                                                        }
                                                        if (Ccm) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 10000
                                                            );
                                                        }
                                                        if (Cnano) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr * 1000

                                                            );
                                                        }
                                                        if (Cmicro) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr


                                                            );
                                                        }
                                                        if (Cf) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 304800

                                                            );
                                                            //  Cf=false;

                                                        }
                                                        if (Cm) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 1e+6


                                                            );
                                                            //Cm=false;
                                                        }
                                                        if (Ci) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 25400
                                                            );
                                                            //Ci=false;
                                                        }
                                                        if (Cmi) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 1.609e+9


                                                            );
                                                            //Cmi=false;

                                                        }
                                                        if (Cy) {
                                                            Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                            textView.setText("" + nbr / 914400


                                                            );
                                                            //Cy=false;

                                                        }

                                                    } else {
                                                        if (nano) {
                                                            //Conversion formulas from nanometre to other units
                                                            if (Ck) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 1e+12


                                                                );
                                                            }
                                                            if (Cmm) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 1e+6


                                                                );
                                                            }
                                                            if (Ccm) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 1e+7

                                                                );
                                                            }
                                                            if (Cnano) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr

                                                                );
                                                            }
                                                            if (Cmicro) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 1000


                                                                );
                                                            }
                                                            if (Cf) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 3.048e+8


                                                                );
                                                                //  Cf=false;

                                                            }
                                                            if (Cm) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 1e+9


                                                                );
                                                                //Cm=false;
                                                            }
                                                            if (Ci) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 2.54e+7

                                                                );
                                                                //Ci=false;
                                                            }
                                                            if (Cmi) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 1.609e+12


                                                                );
                                                                //Cmi=false;

                                                            }
                                                            if (Cy) {
                                                                Float nbr = Float.parseFloat(enteredValue.getText().toString());
                                                                textView.setText("" + nbr / 9.144e+8


                                                                );
                                                                //Cy=false;

                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }
        });



















    }
}