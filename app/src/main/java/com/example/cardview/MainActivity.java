package com.example.cardview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {


    private int[] imageIds = {R.drawable.reciclaje, R.drawable.electrico, R.drawable.ahorroEnergia};
    private String[] cardTitles = {"Eficiendcia", "Energia Electrica", "Recursividad"};
    private String [] cardViewDescripcion= { "Aprovecha al máximo los recursos que tienes. Por ejemplo, usa las cantidades mínimas necesarias de agua y materiales en la producción y el consumo." +
            "Adopta tecnologías que reduzcan el consumo de energía y recursos. Por ejemplo, utiliza electrodomésticos con certificación energética de alta eficiencia." +
            "Siempre que sea posible, elige fuentes de energía renovable como la solar, eólica o hidroeléctrica para tus necesidades eléctricas." +
            "Instala paneles solares en tu hogar o empresa para reducir la dependencia de la red eléctrica y minimizar la huella de carbono" +
            "Adopta un enfoque de economía circular en el que los productos se diseñen para ser reutilizados, reparados y reciclados, en lugar de simplemente desechados." +
            "Considera todo el ciclo de vida de los productos, desde la producción hasta el reciclaje. Elige opciones que reduzcan el impacto ambiental en cada etapa del ciclo de vida."
    };


    private int currentndex = 0;
    private ImageView imagenCardView;
    private MaterialTextView cardTitulo;
    private MaterialTextView descripcion;
    private MaterialButton next;
    private MaterialButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
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
    }

    private void accionesBottonSiguiente() {

        currentndex ++;
        if(currentndex>= imageIds.length){
            currentndex = 0;
        }
        settersInitialValues();
    }

    private void settersInitialValues() {
    }
}