/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author Tito
 */
public class Cliente extends Personal {

    private String correo;

    public Cliente() {
    }

    public Cliente(String correo) {
        this.correo = correo;
    }

    public Cliente(String correo, String rut, String nombre_Completo) {
        super(rut, nombre_Completo);
        this.correo = correo;
    }
    public Cliente(String rut, String nombre_Completo) {
        // Llamamos al constructor completo de arriba pasando un texto vacío para el correo
        this("", rut, nombre_Completo);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + '}';
    }
    
    
    
    
    
}
