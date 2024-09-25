/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cantidaddigitos;

/**
 *no. control 23550398
 * @author judith acosta alvarez
 * estructura de datos
 */

//crear un metodo que obtenga la cantidad de digitos 
//ejemplo num: 1111 -> 4
//ejemplo num: 45898 --> 5
public class CantidadDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 111;
        digito(n);
        System.out.println(n+ " tiene " + digito(n) + " digitos ");
                
    }
    private static int digito(int n){
        if(n<=0){
            return 0;
        }else{
            return 1+digito(n/10);
        }
    }
}
