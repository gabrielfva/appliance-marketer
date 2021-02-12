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
    protected String typeAppliance;
    protected int consumptionAppliance;
    protected int originAppliance;

    public Appliance(String typeAppliance, int consumptionAppliance, int originAppliance) {
        this.typeAppliance = typeAppliance;
        this.consumptionAppliance = consumptionAppliance;
        this.originAppliance = originAppliance;
    }

    public Appliance() {
    }

    public void setTypeAppliance(String typeAppliance) {
        this.typeAppliance = typeAppliance;
    }

    public String getTypeAppliance() {
        return typeAppliance;
    }    

    public int getConsumptionAppliance() {
        return consumptionAppliance;
    }

    public void setConsumptionAppliance(int consumptionAppliance) {
        this.consumptionAppliance = consumptionAppliance;
    }

    public int getOriginAppliance() {
        return originAppliance;
    }

    public void setOriginAppliance(int originAppliance) {
        this.originAppliance = originAppliance;
    }
    
    
}
