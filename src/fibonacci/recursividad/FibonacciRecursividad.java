/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.recursividad;

import java.util.Scanner;

/**
 *
 * @author jonathanfb
 */
public class FibonacciRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el numero de elementos que quieras mostrar en siguiente serie");
        int limite = sc.nextInt();
        sc.close();
        for (int i = 0; i < limite; i++) {

        System.out.print(funcionFibonacci(i)+ ", ");  
               
        // TODO code application logic here
    }
    
}
  private static int funcionFibonacci (int num){
        
        if (num == 0 || num == 1)
            return num;
        else 
            
             
     return funcionFibonacci (num-1) + funcionFibonacci (num-2);
        
  }
}