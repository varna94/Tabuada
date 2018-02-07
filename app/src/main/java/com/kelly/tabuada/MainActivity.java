package com.kelly.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText num;
    private Button soma;
    private Button menos;
    private Button mult;
    private Button div;
    private TextView tela;
    //private EditText tela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.numero);
        mult = (Button) findViewById(R.id.b_mult);

        tela = (TextView) findViewById(R.id.tela);

       // soma.setOnClickListener(this);
       // menos.setOnClickListener(this);
        mult.setOnClickListener(this);
        //div.setOnClickListener(this);

        tela.setText("");


        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resul ="";
                int n = Integer.parseInt(num.getText().toString());


                for (int i = 1; i <= 10; i++) {

                    resul += String.valueOf(n) +" * " +String.valueOf(i)+ " = " + String.valueOf(i * n);
                    resul += "\n";

                    //tela.setText(String.valueOf(n) + " * " + String.valueOf(i) + " = " + String.valueOf(resul));

                }
            tela.setText(resul);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }



}
