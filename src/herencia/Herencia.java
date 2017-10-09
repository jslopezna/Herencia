/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v= new Vehiculo(10); 
        v.Arrancar();
        v.Detener();
        Automovil a= new Automovil(10,4); 
        a.Acelerar(10);
        a.Arrancar();
        a.Detener();
        /*Vehiculo v2= new Automovil(); 
        v2.Arrancar();
        v2.Detener();
        */
    }
    
}
