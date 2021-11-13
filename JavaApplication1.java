/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author nazar
 */
public class JavaApplication1 {

    public static void Datospersonales(String nombre, String apellido, String edad, String editor, String sistema){
        System.out.println("Tu nombre es:" + nombre);
        System.out.println("Tu apellido es:" + apellido);
        System.out.println("Tu edad es:" + edad);
        System.out.println("Tu editor de codigo es:" + editor);
        System.out.println("Tu sistema operativo es:" + sistema);
}
            
            
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido, edad, editor, sistema;
        
        System.out.println("introduce tu nombre");
        nombre=teclado.nextLine();
        System.out.println("introduce tu apellido");
        apellido=teclado.nextLine();
        System.out.println("introduce tu edad");
        edad=teclado.nextLine();
        System.out.println("introduce tu editor de codigo favorito");
        editor=teclado.nextLine();
        System.out.println("introduce tu sistema operativo");
        sistema=teclado.nextLine();
        
        Datospersonales(nombre, apellido, edad, editor, sistema);
    }
    
}
