/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;
import Inmuebles.Inmobiliaria;
import Personal.Cliente;
import Personal.AgenteVenta;
import Personal.Gerente;

/**
 *
 * @author Tito
 */
public class OperacionCierre {
    
    private String tipo;
    private double precio_Acordado;
    private Inmobiliaria inmbueble;
    private Cliente cliente;
    private AgenteVenta agente;
    private Gerente gerente;

    public OperacionCierre() {
    }

    public OperacionCierre(String tipo, double precio_Acordado, Inmobiliaria inmbueble, Cliente cliente, AgenteVenta agente, Gerente gerente) {
        this.tipo = tipo;
        this.precio_Acordado = precio_Acordado;
        this.inmbueble = inmbueble;
        this.cliente = cliente;
        this.agente = agente;
        this.gerente = gerente;
        
        pagarComisiones();
    }
    public OperacionCierre(String tipo, double precio_Acordado, String rutCliente, String rutAgente, String rutGerente) {
        this.tipo = tipo;
        this.precio_Acordado = precio_Acordado;
        this.cliente = new Personal.Cliente(rutCliente, "Cliente Temporal");
        this.agente = null; 
        this.gerente = null;
        this.inmbueble = null; 
        pagarComisiones();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio_Acordado() {
        return precio_Acordado;
    }

    public void setPrecio_Acordado(double precio_Acordado) {
        this.precio_Acordado = precio_Acordado;
    }

    public Inmobiliaria getInmbueble() {
        return inmbueble;
    }

    public void setInmbueble(Inmobiliaria inmbueble) {
        this.inmbueble = inmbueble;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public AgenteVenta getAgente() {
        return agente;
    }

    public void setAgente(AgenteVenta agente) {
        this.agente = agente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    private void pagarComisiones() {
        double comisionGerente = this.precio_Acordado * 0.01; 
        double comisionAgente = this.precio_Acordado * 0.03;  
    }
    
    public double getComisionPropietario() {
        return this.precio_Acordado * 0.03; 
    }

    @Override
    public String toString() {
        return "OperacionCierre{" + "tipo=" + tipo + ", precio_Acordado=" + precio_Acordado + ", inmbueble=" + inmbueble + ", cliente=" + cliente + ", agente=" + agente + ", gerente=" + gerente + '}';
    }
    
    
    
}
