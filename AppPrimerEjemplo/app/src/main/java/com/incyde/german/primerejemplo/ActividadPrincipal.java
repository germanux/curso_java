package com.incyde.german.primerejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadPrincipal extends AppCompatActivity {

    public  class MiClaseReceptorBoton implements View.OnClickListener {
        @Override
        public  void onClick(View view) {
            textoCentral.setText("SE HA PULSADO!");
        }
    }

    TextView textoCentral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        textoCentral = findViewById(R.id.textoHolaMundo);
        textoCentral.setText("Ey! Ha funcionado");

        Button miBoton = findViewById(R.id.botonPulsar);

        View.OnClickListener receptorBoton = new MiClaseReceptorBoton();

        miBoton.setOnClickListener(receptorBoton );

    }
}
