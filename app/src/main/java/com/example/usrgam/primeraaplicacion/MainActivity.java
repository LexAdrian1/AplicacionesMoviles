package com.example.usrgam.primeraaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    EditText escribir;
    Button botonmensaje;
    Button botoncambio;
    String[] datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lista;
        ArrayAdapter<String> adapter;
        ;
        lista = findViewById(R.id.Listp);
        setContentView(R.layout.activity_main);
        botonmensaje = findViewById(R.id.buttonMensaje);
       botoncambio = findViewById(R.id.button2);
        escribir = findViewById(R.id.editTextEscribir);
        cargar();
        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,datos);
        lista.setAdapter(adapter);
        botoncambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // Obtengo el activity General getApplicationContext()
                intent.putExtra("idTexto",escribir.getText().toString());
                intent.putExtra("idPersona",(Serializable) new Persona("paul","cisneros","pasad","123"));
                startActivity(intent);
            }
        });


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
               // Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity)
            }
        });


        botonmensaje.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast mensaje = Toast.makeText(getApplicationContext() ,escribir.getText().toString(), Toast.LENGTH_LONG);
                mensaje.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                mensaje.show();
            }
        });



    }
    private void cargar(){
       // datos =new Persona[]  {new Persona("asda","asdsad","adsasd","sadad",new Persona("asda","asdsad","adsasd","sadad");
    }
}
