/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercializadoraelectrodomesticos;

import comercializadoraelectrodomesticos.fuentes.modelo.Appliance;
import comercializadoraelectrodomesticos.fuentes.modelo.Fridge;
import comercializadoraelectrodomesticos.fuentes.modelo.TelevisionSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Vargas
 */
public class ComercializadoraElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        int origin;
        int consumption;
        
        Scanner capture = new Scanner(System.in);
        
        do{
            System.out.println("\n");
            System.out.println("--- MENÚ ---");
            System.out.println("1. Vender electrodoméstico.");
            System.out.println("2. Salir.");
            System.out.println("\nDigite una opción: ");
            option = capture.nextInt();
            
            switch(option){
                case 1:
                    do{
                        System.out.println("-----Vender Electrodomésticos-----\n");
                        System.out.println("1. Electrodoméstico\n");
                        System.out.println("2. Televisor\n");
                        System.out.println("3. Nevera\n");
                        System.out.println("4. Salir\n");
                        System.out.println("\nDigite una opción: ");
                        option = capture.nextInt();
                        
                        switch(option){
                            case 1: 
                                System.out.println("-----Vender Electrodoméstico-----\n");
                                Appliance appliance = new Appliance();
                                // llamar al metodo de vender basico (appliance)
                                break; 
                                
                            case 2: 
                                System.out.println("-----Vender Televisor-----\n");
                                System.out.println("1. Tamaño en pulgadas: ");
                                int sizeTv = capture.nextInt();
                                
                                do{
                                    System.out.println("\n2. Consumo ");
                                    System.out.println("\n1. A");
                                    System.out.println("\n2. B");
                                    System.out.println("\n3. C");
                                    System.out.println("\nDigite una opción: ");
                                    consumption = capture.nextInt();
                                }while(consumption != 1 || consumption != 2 || consumption != 3 );
                                
                                System.out.println("\n3. ¿Tiene TDT? 1. Si  2. No\n");
                                int tdt = capture.nextInt();
                                
                                do{
                                    System.out.println("\n4. Procedencia");
                                    System.out.println("\n1. Nacional");
                                    System.out.println("\n2. Importado");
                                    System.out.println("\nDigite una opción: ");
                                    origin = capture.nextInt();
                                }while(origin != 1 || origin != 2);
                                TelevisionSet tv = new TelevisionSet();
                                // llamar al metodo de vender tv
                                break; 
                                
                            case 3: 
                                System.out.println("-----Vender Nevera-----\n");
                                do{
                                    System.out.println("\n2. Consumo ");
                                    System.out.println("\n1. A");
                                    System.out.println("\n2. B");
                                    System.out.println("\n3. C");
                                    System.out.println("\nDigite una opción: ");
                                    consumption = capture.nextInt();
                                }while(consumption != 1 || consumption != 2 || consumption != 3 );
                                
                                int capacity = capture.nextInt();
                                
                                do{
                                    System.out.println("\n4. Procedencia");
                                    System.out.println("\n1. Nacional");
                                    System.out.println("\n2. Importado");
                                    System.out.println("\nDigite una opción: ");
                                    origin = capture.nextInt();
                                }while(origin != 1 || origin != 2);
                                
                                Fridge fridge = new Fridge();
                                // llamar al metodo de vender nevera
                                break; 
                        }
                           
                    }while(option != 4);
                break;
                
            }         
        }while(option!=2);
    }
    
}
