/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercializadoraelectrodomesticos.fuentes.modelo;

/**
 *
 * @author Gabriel Vargas
 */
public class Sale {
    
    Appliance appliance;
    double salePrice;

    public Sale(Appliance appliance, double salePrice) {
        this.appliance = appliance;
        this.salePrice = salePrice;
    }

    public Sale() {
    }

    public Appliance getAppliance() {
        return appliance;
    }

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    
}
