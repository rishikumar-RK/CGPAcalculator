package com.example.rishi.cgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mark,credit;
    int mark1,mark2,mark3,mark4,mark5,mark6,mark7,mark8,mark9,mark10,mark11,mark12;
    int credit1,credit2,credit3,credit4,credit5,credit6,credit7,credit8,credit9,credit10,credit11,credit12;
    float resultcgpa=0,totalmarks=0;

    Button button;

    public int getMark(int p) {
        switch (p){
            case 0:
                mark=0;
                break;
            case 1:
                mark=10;
                break;
            case 2:
                mark=9;
                break;
            case 3:
                mark=8;
                break;
            case 4:
                mark=7;
                break;
            case 5:
                mark=6;
                break;
        }
        return mark;
    }
    public int getcredit(int p){
        switch (p){
            case 0:
                credit=0;
                break;
            case 1:
                credit=1;
                break;
            case 2:
                credit=2;
                break;
            case 3:
                credit=3;
                break;
            case 4:
                credit=4;
                break;
        }
        return credit;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spin1=(Spinner) findViewById(R.id.spinner1);
        Spinner spin2=(Spinner) findViewById(R.id.spinner2);
        Spinner spin3=(Spinner) findViewById(R.id.spinner3);
        Spinner spin4=(Spinner) findViewById(R.id.spinner4);
        Spinner spin5=(Spinner) findViewById(R.id.spinner5);
        Spinner spin6=(Spinner) findViewById(R.id.spinner6);
        Spinner spin7=(Spinner) findViewById(R.id.spinner7);
        Spinner spin8=(Spinner) findViewById(R.id.spinner8);
        Spinner spin9=(Spinner) findViewById(R.id.spinner9);
        Spinner spin10=(Spinner) findViewById(R.id.spinner10);
        Spinner spin11=(Spinner) findViewById(R.id.spinner11);
        Spinner spin12=(Spinner) findViewById(R.id.spinner12);
        Spinner spin13=(Spinner) findViewById(R.id.spinner13);
        Spinner spin14=(Spinner) findViewById(R.id.spinner14);
        Spinner spin15=(Spinner) findViewById(R.id.spinner15);
        Spinner spin16=(Spinner) findViewById(R.id.spinner16);
        Spinner spin17=(Spinner) findViewById(R.id.spinner17);
        Spinner spin18=(Spinner) findViewById(R.id.spinner18);
        Spinner spin19=(Spinner) findViewById(R.id.spinner19);
        Spinner spin20=(Spinner) findViewById(R.id.spinner20);
        Spinner spin21=(Spinner) findViewById(R.id.spinner21);
        Spinner spin22=(Spinner) findViewById(R.id.spinner22);
        Spinner spin23=(Spinner) findViewById(R.id.spinner23);
        Spinner spin24=(Spinner) findViewById(R.id.spinner24);



        button=(Button) findViewById(R.id.button);

        ArrayAdapter<String> myAdapter1=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.credits));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        ArrayAdapter<String> myAdapter2= new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.grades));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin1.setAdapter(myAdapter1);
        spin2.setAdapter(myAdapter2);
        spin3.setAdapter(myAdapter1);
        spin4.setAdapter(myAdapter2);
        spin5.setAdapter(myAdapter1);
        spin6.setAdapter(myAdapter2);
        spin7.setAdapter(myAdapter1);
        spin8.setAdapter(myAdapter2);
        spin9.setAdapter(myAdapter1);
        spin10.setAdapter(myAdapter2);
        spin11.setAdapter(myAdapter1);
        spin12.setAdapter(myAdapter2);
        spin13.setAdapter(myAdapter1);
        spin14.setAdapter(myAdapter2);
        spin15.setAdapter(myAdapter1);
        spin16.setAdapter(myAdapter2);
        spin17.setAdapter(myAdapter1);
        spin18.setAdapter(myAdapter2);
        spin19.setAdapter(myAdapter1);
        spin20.setAdapter(myAdapter2);
        spin21.setAdapter(myAdapter1);
        spin22.setAdapter(myAdapter2);
        spin23.setAdapter(myAdapter1);
        spin24.setAdapter(myAdapter2);





        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit1=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit1=0;
            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark1=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark1=0;
            }

        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit2=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit2=0;
            }
        });

        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark2=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark2=0;
            }

        });

        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit3=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit3=0;
            }
        });

        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark3=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark3=0;
            }

        });

        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit4=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit4=0;
            }
        });

        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark4=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark4=0;
            }

        });

        spin9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit5=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit5=0;
            }
        });

        spin10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark5=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark5=0;
            }

        });

        spin11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit6=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit6=0;
            }
        });

        spin12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark6=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark6=0;
            }

        });

        spin13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit7=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit7=0;
            }
        });

        spin14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark7=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark7=0;
            }

        });

        spin15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit8=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit8=0;
            }
        });

        spin16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark8=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark8=0;
            }

        });

        spin17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit9=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit9=0;
            }
        });

        spin18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark9=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark9=0;
            }

        });

        spin19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit10=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit10=0;
            }
        });

        spin20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark10=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark10=0;
            }

        });

        spin21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit11=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit11=0;
            }
        });

        spin22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark11=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark11=0;
            }

        });

        spin23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                credit12=getcredit(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                credit12=0;
            }
        });

        spin24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mark12=getMark(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mark12=0;
            }

        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                totalmarks=credit1+credit2+credit3+credit4+credit5+credit6+credit7+credit8+credit9+credit10+credit11+credit12;
                resultcgpa=((credit1*mark1)+(credit2*mark2)+(credit3*mark3)+(credit4*mark4)+(credit5*mark5)+(credit6*mark6)
                +(credit7*mark7)+(credit8*mark8)+(credit9*mark9)+(credit10*mark10)+(credit11*mark11)+(credit12*mark12))/totalmarks;



                Toast toast=Toast.makeText(getApplicationContext(),
                        " CGPA = "+String.format("%.2f",resultcgpa),Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                LinearLayout tv=(LinearLayout) toast.getView();
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.ic_toasticon);
                tv.addView(imageView,0);
                toast.show();


            }
        });
    }





}
