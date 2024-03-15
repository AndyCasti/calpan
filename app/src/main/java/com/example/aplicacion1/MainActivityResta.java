package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityResta extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resta);
        valor1 = findViewById(R.id.dato1);
        valor2 = findViewById(R.id.dato2);
        resultado = findViewById(R.id.resultado);
    }

    public void resta(View view) {
        try {
            int resta = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
            resultado.setText(String.valueOf(resta));
        } catch (NumberFormatException e) {
            resultado.setText("Ingrese números válidos en los cuadros de texto");
        }
    }

    public void devolver(View view) {
    finish();
    }
}
