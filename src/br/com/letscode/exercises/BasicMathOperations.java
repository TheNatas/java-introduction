package br.com.letscode.exercises;

import java.util.Scanner;

public class BasicMathOperations {
//    Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma, subtração, multiplicação e divisão. Considere sempre a ordem em que foram informados.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Inser the 1st number");
        int n1 = in.nextInt();
        System.out.println("Inser the 2nd number");
        int n2 = in.nextInt();

        System.out.printf("%d + %d = %d", n1, n2, n1+n2);
        System.out.println("");
        System.out.printf("%d - %d = %d", n1, n2, n1-n2);
        System.out.println("");
        System.out.printf("%d * %d = %d", n1, n2, n1*n2);
        System.out.println("");
        System.out.printf("%d / %d = %.2f", n1, n2, (float) n1/n2);

        in.close();
    }
}
