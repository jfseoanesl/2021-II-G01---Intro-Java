/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesOperadores;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class EjemploVariablesOperadores {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Lea X=");
        int x = entrada.nextInt();
        System.out.print("Lea y=");
        int y = entrada.nextInt();;
        int res;
        
        System.out.printf("Suma = %d%n", sumar(x,y));
        System.out.printf("Resta = %d%n", restar(x,y));
        System.out.printf("Multiplicacion = %d%n", multiplicar(x,y));
        System.out.printf("Division entera = %d%n", dividirEntero(x,y));
        System.out.printf("Division decimal= %.2f%n", dividirDecimal(x,y));
        System.out.printf("Numero Mayor= %d%n", numeroMayor(x,y));
        System.out.printf("Potencia= %d%n", potencia(x,y));
        res = x + y - 5 * 6 / 4 % 2 + 9;
        System.out.println("res = " + res);
        
    }
    
    public static int sumar(int a, int b){
        return a + b;
    }
    
    public static int restar(int a, int b){
        return a-b;
    }
    
    public static int multiplicar(int a, int b){
        return a * b;
    }
    
    public static int dividirEntero(int a, int b){
        return a/b;
    }
    
    public static double dividirDecimal(int a, int b){
        return (double)a/b;
    }
    
    public static int numeroMayor(int a, int b){
        if(a>=b)
            return a;
        
        return b;
    }
    
    public static long potencia(int a, int b){
        
        long res=1;
        for(int i =0 ; i<b; i++){
            res=res*a;
        }
        return res;
    }
    
    
}
