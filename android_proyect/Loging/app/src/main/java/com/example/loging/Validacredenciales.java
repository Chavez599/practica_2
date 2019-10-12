package com.example.loging;

import android.content.Context;
import android.widget.Toast;

public class Validacredenciales {
    protected final static String usuario="Chavez599";
    protected final static String contraseña="Sfi896123";

    public boolean validaCredenciales(String name, String pass, Boolean hombre, Boolean mujer, Boolean terminos, Context contexto){
        boolean validas = false;

        if (name.equals("")|| pass.equals(""))
        {
            validas = false;
            Toast.makeText(contexto, "Debes completar el formulario", Toast.LENGTH_SHORT).show();
        }else if (!hombre && !mujer) {
            validas = false;
            Toast.makeText(contexto, "selecciona un genero", Toast.LENGTH_SHORT).show();
        }else if (!terminos){
            validas = false;
            Toast.makeText(contexto, "acepta terminos y condiciones", Toast.LENGTH_SHORT).show();
        }else {
            if (usuario.equals(name) && contraseña.equals(pass)) {
                validas = true;
            }else{
                Toast.makeText(contexto,"Datos incorrectos", Toast.LENGTH_SHORT).show();
                validas = false;
            }

        }
        return validas;
    }
}
