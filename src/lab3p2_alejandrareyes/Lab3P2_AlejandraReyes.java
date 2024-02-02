/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_alejandrareyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Lab3P2_AlejandraReyes {
static boolean viviragua;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList <Pokemon> pokemones = new ArrayList();
        System.out.print("* * * * * M E N U * * * * *");
        System.out.print("\n 1. Crear Pokemon \n 2. Crear Pokebola \n 3. Listar Pokemon "
                + "\n 4. Eliminar Pokemon \n 5. Capturar Pokemon \n 6. Modificar Pokemon \n 7. Salir \n ");
        System.out.print("Ingrese una opcion: ");
        int op = leer.nextInt();
        
        while (op!=7){
            switch (op){
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = leerS.nextLine();
                    System.out.print("Numero pokedex: ");
                    int numpokedex = leer.nextInt();
                    System.out.print("Naturaleza [timido, energetico, misterioso]: ");
                    String naturaleza = leerS.nextLine();
                    
                    String [] natdispo = {"timido", "energetico", "misterioso"};
                    
                    while (!(naturaleza.equalsIgnoreCase(natdispo[0]) || naturaleza.equalsIgnoreCase(natdispo[1]) || naturaleza.equalsIgnoreCase(natdispo[2]))){
                        System.out.println("La nauraleza debe ser [timido, energetico o misterioso]");
                        System.out.print("Ingrese la naturaleza nuevamente: ");
                        naturaleza = leerS.nextLine();
                    }
                    
                    System.out.print("Tipo [firetype, watertype, grasstype]: ");
                    String tipo = leerS.nextLine();
                    
                    String [] tipodispo = {"firetype", "watertype", "grasstype"};
                    
                    while (!(tipo.equalsIgnoreCase(tipodispo[0]) || tipo.equalsIgnoreCase(tipodispo[1]) || tipo.equalsIgnoreCase(tipodispo[2]))){
                        System.out.print("El tipo debe ser [firetype, watertype o grasstype]");
                        System.out.print("Ingrese el tipo nuevamente: ");
                        tipo = leerS.nextLine();
                    }
                    
                    if (tipo.equalsIgnoreCase("firetype")){
                        System.out.print("Potencia de llamas: ");
                        int potenciall = leer.nextInt();
                        pokemones.add(new FireType(potenciall, nombre, naturaleza, numpokedex, false));
                        System.out.println("Pokemon Fire-Type agregado exitosamente.");
                    }
                    else if (tipo.equalsIgnoreCase("watertype")){
                        System.out.print("Puede vivir en agua? [s/n]: ");
                        String op2 = leerS.nextLine();
                        if (op2.equalsIgnoreCase("s")){
                            viviragua = true;
                        }
                        else{
                            viviragua = false;
                        }
                        System.out.print("Rapidez al nadar: ");
                        int rapidez = leer.nextInt();
                        pokemones.add(new WaterType(viviragua, rapidez, nombre, naturaleza, numpokedex, false));
                        System.out.println("Pokemon Water-Type agregado exitosamente.");
                    }
                    else if (tipo.equalsIgnoreCase("grasstype")){
                        System.out.print("Habitat: ");
                        String habitat = leerS.nextLine();
                        System.out.print("Dominio sobre plantas (0-100): ");
                        int dom = leer.nextInt();
                        
                        while (dom<0 || dom>100){
                            System.out.print("El dominio sobre plantas es de 1-100.");
                            System.out.print("Ingrese el dominio sobre plantas nuevamente: ");
                            dom = leer.nextInt();
                        }
                        
                        pokemones.add(new GrassType(habitat, dom, nombre, naturaleza, numpokedex, false));
                        System.out.println("Pokemon Grass-Type agregado exitosamente.");
                        
                    }
                    
                    
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4: 
                    break;

                case 5: 
                    break;

                case 6: 
                    break;



            }
            System.out.println();
            System.out.print("* * * * * M E N U * * * * *");
            System.out.print("\n 1. Crear Pokemon \n 2. Crear Pokebola \n 3. Listar Pokemon "
                    + "\n 4. Eliminar Pokemon \n 5. Capturar Pokemon \n 6. Modificar Pokemon \n 7. Salir\n");
            System.out.print("Ingrese una opcion: ");
            op = leer.nextInt();
        
        }
        
        
       
        
    }
    
}
