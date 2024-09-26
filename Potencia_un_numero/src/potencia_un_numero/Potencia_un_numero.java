/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencia_un_numero;

/**
 *
 * @author acost
 */
public class Potencia_un_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int base = 2;
        int exp = 4;
        System.out.println(base + " elevado a " + exp + " = "+potencia(base,exp));
    }

    private static int potencia(int base, int exp) {
        if (exp==0){
            return 1;
        } else if(exp==1){
            return base;
        }else {
            return base * potencia(base, exp-1);
      }
}

    }
    

