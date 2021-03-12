/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect;

/**
 *
 * @author arros_000
 */
public class password {
    int longitud;
    String user_password;

    password() {
        this.longitud = 8;
        this.user_password = "";
    }

    password(int longitud_) {
        this.user_password = this.generarPassword(longitud_);
    }

    public String generarPassword(int longitud_) {
        String password = "";

        for (int i = 0; i < longitud_; i++) {
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));
            if (eleccion == 1) {
                char minusculas = 
                        (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else if (eleccion == 2) {
                char mayusculas = 
                        (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                password += mayusculas;

            } else {
                char numeros = 
                        (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                password += numeros;
            }
        }
        return password;
    }

    public boolean esFuerte() {
        int cuentaNumeros = 0;
        int cuentaMinusculas = 0;
        int cuentaMayusculas = 0;
        String password = this.user_password;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                cuentaMinusculas += 1;

            } else if (password.charAt(i) > 65 && password.charAt(i) <= 90) {
                cuentaMayusculas += 1;
            }
            else {
                cuentaNumeros += 1;
            }
        }
        if (cuentaNumeros >= 5 && cuentaMinusculas >= 1 &&
                cuentaMayusculas >= 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getUser_password() {
        return user_password;
    }

}
