/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;
import Inmuebles.Inmobiliaria;
import Personal.Cliente;
import Personal.AgenteVenta;
import Personal.Gerente;
import java.time.LocalDate;

/**
 *
 * @author Tito
 */
public class Visitas {
    
    private LocalDate fecha;
    private String Comentario;
    private Inmobiliaria inmbueble;
    private Cliente cliente;
    private AgenteVenta agente;
    private Gerente gerente;

    public Visitas() {
    }

    public Visitas(LocalDate fecha, String Comentario, Inmobiliaria inmbueble, Cliente cliente, AgenteVenta agente, Gerente gerente) {
        this.fecha = fecha;
        this.Comentario = Comentario;
        this.inmbueble = inmbueble;
        this.cliente = cliente;
        this.agente = agente;
        this.gerente = gerente;
    }
    public Visitas(String fechaStr, String comentario, String rutCliente, String refInmueble, String rutAgente) {
        this.fecha = java.time.LocalDate.parse(fechaStr); 
        this.Comentario = comentario;
        
        
        this.cliente = new Personal.Cliente(rutCliente, "Cliente Temporal");
        this.agente = null;
        this.inmbueble = null; 
        this.gerente = null;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
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

    @Override
    public String toString() {
        return "Visitas{" + "fecha=" + fecha + ", Comentario=" + Comentario + ", inmbueble=" + inmbueble + ", cliente=" + cliente + ", agente=" + agente + ", gerente=" + gerente + '}';
    }
    
    
}
