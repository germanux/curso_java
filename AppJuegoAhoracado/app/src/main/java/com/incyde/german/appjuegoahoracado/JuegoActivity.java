package com.incyde.german.appjuegoahoracado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class JuegoActivity extends AppCompatActivity {

    TextView textoGuiones;
    EditText textoLetra;
    Button botonJugar;
    ImageView imagen;

     String palabraElegida = "";
     String letra = "";
     String guiones = "";
     String nuevosGuiones = "";
     String nuevosGuionesAnterior = "";
     ListaFalladas listaFalladas;
     int longitudPalabra;
     int contadorFallos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        textoGuiones = findViewById(R.id.palabra);
        textoLetra = findViewById(R.id.textoLetra);
        botonJugar = findViewById(R.id.botonJugar);
        imagen = findViewById(R.id.imageView);

        botonJugar.setOnClickListener(new AlPulsarBotonJugar());

        listaFalladas = new ListaFalladas();
        palabraElegida = ListaPalabras.palabraAleatoria();
        longitudPalabra = palabraElegida.length();
        // System.out.println("La palabra es " + ListaPalabras.palabraAleatoria());
        guiones = soloGuiones_A();
        nuevosGuionesAnterior =  guiones;
        System.out.println("Palabra: " + guiones);
        nuevosGuiones = guiones;

    }
    class AlPulsarBotonJugar implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            if (nuevosGuiones.contains("-") && contadorFallos <= 6 ) {
                // listaFalladas.mostrarLista();
                letra = textoLetra.getText().toString();

                if (palabraElegida.contains(letra)) {
                    cuandoAciertaLetra();
                } else {
                    contadorFallos = contadorFallos + 1;  // contadorFallos++;
                    switch (contadorFallos) {
                        case 1:
                            imagen.setImageDrawable(getResources().getDrawable(R.drawable.ahorcado_1));
                            break;
                        case 2:
                            imagen.setImageDrawable(getResources().getDrawable(R.drawable.ahorcado_2));
                            break;
                    }
                    listaFalladas.agregarLetra(letra);
                }
            }
            if (contadorFallos >= 6) {
                System.out.println("Se siente pero has perdido");
            }
            else {
                System.out.println("Felicidades! Has ganado!");
            }
        }
    }


     String soloGuiones_A() {
        String guiones = "";
        for (int i = 0; i < longitudPalabra; i++) {
            guiones = guiones + "-";
        }
        return guiones;
    }
     String soloGuiones_B() {
        String guiones = "-----------".substring(0, longitudPalabra);
        return guiones;
    }
    public  void main(String[] args) {
    }
     void cuandoAciertaLetra() {
        int posicion;
        String letraPos;
        nuevosGuiones = "";
        for (posicion = 0; posicion < longitudPalabra; posicion++) {
            letraPos = String.valueOf(palabraElegida.charAt(posicion));

            if (letra.equals(letraPos)) { // A
                // System.out.println("pos: " + posicion + ", let: " +letraPos);
                nuevosGuiones = nuevosGuiones + letraPos;
            } else { // X

                nuevosGuiones = nuevosGuiones + nuevosGuionesAnterior.charAt(posicion);

            }

        }
        nuevosGuionesAnterior = nuevosGuiones;
        // System.out.println(nuevosGuiones);
        textoGuiones.setText(nuevosGuiones);
    }
}
