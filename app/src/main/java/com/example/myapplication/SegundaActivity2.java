package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity2 extends AppCompatActivity {
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;

    TextView editTextnumberDecimal;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);

        String Nombre =getIntent().getExtras().getString("Nombre");
        String Ape =getIntent().getExtras().getString("Ape");
        String sueldo =getIntent().getExtras().getString("Sueldo");
        textView5.setText(Nombre)
        textView6.setText(Ape)
        textView7.setText(Sueldo)
        double liquido = Double.parseDouble(sueldo)
        double iva = (liquido*12)/100;
        String liquido2 = String.valueOf(iva);
        textView8.setText(liquido2);


        button = findviewById(R.id.button);
        button.setOnClickListener(new View.OnclickListener() {


            public void onClick(View view) {
                Intent intent=new Intent(SegundaActivity.this, MainActivity.class);
                startActivity(intent);


            }

        }

        }
}