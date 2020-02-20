/*
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, 
calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o 
valor desta variável.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva
 */
public class Desafio1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A;
        int B;
        int SOMA;
        
        A = entrada.nextInt();
        B = entrada.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
    }
}
