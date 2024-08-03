package com.example.ejemplochat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Proyectos extends AppCompatActivity {

    // Componentes de la interfaz de proyectos
    private ImageButton btnUser;
    private ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyectos);

        // Inicialización de componentes de la interfaz proyectos
        btnUser = findViewById(R.id.btn_user);
        btnHome = findViewById(R.id.btn_home);

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
    }

    private void navigateToHome() {
        Intent intent = new Intent(Proyectos.this, Zona_navegacion.class);
        startActivity(intent);
        finish();
    }

    private void navigateToLogin() {
            Intent intent = new Intent(Proyectos.this, Login.class);
            startActivity(intent);
            finish();
        }

    }