/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Tito
 */
public class Bodega extends Inmobiliaria {
    
    private int num_Puertas_Acceso;
    private boolean tiene_Ventanas, es_acondicionado;

    public Bodega() {
    }
    
    

    public Bodega(int num_Puertas_Acceso, boolean tiene_Ventanas, boolean es_acondicionado) {
        this.num_Puertas_Acceso = num_Puertas_Acceso;
        this.tiene_Ventanas = tiene_Ventanas;
        this.es_acondicionado = es_acondicionado;
    }

    public Bodega(int num_Puertas_Acceso, boolean tiene_Ventanas, boolean es_acondicionado, String numeroReferencia, String direccion, double superficieM2, double valorTasacion, double precio) {
        super(numeroReferencia, direccion, superficieM2, valorTasacion, precio);
        this.num_Puertas_Acceso = num_Puertas_Acceso;
        this.tiene_Ventanas = tiene_Ventanas;
        this.es_acondicionado = es_acondicionado;
    }

    public int getNum_Puertas_Acceso() {
        return num_Puertas_Acceso;
    }

    public void setNum_Puertas_Acceso(int num_Puertas_Acceso) {
        this.num_Puertas_Acceso = num_Puertas_Acceso;
    }

    public boolean isTiene_Ventanas() {
        return tiene_Ventanas;
    }

    public void setTiene_Ventanas(boolean tiene_Ventanas) {
        this.tiene_Ventanas = tiene_Ventanas;
    }

    public boolean isEs_acondicionado() {
        return es_acondicionado;
    }

    public void setEs_acondicionado(boolean es_acondicionado) {
        this.es_acondicionado = es_acondicionado;
    }

    @Override
    public String toString() {
        return "Bodega{" + "num_Puertas_Acceso=" + num_Puertas_Acceso + ", tiene_Ventanas=" + tiene_Ventanas + ", es_acondicionado=" + es_acondicionado + '}';
    }
    
    
    
}
