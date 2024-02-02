/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class FireType extends Pokemon{
    int potllamas;

    public FireType() {
    }
    
    
    
    
    

    public int getPotllamas() {
        return potllamas;
    }

    public void setPotllamas(int potllamas) {
        this.potllamas = potllamas;
    }

    @Override
    public String toString() {
        return "Type: fire-type | potencia de llamas: " + potllamas + '}';
    }
    
    
    
    
    
    
    
}
