/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impresionesdigitos;

/**
 *23550398
 * @author judith acosta alvarez
 * estructura de datos
 */
public class ImpresionesDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarar digitos
        int n = 5;
        incre(n);
        System.out.println();
        decre(n);
        System.out.println();
    }

    private static void incre(int n) {
        //iprimir de 1 a n
        //ejemplo n=5 = 12345
        if(n>0){
            incre(n-1);
            System.out.println(n);
        }
    }

    private static void decre(int n) {
       //imprimir del n al 1
       //ejemplo: n = 5 - 54321
       if(n>0){
           System.out.println(n);
           decre(n-1);
       }
    }
    
}
