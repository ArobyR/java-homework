/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect;

import java.text.MessageFormat;

/**
 *
 * @author arros_000
 */
public class cuenta {

    public String titular;
    public double cantidad;

    cuenta(String titular_) {
        this.titular = titular_;
        this.cantidad = 0;
    }

    cuenta(String titular_, double cantidad_) {
        this.titular = titular_;
        this.cantidad = cantidad_;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad_) {
        if (cantidad_ < 0) {
            return;
        }
        this.cantidad = cantidad_;
    }

    public void retirar(double cantidad_) {
        if (cantidad_ < 0) {
            this.cantidad = 0;
        }
        else {
             this.cantidad -= cantidad_;           
        }
    }

    @Override
    public String toString() {
        Object[] params = new Object[]{this.titular, this.cantidad};
        String msg
                = MessageFormat.format("El Titular {0}"
                        + " tiene {1} pesos en la cuenta" , params);
        return msg;
    }
}
