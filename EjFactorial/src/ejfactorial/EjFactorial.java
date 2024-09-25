/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Judith Acosta Alvarez
 * 23550398
 * Estructura de datos
 */
public class EjFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         int n;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.print("Introduzca número n: ");
            n = Integer.parseInt(entrada.readLine());
        } while (n < 0); // Permite ingresar solo números no negativos
        
        System.out.println("\n\t" + n + "!=" + factorial(n));
    }
    
    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    }
    

