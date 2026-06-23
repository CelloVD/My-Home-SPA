/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author Tito
 */
public class Gerente extends Personal {
    
    private String idOfocina;
    private double comisionesAcumuladas;

    public Gerente() {
    }

    public Gerente(String idOfocina, double comisionesAcumuladas) {
        this.idOfocina = idOfocina;
        this.comisionesAcumuladas = 0.0f;
    }

    public Gerente(String idOfocina, double comisionesAcumuladas, String rut, String nombre_Completo) {
        super(rut, nombre_Completo);
        this.idOfocina = idOfocina;
        this.comisionesAcumuladas = 0.0f;
    }

    public String getIdOfocina() {
        return idOfocina;
    }

    public void setIdOfocina(String idOfocina) {
        this.idOfocina = idOfocina;
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
        return "Gerente{" + "idOfocina=" + idOfocina + ", comisionesAcumuladas=" + comisionesAcumuladas + '}';
    }
    
    
    
    
    
}
