/*
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes 
dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.   
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva       
 */
public class Desafio1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor1;
        int valor2;
        int prod;
        
        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();
        prod = valor1 * valor2;
        
        System.out.println("PROD = " + prod);
    }
}
