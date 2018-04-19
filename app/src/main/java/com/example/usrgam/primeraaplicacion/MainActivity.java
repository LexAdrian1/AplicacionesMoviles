package com.example.usrgam.primeraaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText escribir;
    Button botonmensaje;
    Button botoncambio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonmensaje = (Button)findViewById(R.id.buttonMensaje);
        botoncambio = (Button)findViewById(R.id.button2);
        escribir = (EditText)findViewById(R.id.editTextEscribir);

        botoncambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // Obtengo el activity General getApplicationContext()
                intent.putExtra("idTexto",escribir.getText().toString());
                startActivity(intent);
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
}
