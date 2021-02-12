/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercializadoraelectrodomesticos.fuentes.controlador;

import comercializadoraelectrodomesticos.fuentes.modelo.Appliance;
import comercializadoraelectrodomesticos.fuentes.modelo.Fridge;
import comercializadoraelectrodomesticos.fuentes.modelo.TelevisionSet;
import comercializadoraelectrodomesticos.fuentes.modelo.Sale;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Vargas
 */
public class ToSell extends Exception {
    
    ArrayList<Sale> saleRegistration = new ArrayList<Sale>();
    
    public void toSell(Appliance appliance){
        double appliancePrice = 0;
        appliancePrice = appliancePrice + consumptionPrice(appliance.getConsumptionAppliance());
        appliancePrice = appliancePrice + originPrice(appliance.getOriginAppliance());
        Sale venta = new Sale(appliance, appliancePrice);
        saleRegistration.add(venta);        
        System.out.println("Articulo vendido: " + appliance.getTypeAppliance()); 
        System.out.println("Precio: " + appliancePrice); 
    }
    
    public void toSell(TelevisionSet tv){
        double tvPrice = 0;
        
        tvPrice = tvPrice + consumptionPrice(tv.getConsumptionAppliance());
        tvPrice = tvPrice + originPrice(tv.getOriginAppliance());
        
        if(tv.getSize() > 40){
            double porcent = tvPrice * 0.30;
            tvPrice = tvPrice + porcent;
        }
        
        if(tv.getTdtTuner() == 1){
            tvPrice = tvPrice + 250000;
        }
        
        Sale venta = new Sale(tv, tvPrice);
        
        saleRegistration.add(venta);        
        System.out.println("Articulo vendido: " + tv.getTypeAppliance()); 
        System.out.println("Precio: " + tvPrice); 
    }
    
    public void toSell(Fridge fridge){
        double fridgePrice = 0;
        
        fridgePrice = fridgePrice + consumptionPrice(fridge.getConsumptionAppliance());
        fridgePrice = fridgePrice + originPrice(fridge.getOriginAppliance());
        
        if(fridge.getCapacity() > 120){
            int extraCapacity = fridge.getCapacity() - 120;
            extraCapacity = (extraCapacity / 10);
            double porcent = (extraCapacity * 0.05) * fridgePrice ;
            fridgePrice = fridgePrice + porcent;
        }
        
        Sale venta = new Sale(fridge, fridgePrice);
        
        saleRegistration.add(venta);
        System.out.println("Articulo vendido: " + fridge.getTypeAppliance()); 
        System.out.println("Precio: " + fridgePrice); 
    }
    
     private double consumptionPrice(int consumption){
        
        double price = 0;
        
        switch(consumption){
            case 1: 
                price = 450000;
                break;
            case 2: 
                price = 350000;
                break;
            case 3: 
                price = 250000;
                break;
        }    
        
        return price;
    }
    
    private double originPrice(int originAppliance){
        
        double price = 0;
        
        switch(originAppliance){
            case 1: 
                price = 250000;
                break;
            case 2: 
                price = 350000;
                break;
        }    
        
        return price;
    }
    
    public void printSells() {
        try {
             if(saleRegistration.size() <= 0){
                throw new Exception();
             }else{
            for (Sale sell: saleRegistration) {
                System.out.println("Articulo: " + sell.getAppliance().getTypeAppliance());
                System.out.println("Precio: " + sell.getSalePrice());
            }   
        }  
        } catch (Exception e) {
            System.out.println("No hay articulos vendidos");
        }                 
    }
    
    public void printSellsTv() {
        try {
             if(saleRegistration.size() <= 0){
                throw new Exception();
             }else{
            for (Sale sell: saleRegistration) {
                if(sell.getAppliance() instanceof TelevisionSet){
                    System.out.println("Articulo: " + sell.getAppliance().getTypeAppliance());
                    System.out.println("Precio: " + sell.getSalePrice());
                }               
            }   
        }  
        } catch (Exception e) {
            System.out.println("No hay articulos vendidos");
        }                 
    }
}
