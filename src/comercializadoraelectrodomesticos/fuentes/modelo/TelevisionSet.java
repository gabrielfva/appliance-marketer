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
public class TelevisionSet extends Appliance{
    private int size;
    private int tdtTuner;

    public TelevisionSet(char consumptionAppliance, int originAppliance) {
        super(consumptionAppliance, originAppliance);
    }

    public TelevisionSet() {
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTdtTuner() {
        return tdtTuner;
    }

    public void setTdtTuner(int tdtTuner) {
        this.tdtTuner = tdtTuner;
    }
    
}
