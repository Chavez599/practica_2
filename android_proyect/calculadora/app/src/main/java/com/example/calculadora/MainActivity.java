package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   /* @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this ,"esta empezando", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
      @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this ,"on stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this ,"esta destruyendo", Toast.LENGTH_SHORT).show();
    }

*/
    TextView result;
    EditText one;
    EditText two;
    Button operar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.resultado);
        one = findViewById(R.id.primerNumero);
        two = findViewById(R.id.segundoNumero);
        operar = findViewById(R.id.operation);
        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (one.getText().toString().equals(""))
                {
                    one.setError("Ingresa un valor");
                }else if (two.getText().toString().equals("")) {
                    two.setError("Ingresa un numero");
                }else {
                       int a,b;
                       int resultado;
                       a= Integer.valueOf(one.getText().toString());
                       b= Integer.valueOf(two.getText().toString());
                       resultado = a+b;
                    result.setText("El resultado es :  " + resultado);
                }
            }
        });
    }


}
