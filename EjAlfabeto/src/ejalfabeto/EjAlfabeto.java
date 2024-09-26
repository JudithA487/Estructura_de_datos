/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejalfabeto;

/**
 *
 * @author Judith Acosta Alvarez
 * 23550398
 * Estructura de datos
 */
public class EjAlfabeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        metodoA('Z');
        System.out.println();
    }

    static void metodoA(char c) {
        if (c > 'A') {
            metodoB(c);
        }
        System.out.print(c);
    }

    static void metodoB(char c) {
        metodoA(--c);
    }
    }
    

