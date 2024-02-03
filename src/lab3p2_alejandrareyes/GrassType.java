/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class GrassType extends Pokemon{
    String habitat;
    int dominioplnt;

    public GrassType(String habitat, int dominioplnt, String nombre, String naturaleza, int numpokedex, boolean atrapado) {
        super(nombre, naturaleza, numpokedex, atrapado);
        this.habitat = habitat;
        this.dominioplnt = dominioplnt;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominioplnt() {
        return dominioplnt;
    }

    public void setDominioplnt(int dominioplnt) {
        this.dominioplnt = dominioplnt;
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
        return super.toString() + " | habitat: "  + habitat + " | dominio sobre las plantas: " +  dominioplnt + '}';
    }
    
    
    
    
    
    
}
