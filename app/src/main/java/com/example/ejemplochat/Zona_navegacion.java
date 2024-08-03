package com.example.ejemplochat;

/**
 * En esta clase se desarrolla la actividad de Zonsa de navegación de la aplicación.
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejemplochat.Presenter.LoginPresenter;
import com.example.ejemplochat.model.LoginModel;
import com.example.ejemplochat.view.LoginContract;

public class Zona_navegacion extends AppCompatActivity {

    // Componentes de la interfaz de Zona de navegacion
    private Button btnProyectos;
    private Button btnConsejos;
    private Button btnCompartir;
    private ImageButton btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona_navegacion);

        // Inicialización de componentes de la interfaz de Zona de navegación
        btnProyectos = findViewById(R.id.proyectosButton);
        btnConsejos = findViewById(R.id.consejosButton);
        btnCompartir = findViewById(R.id.compartirButton);
        btnUser = findViewById(R.id.btn_user);


        // Configuración del listener del botón de Compartir

        btnCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToChat();
            }
        });

        // Configuración del listener del botón de Proyectos
        btnProyectos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToProyectos();
            }
        });

        // Configuración del listener del botón de Consejos
        btnConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToConsejos();
            }
        });

        // Configuración del listener del ImageButton de Usuario que regresa al Login
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });
}

    private void navigateToChat() {
        Intent intent = new Intent(Zona_navegacion.this, Chat.class);
        startActivity(intent);
        finish();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(Zona_navegacion.this, Login.class);
        startActivity(intent);
        finish();
    }

    private void navigateToConsejos() {
        Intent intent = new Intent(Zona_navegacion.this, Consejos.class);
        startActivity(intent);
        finish();
    }

    private void navigateToProyectos() {
        Intent intent = new Intent(Zona_navegacion.this, Proyectos.class);
        startActivity(intent);
        finish();
    }
    }