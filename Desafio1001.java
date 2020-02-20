/*
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A 
    e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo 
    apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo 
    especificado e não esqueça de imprimir o fim de linha após o resultado, caso 
    contrário, você receberá "Presentation Error".
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Gustavo Alves da Silva
 */
public class Desafio1001 {
    public static void main(String[] args) {
        int A;
        int B;
        
        Scanner entrada = new Scanner(System.in);
        
        A = entrada.nextInt();
        B = entrada.nextInt();
        
        int X = A + B;
        
        System.out.println("X = " + X);
    }
}
