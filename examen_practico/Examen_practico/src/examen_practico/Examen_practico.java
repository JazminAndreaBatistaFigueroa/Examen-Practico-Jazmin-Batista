/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_practico;

import java.util.Scanner;

/**
 *
 * @author jazzb
 */
public class Examen_practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int juega = 3; //numero que tiene que adivinar (entre 1 y 10)
        int valor = 2; //valor para almacenar lo que capture el usuario
        Scanner captu = new Scanner(System.in);
        do {
            System.out.println("Piedra (1), Papel (2) o Tijera (3)");
            valor = captu.nextInt();
        
        if(valor >= 3)
            System.out.println("Papel");
        else
        System.out.println("Perdiste, intentalo de nuevo");
        

        
        
        
          }while(juega != valor);  
        
        System.out.println("GANASTE");
        
}
    }


       
        
    
    
    
        
        
         
         
             
         
        
       
     
            
            
        
                
        
        
   
   

