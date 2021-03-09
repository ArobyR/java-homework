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
public class Serie {

    public String titulo;
    public int numeroTemporada;
    public boolean entregado;
    public String genero;
    public String creador;

    // no entregado
    Serie() {
        this.entregado = false;
        this.titulo = "No titulo";
        this.numeroTemporada = 3;
        this.genero = "No genero";
        this.creador = "No creador";
    }

    Serie(String titulo_, String creador_) {
        this.entregado = false;
        this.titulo = titulo_;
        this.numeroTemporada = 3;
        this.creador = creador_;
        this.genero = "No genero";
    }

    Serie(String titulo_, String creador_, boolean entregado_,
            String genero_, int numeroTemporada_) {
        this.titulo = titulo_;
        this.creador = creador_;
        this.entregado = entregado_;
        this.genero = genero_;
        this.numeroTemporada = numeroTemporada_;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        Object[] params = new Object[]{this.titulo, this.numeroTemporada,
            this.entregado, this.genero, this.creador};
        String msg
                = MessageFormat.format("El titulo de la serie {0}"
                        + " tiene {1} temporadas, ha sido entregado: {2} "
                        + "su genero es {3} y su creador es {4}", params);
        return msg;
    }
}
