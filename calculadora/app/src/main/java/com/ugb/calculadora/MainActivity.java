package com.ugb.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    TextView temVal;
    Button btn;
    Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btncalcular);
        btn .setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                tempVal = findViewById(id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal =findViewById(id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());
                double respuesta = 0;
                spn = findViewById(id.spnOpciones);
                switch (spn.getSelectedItemPosition()){
                    case 0:
                        respuesta = num1+num2;
                        break;
                    case 1:
                        respuesta = num1-num2;
                        break;
                    case 2:
                        respuesta = num1*num2;
                        break;
                    case 3:
                        respuesta = num1/num2;
                        break;
                    case 4:
                        respuesta = (num2*num1)/100;
                        break;
                    case 5:

                            respuesta = Math.pow(num1,num2);
                        break;
                    case 6:
                        int numfactorial = 1;
                        for (int i = 1; i <= num1;++){numfactorial = numfactorial*i;}
                        respuesta = numfactorial;

                        break;
                    case 7:
                            respuesta = Math.pow(num1,(1/num2));
                        break;

                }
                tempVal = findViewById(id.lblrespuesta);
                tempVal.setText("Respuesta: "+respuesta);
            }
        });
    }
}