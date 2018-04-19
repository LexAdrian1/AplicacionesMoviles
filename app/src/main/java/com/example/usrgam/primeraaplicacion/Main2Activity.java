package com.example.usrgam.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView texthola;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        texthola = (TextView) findViewById(R.id.textViewHola);

        Toast mensaje= Toast.makeText(getApplicationContext(),getIntent().getExtras().getString("idTexto"),Toast.LENGTH_LONG);
        mensaje.show();

        texthola.setText(getIntent().getExtras().getString("idTexto"));

    }
}
