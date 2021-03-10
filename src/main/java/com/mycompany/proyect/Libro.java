package com.mycompany.proyect;

import java.text.MessageFormat;

/**
 *
 * @author arros_000
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int precio;
    
    Libro() {
        this.ISBN = "";
        this.titulo = "";
        this.autor = "";
        this.numeroPaginas = 0;
        this.precio = 0;
    }

    Libro(String Isbn_, String titulo_, String autor_, int numeroPaginas_,
            int precio_) {
        this.ISBN = Isbn_;
        this.titulo = titulo_;
        this.autor = autor_;
        this.numeroPaginas = numeroPaginas_;
        this.precio = precio_;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int Precio) {
        this.precio = Precio;
    }

    @Override
    public String toString() {
        Object[] params = new Object[]{this.titulo, this.ISBN,
            this.numeroPaginas};
        String msg
                = MessageFormat.format("El libro {0} con ISBN {1}"
                        + " tiene {2} paginas ", params);
        return msg;
    }
}
