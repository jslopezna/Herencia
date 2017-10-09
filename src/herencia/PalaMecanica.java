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
public class PalaMecanica extends Vehiculo {
    private int PesoMaximoLevnate; 
    public PalaMecanica(int  caballosDeFuerza){
        super( caballosDeFuerza);
    }
    
    public void MoverPala(String Direccion){
        System.out.println("Mover pala");
    }
    public void Detener(){
        System.out.println(" Palanca");
    }
    
}
