package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //int androidStudents = 8;
        //androidStudents = 9 + 1;
        //Log.e("mybresultado", String.valueOf(androidStudents));
        //final int myconstante = 59;
        // comentario de linea simple precedido por dos diagonales
        /* para colocar comentrio de bloque se coloca diagonal
         al principio seguido de un asterisco y se termina con asterisco y diagonal

        operadores aritmeticos
        * + mas
        * - menos
        * *multiplicacion
        * /division
        * % modulo
        operadores Logicos
        * &&   y
        * ||   o
        * ! diferente o no
        * = asignacion
        *
        * operadores de Comparacion
        * > mayor que
        * < menor que
        * >= mayor o igual a
        * <= menor igual a
        * != diferente a
        * == igual a
        *
        * if (grado de verdad)
        * {
        * }
        * if (grado de verdad)
        * {
        * }else
        * {
        * }
        *
        * if (grado de verdad)
        * {
        * if
        * {
        * }
        *
        */
        /*
        int x=1;
        int y=2;

         if (x>y)
         {
             Toast.makeText( this, "x es mayor", Toast.LENGTH_SHORT).show();
         }else
         {
             Toast.makeText( this, "y es mayor", Toast.LENGTH_SHORT).show();
         }

        int x=3;
        int y=2;
        int a = 3;
        if (x>y)
        {
            if (x==a)
            {
            Toast.makeText( this, "x es mayor que y y x es igual a a", Toast.LENGTH_SHORT).show();
            }else
            {
                Toast.makeText(this, "x es mayor que y y x es diferente a a", Toast.LENGTH_SHORT).show();
            }
        }else
        {
            if (x == a) {
                Toast.makeText(this, "y es mayor a x y y es igual a a", Toast.LENGTH_SHORT).show();
            }else
            {
                Toast.makeText(this, "y es mayor a x y y es diferente a a", Toast.LENGTH_SHORT).show();
            }
        }*/
        /*
int calif=0;
switch (calif) {
    case 10:
        Toast.makeText(this, "excelente", Toast.LENGTH_SHORT).show();
        break;
    case 9:
        Toast.makeText(this, " muy bien", Toast.LENGTH_SHORT).show();
        break;
    case 8:
        Toast.makeText(this, "bien", Toast.LENGTH_SHORT).show();
        break;
    case 7:
        Toast.makeText(this, "regular", Toast.LENGTH_SHORT).show();
        break;
    case 6:
        Toast.makeText(this, "suficiente", Toast.LENGTH_SHORT).show();
        break;

    default:

        Toast.makeText(this, "no suficiente", Toast.LENGTH_SHORT).show();
    }
     */
        /*
        int etiquetas_diarias = 0;

        do {
            etiquetas_diarias++;
            Log.e("cantidad de etiquetas", String.valueOf(etiquetas_diarias));
            //etiquetas_diarias = etiquetas_diarias + 1;
        } while (etiquetas_diarias < 1000);

        int etiquetas_diarias = 99;

        do {
            etiquetas_diarias++;
            Log.e("cantidad de etiquetas", String.valueOf(etiquetas_diarias));
            //etiquetas_diarias = etiquetas_diarias + 1;
        } while (etiquetas_diarias < 100);

        int etiquetas_diarias=1;
            while (etiquetas_diarias<101) {
            Log.e("cantidad de etiquetas", String.valueOf(etiquetas_diarias));
            etiquetas_diarias = etiquetas_diarias + 1;
        }

        for (int i=1;i<101;i++) {
            Log.e("cantidad de etiquetas", String.valueOf(i));
        }

        int tinta=100
        for (int i=2;i<101;i=i+2) {
            Log.e("cantidad de etiquetas", String.valueOf(i));
        }

    int edades[]={49,20,54,29,31,45,30,24};
    for (int index=0; index<edades.length; index++)
    {
        Log.e("edades", String.valueOf(edades[index]));
    }

         */
        int edades[]={49,20,54,29,31,45,30,24};
        int index=0;
            Log.e("edades", String.valueOf(edades[index]));
        

    }
}