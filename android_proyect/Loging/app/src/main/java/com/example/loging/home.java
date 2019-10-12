package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {

TextView bienvenida, usuario, appBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bienvenida = findViewById(R.id.tvbienvenida);
        usuario =findViewById(R.id.tvusuario);
        appBar = findViewById(R.id.labelApp);
        /* obtener los datos */
        Intent intent = getIntent();
        Bundle datos = intent.getExtras();
        /* condicional para el desempaquetado de datos */
                if (datos!=null) {
                    bienvenida.setText(datos.getString("Clave"));
                    usuario.setText(datos.getString("Usuario"));
                    appBar.setText(datos.getString("Clave"));
                }

    }
}
