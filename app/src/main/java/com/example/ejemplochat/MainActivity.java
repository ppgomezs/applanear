package com.example.ejemplochat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Con esto se carga la animación desde un archivo XML
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion_personalizada);

        // Aquí se asigna un Listener a la animación
        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // La animación ha comenzado
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // La animación ha terminado, se inicia la actividad de Login
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // La animación se ha repetido
            }
        });

        // Iniciar la animación en una vista específica
        View vistaAnimada = findViewById(R.id.vista_animada);
        vistaAnimada.startAnimation(animacion);
    }
}