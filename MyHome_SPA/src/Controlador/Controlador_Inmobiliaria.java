/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Inmuebles.Inmobiliaria;
import Personal.*;
import Operaciones.*;
import java.util.ArrayList;
/**
 *
 * @author Tito
 */
public class Controlador_Inmobiliaria {
    private ArrayList<Inmobiliaria> listaInmuebles;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<AgenteVenta> listaAgentes;
    private ArrayList<Gerente> listaGerentes;
    private ArrayList<Contrato> listaContratos;
    private ArrayList<Visitas> listaVisitas;
    private ArrayList<OperacionCierre> listaCierres;

    public Controlador_Inmobiliaria() {
    }

    public Controlador_Inmobiliaria(ArrayList<Inmobiliaria> listaInmuebles, ArrayList<Cliente> listaClientes, ArrayList<AgenteVenta> listaAgentes, ArrayList<Gerente> listaGerentes, ArrayList<Contrato> listaContratos, ArrayList<Visitas> listaVisitas, ArrayList<OperacionCierre> listaCierres) {
        this.listaInmuebles = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaAgentes = new ArrayList<>();
        this.listaGerentes = new ArrayList<>();
        this.listaContratos = new ArrayList<>();
        this.listaVisitas = new ArrayList<>();
        this.listaCierres = new ArrayList<>();
    }
    //Agregar
    public void agregarInmueble(Inmobiliaria nuevoInmueble) {
        this.listaInmuebles.add(nuevoInmueble);
    }

    public void agregarCliente(Cliente nuevoCliente) {
        this.listaClientes.add(nuevoCliente);
    }

    public void agregarAgente(AgenteVenta nuevoAgente) {
        this.listaAgentes.add(nuevoAgente);
    }

    public void agregarGerente(Gerente nuevoGerente) {
        this.listaGerentes.add(nuevoGerente);
    }

    public void registrarVisita(Visitas nuevaVisita) {
        this.listaVisitas.add(nuevaVisita);
    }

    public void registrarCierre(OperacionCierre nuevoCierre) {
        this.listaCierres.add(nuevoCierre);
    }
    
    //Listar
    public ArrayList<AgenteVenta> getListaAgentes() {
        return this.listaAgentes;
    }
    
    public ArrayList<Gerente> getListaGerentes() {
        return this.listaGerentes;
    }

    public ArrayList<Contrato> getListaContratos() {
        return this.listaContratos;
    }

    public ArrayList<Visitas> getListaVisitas() {
        return this.listaVisitas;
    }
    
    public ArrayList<OperacionCierre> getListaCierres() {
        return this.listaCierres;
    }
    


    //Buscar
    public AgenteVenta buscarAgentePorRut(String rutBuscado) {
        for (AgenteVenta a : listaAgentes) {
            if (a.getRut().equals(rutBuscado)) {
                return a;
            }
        }
        return null; 
    }
    public Gerente buscarGerentePorRut(String rutBuscado) {
        for (Gerente g : listaGerentes) {
            if (g.getRut().equals(rutBuscado)) {
                return g;
            }
        }
        return null;
    }
    public ArrayList<Visitas> obtenerVisitasPorInmueble(String refInmueble) {
        ArrayList<Visitas> visitasInmueble = new ArrayList<>();
        for (Visitas v : listaVisitas) {
            if (v.getInmbueble().getNumeroReferencia().equals(refInmueble)) {
             visitasInmueble.add(v);
            }       
        }
        return visitasInmueble;
    }

    //Calculos
    public double calcularTotalIngresosExclusividad() {
        double total = 0;
        for (Contrato c : listaContratos) {
            total += c.calcularMontoExclusividad(); 
        }
        return total;
    }
    public double calcularTotalComisionesGlobal() {
        double total = 0;
    
        
        for (Gerente g : listaGerentes) {
            total += g.getComisionesAcumuladas();
        }
        
        for (AgenteVenta a : listaAgentes) {
            total += a.getComisionesAcumuladas();
        }
        
        for (OperacionCierre cierre : listaCierres) {
            total += cierre.getComisionPropietario();
        }
    
        return total;
    }
    
}
