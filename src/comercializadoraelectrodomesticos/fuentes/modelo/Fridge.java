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
public class Fridge extends Appliance{
    private int capacity;

    public Fridge(String typeAppliance,char consumptionAppliance, int originAppliance) {
        super(typeAppliance, consumptionAppliance, originAppliance);
    }

    public Fridge() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
