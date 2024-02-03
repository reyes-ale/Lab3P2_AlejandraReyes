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
    
     public FireType(int potllamas, String nombre, String naturaleza, int numpokedex, boolean atrapado) {
        super(nombre, naturaleza, numpokedex, atrapado);
        this.potllamas = potllamas;
    }

    public int getPotllamas() {
        return potllamas;
    }

    public void setPotllamas(int potllamas) {
        this.potllamas = potllamas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public int getNumpokedex() {
        return numpokedex;
    }

    public void setNumpokedex(int numpokedex) {
        this.numpokedex = numpokedex;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokeball getP() {
        return p;
    }

    public void setP(Pokeball p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return super.toString()+" | type: Fire-Type | potencia de llamas: " + potllamas + '}';
    }
     
    

    

    
    
    
    
}
