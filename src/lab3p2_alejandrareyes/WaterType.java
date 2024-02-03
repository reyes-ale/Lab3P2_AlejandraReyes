/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class WaterType extends Pokemon{
    boolean viviragua;
    int rapidez;

    public WaterType(boolean viviragua, int rapidez, String nombre, String naturaleza, int numpokedex, boolean atrapado) {
        super(nombre, naturaleza, numpokedex, atrapado);
        this.viviragua = viviragua;
        this.rapidez = rapidez;
    }

    public boolean isViviragua() {
        return viviragua;
    }

    public void setViviragua(boolean viviragua) {
        this.viviragua = viviragua;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
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
        return super.toString() + " | type: Water-Type | vive en agua? " + viviragua + " | rapidez: " + rapidez + '}';
    }
    
    
    
    
}
