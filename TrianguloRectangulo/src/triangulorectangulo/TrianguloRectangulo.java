/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulorectangulo;

/**
 *Nombre: Judith Acosta Alvarez
 * no. control: 23550398
 * Estructura de datos
 * 
 */
public class TrianguloRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se solicita la altura del triángulo
        int altura = 2; //se cambia al valor que se desee
        imprimirTriangulo(altura);
    }
    public static void imprimirTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            //se imprimen los asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //salta ala linea siguiente
            System.out.println();
        }
    }


    }
    

