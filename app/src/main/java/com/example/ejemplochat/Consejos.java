package com.example.ejemplochat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class Consejos extends AppCompatActivity {
    private int [] imageIds = {R.drawable.motivacion,R.drawable.tiempo, R.drawable.mejora};
    private String [] cardTitles = {"Motivación", "Tiempo y recursos", "Aprende de la \nexperiencia"};
    private String [] cardDescriptions = {
            "Mantener la Motivación: El seguimiento regular a tus proyectos te ayuda a mantenerte enfocado y motivado.",
            "Gestionar mejor el tiempo y los recursos: Hacer seguimiento te ayuda a evaluar si estás utilizando tu tiempo y recursos de manera eficiente.",
            "No tengas miedo de cometer errores. Cada proyecto que gestiones te ayudará a mejorar y ser más eficiente en tu día a día."
    };
    private int currentIndex = 0;
    private ImageView imageView;
    private MaterialTextView cardTitle;
    private MaterialTextView cardDescription;
    private MaterialButton botonNext;
    private MaterialButton botonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);

        ImageButton btnUser = this.<ImageButton>findViewById(R.id.btn_user);
        ImageButton btnHome = this.<ImageButton>findViewById(R.id.btn_home);

        imageView = findViewById(R.id.image_card);
        cardTitle = findViewById(R.id.card_title);
        cardDescription = findViewById(R.id.card_SUBtitle);
        botonNext = findViewById(R.id.btn_siguiente);
        botonBack = findViewById(R.id.btn_atras);

        setterInitialValues();

        // Configuración del listener del image botón de Usuario
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });

        // Configuración del listener del image botón de Home
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHome();
            }
        });

        botonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionesBotonSiguiente();
            }
        });
        botonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionesBotonAtras();
            }
        });
    }

    private void accionesBotonAtras() {
        currentIndex--;
        if(currentIndex < 0)
        {
            currentIndex = imageIds.length - 1;
        }
        setterInitialValues();
    }

    protected void accionesBotonSiguiente() {
        currentIndex++;
        if(currentIndex >= imageIds.length)
        {
            currentIndex = 0;
        }
        setterInitialValues();
    }

    protected void setterInitialValues() {
        imageView.setImageResource(imageIds[currentIndex]);
        cardTitle.setText(cardTitles[currentIndex]);
        cardDescription.setText(cardDescriptions[currentIndex]);
    }

    private void navigateToHome() {
        Intent intent = new Intent(Consejos.this, Zona_navegacion.class);
        startActivity(intent);
        finish();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(Consejos.this, Login.class);
        startActivity(intent);
        finish();
    }
}