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
enum clasificacion {
    A, B, C, D, E, F, G, H,
    I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
}
enum colores {
    BLANCO, NEGRO, ROJO, AZUL, GRIS;
}

public class Electrodomestico {
    public double precio;
    public double base;

    public colores color;
    public double peso;
    public clasificacion consumoEnergetico;
    Electrodomestico() {
        this.peso = 5;
        this.color = colores.BLANCO;
        this.base = 100;
    }
    
    Electrodomestico(double precio_, double peso_) {
        this.precio = precio_;
        this.peso = peso_;
        this.color = colores.BLANCO;
        this.consumoEnergetico = clasificacion.F;
        this.base = 100;
    }
    
    // precio, peso, clasificacion, color
    
    Electrodomestico(double precio_, 
            double peso_, 
            clasificacion classEnergy, 
            colores color_) {
        this.precio = precio_;
        this.peso = peso_;
        this.color = color_;
        this.consumoEnergetico = classEnergy;
    }

    public String getColor() {
        return color.toString();
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico.toString();
    }
}
