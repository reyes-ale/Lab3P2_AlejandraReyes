/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_alejandrareyes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

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
        Random rand = new Random();
        ArrayList <Pokemon> pokemones = new ArrayList();
        ArrayList <Pokeball> pokebolas = new ArrayList();
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
                        System.out.println("El tipo debe ser [firetype, watertype o grasstype]");
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
                            System.out.println("El dominio sobre plantas es de 0-100.");
                            System.out.print("Ingrese el dominio sobre plantas nuevamente: ");
                            dom = leer.nextInt();
                        }
                        
                        pokemones.add(new GrassType(habitat, dom, nombre, naturaleza, numpokedex, false));
                        System.out.println("Pokemon Grass-Type agregado exitosamente.");
                        
                    }
                    
                    break;

                case 2:
                    System.out.print("Color: ");
                    String color = leerS.nextLine();
                    System.out.print("Serie: ");
                    int serie = leer.nextInt();
                    
                    for (int i = 0; i < pokebolas.size(); i++) {
                        while (serie==pokebolas.get(i).getSerie()){
                            System.out.println("Esta serie de pokebola ya existe.");
                            System.out.print("Ingrese otra serie: ");
                            serie = leer.nextInt();
                        }
                    }
                    
                    System.out.print("Eficiencia atrapando (1-3): ");
                    int eficiencia = leer.nextInt();
                    
                    while (eficiencia<1 || eficiencia >3){
                        System.out.println("La eficiencia debe ser del 1-3.");
                        System.out.print("Ingrese eficiencia nuevamente: ");
                        eficiencia = leer.nextInt();
                    }
                    
                    pokebolas.add(new Pokeball(color, serie, eficiencia));
                    System.out.println("Pokebola agregada exitosamente");
                    
                    break;

                case 3:
                    
                    System.out.println();
                    System.out.println("* * * * * POKEMONES * * * * *");
                    int cont =1;
                    int cont2 =1;
                    int cont3 =1;
                    for (Pokemon p : pokemones) {
                        if (p instanceof FireType){
                            if (cont == 1) {
                                            System.out.println();
                                            System.out.println("Fire-Type -->");
                                        }
                                        System.out.println(p);

                                        cont++;
                                        cont2 = 1;
                                        cont3 = 1;
                        }
                        
                        else if (p instanceof WaterType){
                            
                                        if (cont2 == 1) {
                                            System.out.println();
                                            System.out.println("Water-Type -->");
                                        }
                                        System.out.println(p);

                                        cont2++;
                                        cont = 1;
                                        cont3 = 1;
                                    
                                
                         
                        }
                        else if (p instanceof GrassType){
                           if (cont3 == 1) {
                                            System.out.println();
                                            System.out.println("Water-Type -->");
                                        }
                                        System.out.println(p);

                                        cont3++;
                                        cont = 1;
                                        cont2 = 1;

                        }
                    }
                    break;

                case 4:
                     cont=1;
                     cont2=1;
                     cont3=1;
                    System.out.print("Tipo de pokemon a eliminar [firetype, watertype o grasstype]: ");
                    String tipo2 = leerS.nextLine();
                    
                    String [] tipodispo2 = {"firetype", "watertype", "grasstype"};
                    
                    while (!(tipo2.equalsIgnoreCase(tipodispo2[0]) || tipo2.equalsIgnoreCase(tipodispo2[1]) || tipo2.equalsIgnoreCase(tipodispo2[2]))){
                        System.out.print("El tipo debe ser [firetype, watertype o grasstype]");
                        System.out.print("Ingrese el tipo nuevamente: ");
                        tipo2 = leerS.nextLine();
                    }
                    
                    if (tipo2.equalsIgnoreCase("firetype")){
                        for (Pokemon p : pokemones) {
                            if (p instanceof FireType) {
                                if (cont == 1) {
                                    System.out.println();
                                    System.out.println("Fire-Type -->");
                                    System.out.println(pokemones.indexOf(p) + ". " + p);
                                    cont=2;
                                    
                                }
                                else{
                                System.out.println(pokemones.indexOf(p) + ". " + p);
                                }
                            }
                        }
                        System.out.println();
                        System.out.println("Posicion de pokemon a eliminar: ");
                        int pos = leer.nextInt();
                        
                        int contx=1;
                        while (pos < 0 || pos > pokemones.size() - 1) {
                            System.out.println("Posicion fuera de rango");
                           for (Pokemon p : pokemones) {
                            if (p instanceof FireType) {
                                if (cont == 1) {
                                    System.out.println();
                                    System.out.println("Fire-Type -->");
                                    System.out.println(pokemones.indexOf(p) + ". " + p);
                                    cont=2;
                                }
                                else{
                                System.out.println(pokemones.indexOf(p) + ". " + p);
                                }

                            }
                        }
                            System.out.print("Ingrese nuevamente la posicion del pokemon a eliminar:");
                            pos = leer.nextInt();
                        }
                        pokemones.remove(pos);
                        
                        
                    }
                    else if (tipo2.equalsIgnoreCase("watertype")){
                       for (Pokemon p : pokemones) {
                            if (p instanceof WaterType) {
                                if (cont2 == 1) {
                                    System.out.println();
                                    System.out.println("Water-Type -->");
                                    System.out.println(pokemones.indexOf(p) + ". " + p);
                                    cont2=2;
                                }
                                else{
                                System.out.println(pokemones.indexOf(p) + ". " + p);
                                }

                            }
                        }
                        System.out.println();
                        System.out.println("Posicion de pokemon a eliminar: ");
                        int pos = leer.nextInt();
                        
                        int conty=1;
                        while (pos<0 ||  pos>pokemones.size()-1){
                            System.out.println("Posicion fuera de rango");
                            for (Pokemon p : pokemones) {
                            if (p instanceof WaterType) {
                                if (cont2 == 1) {
                                    System.out.println();
                                    System.out.println("Water-Type -->");
                                    System.out.println(pokemones.indexOf(p) + ". " + p);
                                    cont2=2;
                                }
                                else{
                                System.out.println(pokemones.indexOf(p) + ". " + p);
                                }

                            }
                        }
                        
                            
                            System.out.print("Ingrese nuevamente la posicion del pokemon a eliminar:");
                            pos = leer.nextInt();
                        }    
                        
                        
                        pokemones.remove(pos);
                       
                    }
                    else if (tipo2.equalsIgnoreCase("grasstype")){
                        for (Pokemon p : pokemones) {
                            if (p instanceof GrassType) {
                                if (cont3 == 1) {
                                    System.out.println();
                                    System.out.println("Grass-Type -->");
                                    System.out.println(pokemones.indexOf(p) + ". " + p);
                                    cont3=2;
                                }
                                else{
                                System.out.println(pokemones.indexOf(p) + ". " + p);
                                }

                            }
                        }
                        System.out.println();
                        System.out.println("Posicion de pokemon a eliminar: ");
                        int pos = leer.nextInt();
                        
                        int conti=1;
                        while (pos<0 ||  pos>pokemones.size()-1){
                            System.out.println("Posicion fuera de rango");
                             for (Pokemon p : pokemones) {
                            if (p instanceof GrassType) {
                                if (cont3 == 1) {
                                    System.out.println();
                                    System.out.println("Grass-Type -->");
                                    System.out.println(pokemones.indexOf(p) + ". " + p);
                                    cont3=2;
                                }
                                else{
                                System.out.println(pokemones.indexOf(p) + ". " + p);
                                }

                            }
                        }
                            
                            System.out.print("Ingrese nuevamente la posicion del pokemon a eliminar:");
                            pos = leer.nextInt();
                        }    
                        
                        pokemones.remove(pos);
                       
                    }
                    
                    break;

                case 5:
                    System.out.println();
                    System.out.println("* * * * * POKEBOLAS * * * * *");
                    for (int i = 0; i < pokebolas.size(); i++) {
                        System.out.println(i + ". " + pokebolas.get(i));
                    }
                    System.out.print("Ingrese posicion de pokebola a utilizar: ");
                    int pokeb = leer.nextInt();
                    
                    while (pokeb<0 ||  pokeb>pokebolas.size()-1){
                        for (int i = 0; i < pokebolas.size(); i++) {
                            System.out.println(i + ". " + pokebolas.get(i));
                        }
                            System.out.println("Posicion fuera de rango");
                            System.out.print("Ingrese nuevamente la posicion de la pokebola:");
                            pokeb = leer.nextInt();
                    }
                    
                    int limite = pokemones.size();
                    int random = rand.nextInt(limite)+0;
                    int pokequitar = -1;
                    
                    for (int i = 0; i < pokemones.size(); i++) {
                        if (i == random) {
                            for (Pokemon p : pokemones) {
                                if (p instanceof FireType || p instanceof WaterType || p instanceof GrassType) {
                                    if (pokemones.get(i).isAtrapado() == false) {
                                        System.out.println("EL POKEMON " + pokemones.get(i).getNombre() + " HA APARECIDO");
                                        System.out.print("Desea utilizar la pokebola para capturarlo? [s/n]: ");
                                        String usar = leerS.nextLine();

                                        if (usar.equalsIgnoreCase("s")) {
                                            double prob=0;
                                            switch (rand.nextInt(3)+1){
                                                case 3:
                                                    prob = 3/3;
                                                    break;
                                                    
                                                case 2:
                                                    prob = 2/3;
                                                    break;
                                                    
                                                case 1:
                                                    prob = 1/3;
                                                    break;
                                            }
                                            if (prob<=pokebolas.get(pokeb).getEficiencia()){
                                                System.out.println("Haz capturado al pokemon!");
                                                pokemones.get(i).setP(pokebolas.get(pokeb));
                                                pokemones.get(i).setAtrapado(true);
                                                pokequitar = pokeb;
                                            }
                                            else{
                                                System.out.println("No se pudo atrapar el pokemon");
                                                pokequitar = pokeb;
                                            }
                                            
                                        } else {
                                            break;
                                        }

                                    } else {
                                        random = rand.nextInt(limite) + 0;
                                    }
                                }
                            }
                           

                        }
                    }
                    if (pokequitar != -1) {
                        pokebolas.remove(pokequitar);
                    }
                    break;

                case 6: 
                    cont=1;
                    for (int i = 0; i < pokemones.size(); i++) {
                        if (pokemones.get(i).isAtrapado() == true) {
                            System.out.print("Tipo de pokemon a modificar [firetype, watertype o grasstype]: ");
                            tipo2 = leerS.nextLine();

                            String[] tipodispo3 = {"firetype", "watertype", "grasstype"};

                            while (!(tipo2.equalsIgnoreCase(tipodispo3[0]) || tipo2.equalsIgnoreCase(tipodispo3[1]) || tipo2.equalsIgnoreCase(tipodispo3[2]))) {
                                System.out.print("El tipo debe ser [firetype, watertype o grasstype]");
                                System.out.print("Ingrese el tipo nuevamente: ");
                                tipo2 = leerS.nextLine();
                            }
                            
                            if (tipo2.equalsIgnoreCase("firetype")) {
                                for (Pokemon p : pokemones) {
                                    if (p instanceof FireType) {
                                        if (cont == 1) {
                                            System.out.println();
                                            System.out.println("Fire-Type -->");
                                        }
                                        System.out.println(pokemones.indexOf(p) + ". " + p);

                                        cont++;
                                        cont2 = 1;
                                        cont3 = 1;
                                    }
                                }
                                System.out.println();
                                System.out.println("Posicion de pokemon a modificar: ");
                                int pos = leer.nextInt();

                                int contx = 1;
                                while (pos < 0 || pos > pokemones.size() - 1) {
                                    System.out.println("Posicion fuera de rango");
                                    for (Pokemon p : pokemones) {
                                        if (p instanceof FireType) {
                                            if (contx == 1) {
                                                System.out.println();
                                                System.out.println("Fire-Type -->");
                                            }
                                            System.out.println(pokemones.indexOf(p) + ". " + p);

                                            contx++;
                                            cont2 = 1;
                                            cont3 = 1;
                                        }
                                    }
                                    System.out.print("Ingrese nuevamente la posicion del pokemon a modificar:");
                                    pos = leer.nextInt();
                                }
                                
                                if (pokemones.get(pos).isAtrapado()==true){
                                System.out.println();
                                System.out.print("* * * * * SUB MENU MODIFICAR * * * * * ");
                                System.out.print("\n 1. Nombre \n 2. Numero pokedex \n 3. Potencia de llamas \n 4. Salir del sub menu");
                                System.out.print("Ingrese una opcion");
                                op = leer.nextInt();
                                
                                while (op!=4){
                                    switch (op) {
                                    case 1:
                                        System.out.print("Nombre: ");
                                        nombre = leerS.nextLine();
                                        pokemones.get(pos).setNombre(nombre);
                                        break;
                                        
                                    case 2:
                                        System.out.print("Numero pokedex: ");
                                        numpokedex = leer.nextInt();
                                        pokemones.get(pos).setNumpokedex(numpokedex);
                                        break;
                                        
                                    case 3:
                                        System.out.print("Potencia de llamas: ");
                                        int potencia = leer.nextInt();
                                        ((FireType)pokemones.get(pos)).setPotllamas(potencia);
                                        break;
                                        
                                    }
                                        
                                    System.out.print("* * * * * SUB MENU MODIFICAR * * * * * ");
                                System.out.print("\n 1. Nombre \n 2. Numero pokedex \n 3. Puede vivir fuera del agua? \n 4. Salir del sub menu");
                                System.out.print("Ingrese una opcion: ");
                                op = leer.nextInt();
                                }
                                }
                                else{
                                    System.out.println("El pokemon no se puede modificar. No esta atrapado.");
                                }
                                
                            }//if fire
                            else if (tipo2.equalsIgnoreCase("watertype")){
                                for (Pokemon p : pokemones) {
                                    if (p instanceof WaterType) {
                                        if (cont == 1) {
                                            System.out.println();
                                            System.out.println("Water-Type -->");
                                        }
                                        System.out.println(pokemones.indexOf(p) + ". " + p);

                                        cont++;
                                        cont2 = 1;
                                        cont3 = 1;
                                    }
                                }
                                System.out.println();
                                System.out.println("Posicion de pokemon a modificar: ");
                                int pos = leer.nextInt();

                                int contx = 1;
                                while (pos < 0 || pos > pokemones.size() - 1) {
                                    System.out.println("Posicion fuera de rango");
                                    for (Pokemon p : pokemones) {
                                        if (p instanceof WaterType) {
                                            if (contx == 1) {
                                                System.out.println();
                                                System.out.println("Water-Type -->");
                                            }
                                            System.out.println(pokemones.indexOf(p) + ". " + p);

                                            contx++;
                                            cont2 = 1;
                                            cont3 = 1;
                                        }
                                    }
                                    System.out.print("Ingrese nuevamente la posicion del pokemon a modificar:");
                                    pos = leer.nextInt();
                                }
                                System.out.println();
                                System.out.print("* * * * * SUB MENU MODIFICAR * * * * * ");
                                System.out.print("\n 1. Nombre \n 2. Numero pokedex \n 3. Puede vivir fuera del agua? \n 4. Salir del sub menu");
                                System.out.print("Ingrese una opcion");
                                op = leer.nextInt();
                                
                                while (op!=4){
                                    switch (op) {
                                    case 1:
                                        System.out.print("Nombre: ");
                                        nombre = leerS.nextLine();
                                        pokemones.get(pos).setNombre(nombre);
                                        break;
                                        
                                    case 2:
                                        System.out.print("Numero pokedex: ");
                                        numpokedex = leer.nextInt();
                                        pokemones.get(pos).setNumpokedex(numpokedex);
                                        break;
                                        
                                    case 3:
                                        System.out.print("Puede vivir en agua? [s/n]: ");
                                        String op2 = leerS.nextLine();
                                        if (op2.equalsIgnoreCase("s")) {
                                            viviragua = true;
                                        } else {
                                            viviragua = false;
                                        }
                                        ((WaterType)pokemones.get(pos)).setViviragua(viviragua);
                                        break;
                                        
                                    }
                                        
                                    System.out.print("* * * * * SUB MENU MODIFICAR * * * * * ");
                                System.out.print("\n 1. Nombre \n 2. Numero pokedex \n 3. Potencia de llamas \n 4. Salir del sub menu");
                                System.out.print("Ingrese una opcion: ");
                                op = leer.nextInt();
                                }
                            }
                            else if (tipo2.equalsIgnoreCase("grasstype")){
                                for (Pokemon p : pokemones) {
                                    if (p instanceof GrassType) {
                                        if (cont == 1) {
                                            System.out.println();
                                            System.out.println("Grass-Type -->");
                                        }
                                        System.out.println(pokemones.indexOf(p) + ". " + p);

                                        cont++;
                                        cont2 = 1;
                                        cont3 = 1;
                                    }
                                }
                                System.out.println();
                                System.out.println("Posicion de pokemon a modificar: ");
                                int pos = leer.nextInt();

                                int contx = 1;
                                while (pos < 0 || pos > pokemones.size() - 1) {
                                    System.out.println("Posicion fuera de rango");
                                    for (Pokemon p : pokemones) {
                                        if (p instanceof GrassType) {
                                            if (contx == 1) {
                                                System.out.println();
                                                System.out.println("Grass-Type -->");
                                            }
                                            System.out.println(pokemones.indexOf(p) + ". " + p);

                                            contx++;
                                            cont2 = 1;
                                            cont3 = 1;
                                        }
                                    }
                                    System.out.print("Ingrese nuevamente la posicion del pokemon a modificar:");
                                    pos = leer.nextInt();
                                }
                                System.out.println();
                                System.out.print("* * * * * SUB MENU MODIFICAR * * * * * ");
                                System.out.print("\n 1. Nombre \n 2. Numero pokedex \n 3. Habitat \n 4. Salir del sub menu");
                                System.out.print("Ingrese una opcion");
                                op = leer.nextInt();
                                
                                while (op!=4){
                                    switch (op) {
                                    case 1:
                                        System.out.print("Nombre: ");
                                        nombre = leerS.nextLine();
                                        pokemones.get(pos).setNombre(nombre);
                                        break;
                                        
                                    case 2:
                                        System.out.print("Numero pokedex: ");
                                        numpokedex = leer.nextInt();
                                        pokemones.get(pos).setNumpokedex(numpokedex);
                                        break;
                                        
                                    case 3:
                                         System.out.print("Habitat: ");
                                        String habitat = leerS.nextLine();
                                        ((GrassType)pokemones.get(pos)).setHabitat(habitat);
                                        break;
                                        
                                    }
                                        
                                    System.out.print("* * * * * SUB MENU MODIFICAR * * * * * ");
                                System.out.print("\n 1. Nombre \n 2. Numero pokedex \n 3. Habitat \n 4. Salir del sub menu");
                                System.out.print("Ingrese una opcion: ");
                                op = leer.nextInt();
                                }
                            }
                                    
                            

                            }
                        else {
                            System.out.println("No ha atrapado ningun pokemon");
                        }
                        }
                    

            

                    
                    
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
