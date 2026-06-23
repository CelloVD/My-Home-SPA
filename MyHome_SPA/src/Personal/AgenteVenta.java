/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author Tito
 */
public class AgenteVenta extends Personal {
    
    private String idAgente;
    private double comisionesAcumuladas;

    public AgenteVenta() {
    }

    public AgenteVenta(String idAgente, double comisionesAcumuladas) {
        this.idAgente = idAgente;
        this.comisionesAcumuladas = 0.0f;
    }

    public AgenteVenta(String idAgente, double comisionesAcumuladas, String rut, String nombre_Completo) {
        super(rut, nombre_Completo);
        this.idAgente = idAgente;
        this.comisionesAcumuladas = 0.0f;
    }

    public String getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(String idAgente) {
        this.idAgente = idAgente;
    }

    public double getComisionesAcumuladas() {
        return comisionesAcumuladas;
    }

    public void setComisionesAcumuladas(double comisionesAcumuladas) {
        this.comisionesAcumuladas = comisionesAcumuladas;
    }
    

    public void acumularComision(double monto) {
        this.comisionesAcumuladas += monto;
    }

    @Override
    public String toString() {
        return "AgenteVenta{" + "idAgente=" + idAgente + ", comisionesAcumuladas=" + comisionesAcumuladas + '}';
    }
    
    
}
