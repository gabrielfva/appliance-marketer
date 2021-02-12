/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercializadoraelectrodomesticos;

import comercializadoraelectrodomesticos.fuentes.controlador.ToSell;
import comercializadoraelectrodomesticos.fuentes.modelo.Appliance;
import comercializadoraelectrodomesticos.fuentes.modelo.Fridge;
import comercializadoraelectrodomesticos.fuentes.modelo.TelevisionSet;
import java.util.Scanner;

/**
 *
 * @author Gabriel Vargas
 */
public class ComercializadoraElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    Scanner capture = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        int consumptionValidate;
        int originValidate;
        int optionMenu;
        
        Scanner capture = new Scanner(System.in);
        
        ToSell tosell = new ToSell();
        
        do{
            System.out.println("\n");
            System.out.println("--- MENÚ ---");
            System.out.println("1. Vender electrodoméstico.");
            System.out.println("2. Mostrar total ventas.");
            System.out.println("3. Mostrar total ventas de televisores.");
            System.out.println("4. Salir.");
            System.out.println("\nDigite una opción: ");
            optionMenu = capture.nextInt();
            
            switch(optionMenu){
                case 1:
                    do{
                        System.out.println("-----Vender Electrodomésticos-----\n");
                        System.out.println("1. Electrodoméstico");
                        System.out.println("2. Televisor");
                        System.out.println("3. Nevera");
                        System.out.println("4. Salir");
                        System.out.println("Digite una opción: ");
                        option = capture.nextInt();
                        
                        switch(option){
                            case 1: 
                                System.out.println("-----Vender Electrodoméstico-----\n");
                                Appliance appliance = new Appliance();
                                appliance.setTypeAppliance("Electrodoméstico");
                                consumptionValidate = consumptionValidate();  
                                appliance.setConsumptionAppliance(consumptionValidate);
                                originValidate = originValidate();
                                appliance.setOriginAppliance(originValidate);
                                tosell.toSell(appliance);                                                               
                                break; 
                                
                            case 2: 
                                System.out.println("-----Vender Televisor-----\n");
                                TelevisionSet tv = new TelevisionSet();
                                tv.setTypeAppliance("Televisor");
                                consumptionValidate = consumptionValidate();  
                                tv.setConsumptionAppliance(consumptionValidate);
                                originValidate = originValidate();
                                tv.setOriginAppliance(originValidate);
                                 
                                System.out.println("1. Tamaño en pulgadas: ");                                
                                int sizeTv = capture.nextInt();  
                                tv.setSize(sizeTv);                                                                                                       
                                int tdt = tdtValidate();                                                                                                                                                                                                                            
                                tv.setTdtTuner(tdt);                                
                                tosell.toSell(tv);                                
                                break;  
                                
                            case 3: 
                                System.out.println("-----Vender Nevera-----\n");
                                Fridge fridge = new Fridge();                          
                                fridge.setTypeAppliance("Nevera");
                                consumptionValidate = consumptionValidate();  
                                fridge.setConsumptionAppliance(consumptionValidate);
                                originValidate = originValidate();
                                fridge.setOriginAppliance(originValidate);
                                System.out.println("1. Capacidad: ");
                                int capacity = capture.nextInt();                                 
                                fridge.setCapacity(capacity);    
                                tosell.toSell(fridge);
                                break; 
                        }                                       
                    }while(option != 4);
                    break;
                case 2:
                    tosell.printSells();
                    break;
                case 3:
                    tosell.printSellsTv();
                    break;
            }         
        }while(optionMenu!=4);
    }    
    
    private static int consumptionValidate(){
        Scanner capture = new Scanner(System.in);
        int consumption = 0;
        boolean next = false;
        do{
            System.out.println("2.----Consumo----\n");
            System.out.println("1. Tipo A");
            System.out.println("2. Tipo B");
            System.out.println("3. Tipo C");
            System.out.println("Digite una opción: ");
            consumption = capture.nextInt();
            if(consumption == 1 || consumption == 2 || consumption == 3 ){
                next = true;                                        
            }
            else{                                        
                System.out.println("Digite un valor valido");
                next = false;
            }
        }while(next == false );
        return consumption;
    }
    
    private static int originValidate(){
        Scanner capture = new Scanner(System.in);
        int origin = 0;
        boolean next = false;
        do{
            System.out.println("4.---- Procedencia-----\n");
            System.out.println("1. Nacional");
            System.out.println("2. Importado");
            System.out.println("Digite una opción: ");
            origin = capture.nextInt();
            if(origin == 1 || origin == 2 ){
                next = true;                                        
            }
            else{                                        
                System.out.println("Digite un valor valido");
                next = false;
            }
        }while(next == false);
        return origin;
    }
    
    private static int tdtValidate(){
        Scanner capture = new Scanner(System.in);
        int tdt = 0;
        boolean next = false;
        do{
            System.out.println("3.---- ¿Tiene TDT? -----\n");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.println("Digite una opción: ");
            tdt = capture.nextInt();
            if(tdt == 1 || tdt == 2 ){
                next = true;                                        
            }
            else{                                        
                System.out.println("Digite un valor valido");
                next = false;
            }
        }while(next == false);
        return tdt;
    }        
}
