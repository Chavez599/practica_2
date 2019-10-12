package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user,
         password;
RadioButton hombre,
            mujer;
CheckBox terminos;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.edUser);
        password = findViewById(R.id.edPassword);
        hombre = findViewById(R.id.hombre);
        mujer = findViewById(R.id.mujer);
       terminos = findViewById(R.id.Terminos);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validacredenciales validar = new Validacredenciales();

               if (validar.validaCredenciales(user.getText().toString(),
                       password.getText().toString(),hombre.isChecked(),
                       mujer.isChecked(), terminos.isChecked(), getApplicationContext()))
                {
                    Intent intent_name = new Intent(MainActivity.this, home.class);
                    intent_name.putExtra("Usuario", user.getText().toString());
                    intent_name.putExtra("Clave","Bienvenido");
                    startActivity(intent_name);
                    finish();
                }
            }
        });
    }

}
