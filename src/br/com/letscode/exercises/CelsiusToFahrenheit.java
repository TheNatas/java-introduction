package br.com.letscode.exercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
//  Escreva um programa que converte temperaturas de Celsius para Farenheit.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insert a temperature in celsius (°C): ");
        double celsius = in.nextDouble();
        System.out.printf("%.1f°C => %.1f°F", celsius, (celsius * ((float) 9/5)) + 32);

        in.close();
    }
}
