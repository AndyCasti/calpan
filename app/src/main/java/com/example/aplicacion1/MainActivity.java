package com.example.aplicacion1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void suma(View view) {
        Intent c = new Intent(this, MainActivitySuma.class);
        startActivity(c);
    }
    public void resta(View view) {
        Intent c = new Intent(this, MainActivityResta.class);
        startActivity(c);
    }
    public void multi(View view) {
        Intent c = new Intent(this, MainActivityMulti.class);
        startActivity(c);
    }
    public void divi(View view) {
        Intent c = new Intent(this, MainActivityDivi.class);
        startActivity(c);
    }
    public void facto(View view) {
        Intent c = new Intent(this, MainActivityFacto.class);
        startActivity(c);
    }
    public void Fibo(View view) {
        Intent c = new Intent(this, MainActivityFibo.class);
        startActivity(c);
    }
}
