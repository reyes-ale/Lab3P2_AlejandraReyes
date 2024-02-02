/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Pokeball {
    String color;
    int serie;
    int eficiencia;

    public Pokeball(String color, int serie, int eficiencia) {
        this.color = color;
        this.serie = serie;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "color=" + color + ", serie=" + serie + ", eficiencia=" + eficiencia + '}';
    }
    
    
}
