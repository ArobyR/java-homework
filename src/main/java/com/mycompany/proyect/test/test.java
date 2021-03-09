/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect.test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author arros_000
 */
enum Colores {
    ROJO, VERDE, AZUL;
}

enum Transportes {
    BARCO, BICICLETA, VEHICULO, AVION, SUBMARINO;

    public void transporteInfo() {
        System.out.println("Esto es un transporte");
    }
}

public class test {

    public void theMain() {
        System.out.println("Hola mundo");
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i);

        }
        System.out.println("First loop in JAVA");

        Colores c1 = Colores.ROJO;
        System.out.println("Color: " + c1);
        System.out.println("    ");
        Scanner entrada = new Scanner(System.in);
        int number;
        number = entrada.nextInt();
        System.out.println("Numero incresado: " + number);

        Calendar fecha = new GregorianCalendar(2000, 01, 02);
        Calendar currentlyDate = Calendar.getInstance();
        System.out.println("Current Date: " + currentlyDate);

        int[] arayNumber = {1, 2, 3, 4};
    }
}
