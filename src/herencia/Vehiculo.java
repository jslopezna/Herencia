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
public abstract class Vehiculo {
    protected int CaballosDeFuerza;

    public Vehiculo(int caballosDeFuerza) {
        System.out.println("Constructor Padre");
    }
    
    public void Arrancar(){
        System.out.println("Arrancar");
    }
    public abstract void Detener();
           


    
    
}
