/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author Tito
 */
public abstract class Personal {
    
    private String rut, nombre_Completo;

    public Personal() {
    }

    public Personal(String rut, String nombre_Completo) {
        this.rut = rut;
        this.nombre_Completo = nombre_Completo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre_Completo() {
        return nombre_Completo;
    }

    public void setNombre_Completo(String nombre_Completo) {
        this.nombre_Completo = nombre_Completo;
    }

    @Override
    public String toString() {
        return "Personal{" + "rut=" + rut + ", nombre_Completo=" + nombre_Completo + '}';
    }
    
    
}
