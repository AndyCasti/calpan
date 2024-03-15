package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityFibo extends AppCompatActivity {

    private EditText valor1;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fibo);
        valor1 = findViewById(R.id.dato1);
        resultado = findViewById(R.id.resultado);
    }

    public void calcularFibonacci(View view) {
        try {
            int numero = Integer.parseInt(valor1.getText().toString());

            if (numero < 0) {
                resultado.setText("Ingrese un número válido en cuadrito1");
            } else {
                resultado.setText(String.valueOf(fibonacci(numero)));
            }
        } catch (NumberFormatException e) {
            resultado.setText("Ingrese un número válido en cuadrito1");
        }
    }

    private int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void devolver(View view) {
        finish();
    }
}
