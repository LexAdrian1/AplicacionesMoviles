package com.example.usrgam.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView texthola,textnombre,textapellido,textcedula,textcorreo;;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        texthola = (TextView) findViewById(R.id.textViewHola);
       // textnombre = (TextView) findViewById(R.id.textnombre);


        Toast mensaje= Toast.makeText(getApplicationContext(),getIntent().getExtras().getString("idTexto"),Toast.LENGTH_LONG);
        Persona persona = (Persona) (getIntent().getExtras().getSerializable("idPersona"));
        ((TextView) findViewById(R.id.textnombre)).setText(persona.getNombre());
        ((TextView) findViewById(R.id.textapellido)).setText(persona.getApellido());
        ((TextView) findViewById(R.id.textcorreo)).setText(persona.getCorreo());
        ((TextView) findViewById(R.id.textcedula)).setText(persona.getCedula());

        mensaje.show();

        texthola.setText(getIntent().getExtras().getString("idTexto"));

    }
}
