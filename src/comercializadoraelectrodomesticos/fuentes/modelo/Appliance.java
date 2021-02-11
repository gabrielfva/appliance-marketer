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
public class Appliance {
    protected char consumptionAppliance;
    protected int originAppliance;

    public Appliance(char consumptionAppliance, int originAppliance) {
        this.consumptionAppliance = consumptionAppliance;
        this.originAppliance = originAppliance;
    }

    public Appliance() {
    }

    public char getConsumptionAppliance() {
        return consumptionAppliance;
    }

    public void setConsumptionAppliance(char consumptionAppliance) {
        this.consumptionAppliance = consumptionAppliance;
    }

    public int getOriginAppliance() {
        return originAppliance;
    }

    public void setOriginAppliance(int originAppliance) {
        this.originAppliance = originAppliance;
    }
    
    
}
