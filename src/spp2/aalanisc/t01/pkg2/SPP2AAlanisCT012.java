/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.t01.pkg2;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCT012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
       double x1 , y1 , x2 , y2  , d;
       
        //( x1 , y1 , x2 , y2 ) = coordenadas , d = distancia
        
        Scanner T = new Scanner (System.in) ;
        
        System.out.println("Introduce el punto x1");
        x1 = T.nextDouble();
        System.out.println("Introduce el punto x2");
        x2 = T.nextDouble();
        System.out.println("Introduce el punto y1");
        y1 = T.nextDouble() ;
        System.out.println("Introudce el punto y2");
        y2 = T.nextDouble();
                
       // Realizar operacion
        d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2) ) ;
        
        System.out.println("La distancia entre el punto 1 y 2 es " + d);
        
               
    }
    
}
