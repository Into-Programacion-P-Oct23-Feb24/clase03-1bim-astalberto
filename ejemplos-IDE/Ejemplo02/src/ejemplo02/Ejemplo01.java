/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

// import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre por favor");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido por favor");
        String apellido = entrada.nextLine();
        
        System.out.println("Nombre ingresado es:" + nombre);
        System.out.println("Apellido ingresado es:" + apellido);
        System.out.println(nombre+" "+apellido);
        
    }
    
}
