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
public class Persona {

    private String nombre, cedula;
    private int edad, peso, altura;
    private char sexo;

    Persona() {
        this.nombre = "";
        this.altura = 0;
        this.peso = 0;
        this.edad = 0;
        this.sexo = 'H';
        this.generarCedula();
    }

    Persona(String nombre_, int edad_, char sexo_) {
        this.nombre = nombre_;
        this.altura = 0;
        this.peso = 0;
        this.edad = edad_;
        this.sexo = sexo_;
        this.generarCedula();
    }

    Persona(String nombre_,
            int edad_,
            String cedula_,
            int peso_,
            int altura_,
            char sexo_) {
        this.nombre = nombre_;
        this.edad = edad_;
        this.sexo = sexo_;
        this.cedula = cedula_; // quit cedula
        this.peso = peso_;
        this.altura = altura_;
    }

    public void setNombre(String nombre_) {
        this.nombre = nombre_;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void SetEdad(int edad_) {
        this.edad = edad_;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getCedula() {
        return cedula;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.comprobarSexo(sexo);
    }

    public double convertirPieAMetros() {
        return this.altura / 3.281;
    }

    // se esta suponiendo que sera introducido en libras...
    public double convertirLibraAKilogramos() {
        return this.peso / 2.205;
    }

    public int calcularPesoIdeal() {
        final int pesoDebajoDelIdeal = 0;
        final int sobrePeso = 1;
        final int pesoIdeal = -1;
        long calculateIdealPound = (long) ((this.convertirLibraAKilogramos()) / (Math.pow(this.convertirPieAMetros(), 2)));
        if (calculateIdealPound < 20) {
            return pesoIdeal;
        }
        if (calculateIdealPound >= 20 && calculateIdealPound <= 25) {
            return pesoDebajoDelIdeal;
        }
        if (calculateIdealPound > 25) {
            return sobrePeso;
        }

        return 0;
    }

    // return all information about the object
    @Override
    public String toString() {
        Object[] params = new Object[]{this.nombre, this.edad, this.sexo,
            this.altura, this.peso, this.cedula};
        String msg
                = MessageFormat.format("Su nombre: {0},"
                        + " edad: {1},"
                        + " sexo: {2}, altura: {3}, "
                        + "peso: {4} "
                        + "cedula: {5}", params);
        return msg;
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }

    private void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    private void generarCedula() {
        String generator = "";
        int max = 999;
        int min = 100;
        int rango = max - min + 1;
        for (int i = 0; i < 4; i++) {
            int temp = (int) ((Math.random() * rango) + 1);
            generator += String.valueOf(temp);
        }
        this.cedula = generator;
    }
}
