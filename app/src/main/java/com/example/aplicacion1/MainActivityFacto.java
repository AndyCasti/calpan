package com.example.aplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityFacto extends AppCompatActivity {

    private EditText valor1;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_facto);
        valor1 = findViewById(R.id.dato1);
        resultado = findViewById(R.id.resultado);
    }

    public void Factorial(View view) {
        try {
            int numero = Integer.parseInt(valor1.getText().toString());

            if (numero < 0) {
                resultado.setText("Ingrese un número válido en dato1");
            } else {
                long factorial = factorialRecursivo(numero);
                resultado.setText(String.valueOf(factorial));
            }
        } catch (NumberFormatException e) {
            resultado.setText("Ingrese un número válido en dato1");
        }
    }

    private long factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    public void devolver(View view) {
        // Cierra la actividad actual y vuelve a la anterior
        finish();
    }
}
