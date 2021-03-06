package com.mycompany.proyect;

import java.util.Scanner;

/**
 *
 * @author arros_000
 */
public class mainClass {

    /**
     * @param libro1
     * @param libro2
     * @param args the command line arguments
     */
    static void printTheMostExpensiveBook(Libro libro1, Libro libro2) {
        if (libro1.getPrecio() > libro2.getPrecio()) {
            System.out.println("El libro uno es mas caro");
        } else {
            System.out.println("El libro dos es mas caro");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic 

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad, peso, altura;
        char sexo;

        System.out.println(
                "Introduce el nombre: ");
        nombre = sc.nextLine();

        System.out.println(
                "Introduce la edad: ");
        edad = sc.nextInt();

        System.out.println(
                "Introduce el peso: ");
        peso = sc.nextInt();

        System.out.println(
                "Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println(
                "Introduce el sexo, (M para masculino, F para femenino): ");
        sexo = sc.next().charAt(0);

        // nombre, edad, sexo    
        // nombre, edad, peso, altura, sexo
        Persona persona1 = new Persona(nombre, edad, peso, altura, sexo);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre(nombre);

        persona3.SetEdad(edad);

        persona3.setAltura(altura);

        persona3.setPeso(peso);

        persona3.setSexo(sexo);

        persona1.printEstadoDePeso();
        persona2.printEstadoDePeso();
        persona3.printEstadoDePeso();

        persona1.printValidacionEdad();
        persona2.printValidacionEdad();
        persona3.printValidacionEdad();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        cuenta cuenta1 = new cuenta("The Flyer");
        cuenta cuenta2 = new cuenta("The Gigant", 20);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        Electrodomestico nevera = new Electrodomestico(20.1, 10, clasificacion.C,
                colores.AZUL);
        System.out.println(nevera.getColor());
        System.out.println(nevera.getConsumoEnergetico());

        Videojuego game1 = new Videojuego();
        Videojuego game2 = new Videojuego("buggifunck", 40);
        Videojuego game3 = new Videojuego("The game", 300, "Shooter", "Ubisoft");

        System.out.println(game1.toString());
        System.out.println(game2.toString());
        System.out.println(game3.toString());

        Libro libro1 = new Libro("978-978-978-2-1", "The Titanic", "JJP",
                400, 20);
        Libro libro2 = new Libro("978-978-978-2-1", "Gigant", "Patrick Morgan",
                230, 30);

        printTheMostExpensiveBook(libro1, libro2);

    }

}
