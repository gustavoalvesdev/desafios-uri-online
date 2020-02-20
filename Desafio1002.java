/*
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
 Considerando para este problema que π = 3.14159:
 - Efetue o cálculo da área, elevando o valor de raio ao 
quadrado e multiplicando por π.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva
 */
public class Desafio1002 {
    public static void main(String[] args) {
        double raio;
        double n = 3.14159;
        double area;
        
        Scanner entrada = new Scanner(System.in);
        
        raio = entrada.nextDouble();
        
        area = n * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f\n", area);
    }
}
