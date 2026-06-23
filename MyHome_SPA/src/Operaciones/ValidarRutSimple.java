/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;
/**
 *
 * @author joaqu
 */
public class ValidarRutSimple {
    
    public static boolean validarRutSimple (String rut){
        
        String campo;
        
        //validar estructura del rut
        if ((rut.matches("^\\d{1,2}(\\.\\d{3}){2}-[0-9Kk]$") == true) ||
                (rut.matches("^\\d{7,8}-[0-9Kk]$") == true)){
            return true;
        } else {
            return false;
        }
    }
}
