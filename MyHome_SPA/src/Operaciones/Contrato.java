/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;
import Inmuebles.Inmobiliaria;
import Personal.Propietario;
import java.time.LocalDate;

/**
 *
 * @author Tito
 */
public class Contrato {
    
    private LocalDate fechaContrato;
    private int plazo_Contrato_meses;
    private Propietario propietario;
    private Inmobiliaria inmobiliaria;

    public Contrato() {
    }

    public Contrato(LocalDate fechaContrato, int plazo_Contrato_meses, Propietario propietario, Inmobiliaria inmobiliaria) {
        this.fechaContrato = fechaContrato;
        this.plazo_Contrato_meses = plazo_Contrato_meses;
        this.propietario = propietario;
        this.inmobiliaria = inmobiliaria;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getPlazo_Contrato_meses() {
        return plazo_Contrato_meses;
    }

    public void setPlazo_Contrato_meses(int plazo_Contrato_meses) {
        this.plazo_Contrato_meses = plazo_Contrato_meses;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Inmobiliaria getInmobiliaria() {
        return inmobiliaria;
    }

    public void setInmobiliaria(Inmobiliaria inmobiliaria) {
        this.inmobiliaria = inmobiliaria;
    }
    
    public double calcularMontoExclusividad() {
        return this.inmobiliaria.getValorTasacion() * 0.005; 
    }

    @Override
    public String toString() {
        return "Contrato{" + "fechaContrato=" + fechaContrato + ", plazo_Contrato_meses=" + plazo_Contrato_meses + ", propietario=" + propietario + ", inmobiliaria=" + inmobiliaria + '}';
    }
    
    
    
}
