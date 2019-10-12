package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user,
             passw;

    Button   loging;
    Spinner  areas;
    String area = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.usuario);
        passw = findViewById(R.id.contraseña);
        loging = findViewById(R.id.btnLoging);
        areas = findViewById(R.id.combo_areas);

        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.areas_de_trabajo,R.layout.support_simple_spinner_dropdown_item);
        areas.setAdapter(adapter);
        areas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                area = adapterView.getItemAtPosition(position).toString();

                Toast.makeText(adapterView.getContext(), String.valueOf(adapterView.getItemAtPosition(position).toString()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        loging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Validar objeto = new Validar();
              if ( objeto.validar (getApplicationContext(),user.getText().toString(),passw.getText().toString(),area).equals("validas"))
                {
                    Intent intent = new Intent(Login.this,home.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
