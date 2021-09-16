package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Declare the widgets
    TextView txt1, txt2, txt3, txt4;
    EditText et1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Instantiating the widgets.

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);

        et1 = findViewById(R.id.et1);

        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertKiloToPounds();
            }
        });
    }

    private void ConvertKiloToPounds() {
//        Getting the value from user

        String valueInKilo = et1.getText().toString();

//        Converting the given value

        double valueInDouble = Double.parseDouble(valueInKilo);

        double valueInPounds = valueInDouble * 2.205;

        String finalValue =  Double.toString(valueInPounds);

//        Setting the converted value

        txt4.setText(finalValue);

    }
}