package br.com.letscode.java;

import java.util.Scanner;

public class OperationsByScanner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Select the operation (+, -, *, /): ");
        String operation = in.next();

        System.out.println("Insert the 1st number: ");
        double n1 = in.nextDouble();
        System.out.println("Insert the 2nd number: ");
        double n2 = in.nextDouble();

        switch (operation){
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Operador inválido");
        }

        in.close();
    }
}
