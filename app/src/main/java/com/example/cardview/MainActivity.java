package com.example.cardview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private int[] imageIds = {R.drawable.reciclaje, R.drawable.electrico};
    private String[] cardTitles = {"Eficiencia", "Energia Electrica", "Recursividad"};
    private String[] cardViewDescripcion = {
            "Usa las cantidades mínimas necesarias de agua y materiales en la producción y el consumo.",
            "Utiliza electrodomésticos con certificación energética de alta eficiencia.",
            "Siempre que sea posible, elige fuentes de energía renovable",
            "Instala paneles solares en tu hogar o empresa para reducir la dependencia de la red",
            "Considera todo el ciclo de vida de los productos, desde la producción hasta el reciclaje"
    };

    private int currentIndex = 0;
    private ImageView imagenCardView;
    private TextView cardTitulo;
    private TextView descripcion;
    private MaterialButton next;
    private MaterialButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenCardView = findViewById(R.id.imageView);
        cardTitulo = findViewById(R.id.card_title);
        descripcion = findViewById(R.id.textView_footer);
        next = findViewById(R.id.button_next);
        back = findViewById(R.id.button_back);

        settersInitialValues();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionesBottonSiguiente();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionesBottonAtras();
            }
        });
    }

    private void accionesBottonAtras() {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = imageIds.length - 1;
        }
        settersInitialValues();
    }

    private void accionesBottonSiguiente() {
        currentIndex++;
        if (currentIndex >= imageIds.length) {
            currentIndex = 0;
        }
        settersInitialValues();
    }

    private void settersInitialValues() {
        imagenCardView.setImageResource(imageIds[currentIndex]);
        cardTitulo.setText(cardTitles[currentIndex]);
        descripcion.setText(cardViewDescripcion[currentIndex]);
    }
}
