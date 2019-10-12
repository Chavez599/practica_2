package com.example.splash;

import android.content.Context;
import android.widget.Toast;

public class Validar {
    private String Puser = "prensa",
                   Ppass = "1234",
                   Duser = "diseño",
                   Dpass = "4567";
    final private String key="Silvaform";


    public String validar (Context contexto, String user, String password, String area) {
            String valida = "invalidas";

            if (user.equals("") && password.equals(""))
            {
                Toast.makeText(contexto,"Llena los campos", Toast.LENGTH_SHORT).show();
            } else {
                 switch (area) {
                      case "prensas":
                         if (user.equals(Puser))
                         {
                             if (password.equals(Ppass)) {
                              valida = "validas";
                             } else {
                                 Toast.makeText(contexto,"Contraseña invalida",Toast.LENGTH_SHORT).show();
                             }
                         }else {
                             Toast.makeText(contexto,"Usuario invalido", Toast.LENGTH_SHORT).show();
                         }
                      break;

                      case   "diseño":
                          if (user.equals(Duser))
                          {
                              if (password.equals(Dpass)) {

                              } else {
                                  Toast.makeText(contexto,"Contraseña invalida",Toast.LENGTH_SHORT).show();
                              }
                          }else {
                              Toast.makeText(contexto,"Usuario invalido", Toast.LENGTH_SHORT).show();
                          }
                          break;
                      default:
                          Toast.makeText(contexto,"No se encontraron usuarios", Toast.LENGTH_SHORT).show();
                       break;
                 }
            }
            return valida;
        }


    public String ValidarContenido (String verificacion) {
        String valida = "";
        if (verificacion.equals( key )) valida="valida";
        if (!verificacion.equals( key )) valida="invalida";
        return valida;
    }

}
