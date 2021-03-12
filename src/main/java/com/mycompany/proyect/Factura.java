package com.mycompany.proyect;

import java.text.MessageFormat;
import java.util.Calendar;

/**
 *
 * @author arros_000
 */
public class Factura {

    private long numeroFactura;
    private Calendar fechaFactura;
    private double totalAPagar;
    private double monto;
    private double montoConITBIS;
    private double montoConDescuento;
    private double descuento;
    private final double ITBIS;
    // libros

    Factura() {
        this.ITBIS = 3.18;
        this.numeroFactura = (long) (Math.random() * 2172);
        this.fechaFactura = Calendar.getInstance();
        this.totalAPagar = 0;
        this.monto = 0;
        this.montoConITBIS = 0;
        this.montoConDescuento = 0;
        this.descuento = 0;
    }

    Factura(double descuento_) {
        this.ITBIS = 3.18;
        this.descuento = descuento_;
        this.totalAPagar = (this.monto + this.ITBIS) - this.descuento;
        this.monto = 0;
        this.montoConITBIS = 0;
        this.montoConDescuento = 0;
        this.fechaFactura = Calendar.getInstance();
        this.numeroFactura = (long) (Math.random() * 2172);
        this.totalAPagar = 0;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public Calendar getFechaFactura() {
        return fechaFactura;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public double getMonto() {
        return monto;
    }

    public double getMontoConITBIS() {
        return montoConITBIS;
    }

    public double getMontoConDescuento() {
        return montoConDescuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public double calculaMontoConITBIS() {
        this.montoConITBIS = this.monto + this.ITBIS;
        return this.montoConITBIS;
    }

    public double calculaDescuento() {
        this.descuento = this.totalAPagar * 0.10;
        return this.descuento;
    }

    @Override
    public String toString() {
        Object[] params = new Object[]{this.numeroFactura, this.descuento,
            this.fechaFactura, this.monto, this.descuento, this.totalAPagar};
        String msg
                = MessageFormat.format("Numero de la factura: {0},"
                        + " descuento: {1},"
                        + " fecha: {2}, monto: {3}, "
                        + "descuento: {4} "
                        + "total a pagar: {5}", params);
        return msg;
    }
}
