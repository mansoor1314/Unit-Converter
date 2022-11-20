package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView,getValueinGrams, textView2, textView4, ValueinGrams;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        ValueinGrams = findViewById(R.id.ValueinGrams);
        getValueinGrams =findViewById((R.id.ValueinGrams));
        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConverFromKiloToGrams();
            }
        });


    }

    private void ConverFromKiloToGrams() {

        String valueEnteredinKILO= editText.getText().toString();


        double Kilo = Double.parseDouble(valueEnteredinKILO);


        double grams = Kilo * 1000;


        getValueinGrams.setText("" + grams);
    }
}


