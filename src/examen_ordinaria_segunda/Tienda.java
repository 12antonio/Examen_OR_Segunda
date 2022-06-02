/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ordinaria_segunda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Tienda {
    ArrayList<Articulo> listaArticulos = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static int menu() {

        System.out.println("1. Mostrar artículos");
        System.out.println("2. Venta a cliente");
        System.out.println("3. Compra a proveedor");
        System.out.println("4. Gestionar artículos");
        System.out.println("5. Salir");

        int opcion = leer.nextInt();

        return opcion;
        
    /**
     *
     * @return
     */

    /**
     *
     * @param a1
     * @return
     */
    }
    public String mostrar(){

        String s = null;
        for (int i = 0; i < this.listaArticulos.size(); i++) {

            Articulo a = (Articulo) this.listaArticulos.get(i);

            s = a.toString();

        } //fin for

        return s;
}

public static void main(String[] args) {
        
       System.out.println("Creamos artículos");
       
       Articulo a1 = new Articulo(2, "pepe", 50, 20, 21, 5); 
       Articulo a2 = new Articulo(3, "juan", 40, 30, 21, 6);
       Articulo a3 = new Articulo(4, "paco", 30, 10, 21, 7);
       Articulo a4 = new Articulo(5, "pedro", 20, 40, 21, 8);
       
       ArrayList<Articulo> listaArticulos = new ArrayList();
       
      listaArticulos.add(a1);
      listaArticulos.add(a2);
      listaArticulos.add(a3);
      listaArticulos.add(a4);
       
        boolean bucle =true;
    
        while(bucle==true){
            
            switch(menu()){
                case 1:
                    System.out.println("Artículos:");
                    a1.toString();
                    a2.toString();
                    a3.toString();
                    a4.toString();
                    
                    break;
                    
                case 2:
                    System.out.println("El perimetro del pentagono regular es ");
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    bucle=false;
                    break;
                    
                case 5:
                    bucle=false;
                    break;
                    
                default:
                    System.out.println("Error, introduce una opcion valida");
                    break;
            }  
        }
    }
}
