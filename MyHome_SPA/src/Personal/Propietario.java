/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Tito
 */
public class Propietario extends Personal {
    
    private LocalDate fecha_Contrato;
    private int plazo_Contrato_Meses;
    private ArrayList<String> telefonos;

    public Propietario() {
    }

    public Propietario(LocalDate fecha_Contrato, int plazo_Contrato_Meses, ArrayList<String> telefonos) {
        this.fecha_Contrato = fecha_Contrato;
        this.plazo_Contrato_Meses = plazo_Contrato_Meses;
        this.telefonos = telefonos;
    }

    public Propietario(LocalDate fecha_Contrato, int plazo_Contrato_Meses, ArrayList<String> telefonos, String rut, String nombre_Completo) {
        super(rut, nombre_Completo);
        this.fecha_Contrato = fecha_Contrato;
        this.plazo_Contrato_Meses = plazo_Contrato_Meses;
        this.telefonos = telefonos;
    }

    public LocalDate getFecha_Contrato() {
        return fecha_Contrato;
    }

    public void setFecha_Contrato(LocalDate fecha_Contrato) {
        this.fecha_Contrato = fecha_Contrato;
    }

    public int getPlazo_Contrato_Meses() {
        return plazo_Contrato_Meses;
    }

    public void setPlazo_Contrato_Meses(int plazo_Contrato_Meses) {
        this.plazo_Contrato_Meses = plazo_Contrato_Meses;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
    
    public void agregarTelefonos(String telefono){
        if (telefonos.size() < 3) {
            telefonos.add(telefono);
        }
        
    }

    @Override
    public String toString() {
        return "Propietario{" + "fecha_Contrato=" + fecha_Contrato + ", plazo_Contrato_Meses=" + plazo_Contrato_Meses + ", telefonos=" + telefonos + '}';
    }
    
}
