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

    public Fridge(int idAppliance, String nameAppliance, char consumptionAppliance, int priceAppliance, int originAppliance) {
        super(idAppliance, nameAppliance, consumptionAppliance, priceAppliance, originAppliance);
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
