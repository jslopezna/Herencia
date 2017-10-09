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
public class Automovil extends Vehiculo {
    private  int CantidadDePuertas; 
    public Automovil(int caballosDeFuerza, int cp){
        super(caballosDeFuerza);
        this.CantidadDePuertas= cp; 
        System.out.println("Construcor HIjo");
    }
    public void Acelerar (int cuanto){ 
        System.out.println("Acelerar");
        //this.( );
    }
    
    @Override
   public void Arrancar(){
        System.out.println("Arrancar en hijo");  
    }

    @Override
    public  void Detener(){
        System.out.println("Detener hijo");
    };
    
}
