package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Textview;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    EditText etpn;
    EditText etape;
    EditText Edtnd;
    Button buttonc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etpn = findViewById(R.id.etpn);
        etape = findViewByd(R.id.etape);
        Edtnd = findViewByd(R.id.Edtnd);
        Buttonc = findViewByd(R.id.buttonc);

        buttonc.setOnClickListener (new View.OnClickListener() {
            @overide
            public void onClick(View V) {
                Intent intent=new Intent(getApplicationContext(),SegundaActivity.class);
                Intent.putExtra("Nombre",etpn.getText().toString());
                Intent.putExtra("Apellido",etape.getText().toString());
                Intent.putExtra("Sueldo",Edtnd.getText().toString());
                startActivity(intent);

            }
        }};
    }
