/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Tito
 */
public class Vivienda extends Inmobiliaria {
    
    private int habitaciones, banos, cocinas;
    private boolean tiene_Red_Gas, tiene_Puertas_Blindadas;
    private String tipoPiso;

    public Vivienda() {
    }

    public Vivienda(int habitaciones, int banos, int cocinas, boolean tiene_Red_Gas, boolean tiene_Puertas_Blindadas, String tipoPiso) {
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
        this.tiene_Red_Gas = tiene_Red_Gas;
        this.tiene_Puertas_Blindadas = tiene_Puertas_Blindadas;
        this.tipoPiso = tipoPiso;
    }

    public Vivienda(int habitaciones, int banos, int cocinas, boolean tiene_Red_Gas, boolean tiene_Puertas_Blindadas, String tipoPiso, String numeroReferencia, String direccion, double superficieM2, double valorTasacion, double precio) {
        super(numeroReferencia, direccion, superficieM2, valorTasacion, precio);
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
        this.tiene_Red_Gas = tiene_Red_Gas;
        this.tiene_Puertas_Blindadas = tiene_Puertas_Blindadas;
        this.tipoPiso = tipoPiso;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCocinas() {
        return cocinas;
    }

    public void setCocinas(int cocinas) {
        this.cocinas = cocinas;
    }

    public boolean isTiene_Red_Gas() {
        return tiene_Red_Gas;
    }

    public void setTiene_Red_Gas(boolean tiene_Red_Gas) {
        this.tiene_Red_Gas = tiene_Red_Gas;
    }

    public boolean isTiene_Puertas_Blindadas() {
        return tiene_Puertas_Blindadas;
    }

    public void setTiene_Puertas_Blindadas(boolean tiene_Puertas_Blindadas) {
        this.tiene_Puertas_Blindadas = tiene_Puertas_Blindadas;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "habitaciones=" + habitaciones + ", banos=" + banos + ", cocinas=" + cocinas + ", tiene_Red_Gas=" + tiene_Red_Gas + ", tiene_Puertas_Blindadas=" + tiene_Puertas_Blindadas + ", tipoPiso=" + tipoPiso + '}';
    }

    

    
    
    
    
    
    
}
