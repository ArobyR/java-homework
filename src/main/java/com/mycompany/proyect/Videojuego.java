package com.mycompany.proyect;

import java.text.MessageFormat;

/**
 *
 * @author arros_000
 */
public class Videojuego {

    public String titulo;
    public int horasEstimadas;
    public boolean entregado;
    public String genero;
    public String company;

    Videojuego() {
        this.horasEstimadas = 10;
        this.entregado = false;
        this.titulo = "No titulo";
        this.genero = "No genero";
        this.company = "No company";
    }

    Videojuego(String titulo_, int horasEstimadas_) {
        this.titulo = titulo_;
        this.horasEstimadas = horasEstimadas_;
        this.entregado = false;
        this.genero = "No genero";
        this.company = "No company";
    }

    Videojuego(String titulo_, int horasEstimadas_,
            String genero_, String company_) {
        this.titulo = titulo_;
        this.horasEstimadas = horasEstimadas_;
        this.entregado = false;
        this.genero = genero_;
        this.company = company_;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        Object[] params = new Object[]{this.titulo, this.horasEstimadas,
            this.entregado, this.genero, this.company};
        String msg
                = MessageFormat.format("El Titulo: {0}"
                        + " tiene {1} horas estimadas de juego "
                        + "esta entregado {2}, genero {3}, "
                        + "de la company {4} ", params);
        return msg;
    }
}
