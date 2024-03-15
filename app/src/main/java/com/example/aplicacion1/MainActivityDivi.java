package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityDivi extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_divi);
        valor1 = findViewById(R.id.dato1);
        valor2 = findViewById(R.id.dato2);
        resultado = findViewById(R.id.resultado);
    }

    public void division(View view) {
        int divisor = Integer.parseInt(valor2.getText().toString());
        if (divisor == 0) {
            resultado.setText("No se puede dividir por cero");
        } else {
            int division = Integer.parseInt(valor1.getText().toString()) / divisor;
            resultado.setText(String.valueOf(division));
        }
    }

    public void devolver(View view) {
        finish();
    }
}
