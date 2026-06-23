/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Tito
 */
public class Local_Comercial extends Inmobiliaria {
    
    
    private int num_Puertas_acceso;
    private boolean tieneVentanas, es_Acondicionado;

    public Local_Comercial() {
    }

    public Local_Comercial(int num_Puertas_acceso, boolean tieneVentanas, boolean es_Acondicionado) {
        this.num_Puertas_acceso = num_Puertas_acceso;
        this.tieneVentanas = tieneVentanas;
        this.es_Acondicionado = es_Acondicionado;
    }

    public Local_Comercial(int num_Puertas_acceso, boolean tieneVentanas, boolean es_Acondicionado, String numeroReferencia, String direccion, double superficieM2, double valorTasacion, double precio) {
        super(numeroReferencia, direccion, superficieM2, valorTasacion, precio);
        this.num_Puertas_acceso = num_Puertas_acceso;
        this.tieneVentanas = tieneVentanas;
        this.es_Acondicionado = es_Acondicionado;
    }

    public int getNum_Puertas_acceso() {
        return num_Puertas_acceso;
    }

    public void setNum_Puertas_acceso(int num_Puertas_acceso) {
        this.num_Puertas_acceso = num_Puertas_acceso;
    }

    public boolean isTieneVentanas() {
        return tieneVentanas;
    }

    public void setTieneVentanas(boolean tieneVentanas) {
        this.tieneVentanas = tieneVentanas;
    }

    public boolean isEs_Acondicionado() {
        return es_Acondicionado;
    }

    public void setEs_Acondicionado(boolean es_Acondicionado) {
        this.es_Acondicionado = es_Acondicionado;
    }

    @Override
    public String toString() {
        return "Local_Comercial{" + "num_Puertas_acceso=" + num_Puertas_acceso + ", tieneVentanas=" + tieneVentanas + ", es_Acondicionado=" + es_Acondicionado + '}';
    }
    
    
}
