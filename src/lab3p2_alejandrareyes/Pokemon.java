/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Pokemon {
    String nombre,naturaleza;
    int numpokedex;
    boolean atrapado;
    Pokeball p;

    public Pokemon() {
    }

    public Pokemon(String nombre, String naturaleza, int numpokedex, boolean atrapado) {
        this.nombre = nombre;
        this.naturaleza = naturaleza;
        this.numpokedex = numpokedex;
        this.atrapado = atrapado;
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

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", naturaleza=" + naturaleza + ", numpokedex=" + numpokedex + ", atrapado=" + atrapado + '}';
    }
    
    
    
    
    
    
}
