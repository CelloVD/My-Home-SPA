/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Tito
 */
public abstract class Inmobiliaria {
    
    private String numeroReferencia, direccion;
    private double superficieM2;
    private double valorTasacion;
    private double precio;

    public Inmobiliaria() {
    }

    public Inmobiliaria(String numeroReferencia, String direccion, double superficieM2, double valorTasacion, double precio) {
        this.numeroReferencia = numeroReferencia;
        this.direccion = direccion;
        this.superficieM2 = superficieM2;
        this.valorTasacion = valorTasacion;
        this.precio = precio;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSuperficieM2() {
        return superficieM2;
    }

    public void setSuperficieM2(double superficieM2) {
        this.superficieM2 = superficieM2;
    }

    public double getValorTasacion() {
        return valorTasacion;
    }

    public void setValorTasacion(double valorTasacion) {
        this.valorTasacion = valorTasacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inmobiliaria{" + "numeroReferencia=" + numeroReferencia + ", direccion=" + direccion + ", superficieM2=" + superficieM2 + ", valorTasacion=" + valorTasacion + ", precio=" + precio + '}';
    }
    
    
    
    
}
