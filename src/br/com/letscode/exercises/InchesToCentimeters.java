package br.com.letscode.exercises;

import java.util.Scanner;

public class InchesToCentimeters {
//  Escreva um programa que realiza conversão de medidas de polegadas em centímetros.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insert a value in inches: ");
        double inches = in.nextDouble();
        System.out.printf("%.2f inches = %.2f centimeters", inches, inches*2.54);

        in.close();
    }
}
