package com.incyde.german.appcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraActivity extends AppCompatActivity {

    EditText textoNumero1;
    EditText textoNumero2;
    EditText textoResultado;

    public class ObservadorBoton implements View.OnClickListener {
        @Override
        public void onClick(View viewBoton) {

            Button botonPulsado = (Button) viewBoton;
            double resultado;
            if (textoNumero1.getText().toString().equals("")
                    || textoNumero2.getText().toString().equals(""))
            {
                resultado = 0;
            } else {
                double numero_1 = Double.parseDouble(textoNumero1.getText().toString());
                double numero_2 = Double.parseDouble(textoNumero2.getText().toString());


                switch (botonPulsado.getId()) {
                    case R.id.botonSumar:
                        resultado = numero_1 + numero_2;
                        break;
                    case R.id.botonRestar:
                        resultado = numero_1 - numero_2;
                        break;
                    case R.id.botonMult:
                        resultado = numero_1 * numero_2;
                        break;
                    case R.id.botonDiv:
                        resultado = numero_1 / numero_2;
                        break;
                    case R.id.botonIgual:
                        textoNumero1.setText(R.string.cero);
                        textoNumero2.setText(R.string.cero);
                        resultado = 0;
                    default:
                        resultado = 0;
                        break;
                }
            }
            textoResultado.setText(String.valueOf(resultado));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculadora);

        this.textoResultado = findViewById(R.id.textResultado);
        this.textoNumero1 = findViewById(R.id.textNumero1);
        this.textoNumero2 = findViewById(R.id.textNumero2);

        View.OnClickListener observadorBoton = new ObservadorBoton();

        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonRes = findViewById(R.id.botonRestar);
        Button botonDiv = findViewById(R.id.botonDiv);
        Button botonMult = findViewById(R.id.botonMult);
        Button botonIgual = findViewById(R.id.botonIgual);

        botonSumar.setOnClickListener(observadorBoton);
        botonRes.setOnClickListener(observadorBoton);
        botonDiv.setOnClickListener(observadorBoton);
        botonMult.setOnClickListener(observadorBoton);
        botonIgual.setOnClickListener(observadorBoton);

        textoNumero1.setText("50");
        textoNumero2.setText("25");

        botonSumar.callOnClick();
    }
}
