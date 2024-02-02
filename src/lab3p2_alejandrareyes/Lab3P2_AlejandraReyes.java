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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList <Pokemon> pokemones = new ArrayList();
        System.out.print("* * * * * M E N U * * * * *");
        System.out.print("\n 1. Crear Pokemon \n 2. Crear Pokebola \n 3. Listar Pokemon "
                + "\n 4. Eliminar Pokemon \n 5. Capturar Pokemon \n 6. Modificar Pokemon 7. Salir");
        System.out.println("Ingrese una opcion: ");
        int op = leer.nextInt();
        
        while (op!=7){
            switch (op){
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = leerS.nextLine();
                    System.out.println("Numero pokedex: ");
                    int numpokedex = leer.nextInt();
                    System.out.println("Naturaleza []");

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
            System.out.print("* * * * * M E N U * * * * *");
            System.out.print("\n 1. Crear Pokemon \n 2. Crear Pokebola \n 3. Listar Pokemon "
                    + "\n 4. Eliminar Pokemon \n 5. Capturar Pokemon \n 6. Modificar Pokemon 7. Salir");
            System.out.println("Ingrese una opcion: ");
            op = leer.nextInt();
        
        }
        
        
       
        
    }
    
}
