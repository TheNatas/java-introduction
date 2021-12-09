package br.com.letscode.java;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        double total = 0;
        int quantity = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Insert a number: ");
        double currentNumber = in.nextDouble();

        while (currentNumber >= 0){
            if (currentNumber <= 10){
                total += currentNumber;
                quantity++;
            }else {
                System.out.println("Invalid number");
                return;
            }
            System.out.println("Insert a number: ");
            currentNumber = in.nextDouble();
        };

        if (quantity == 0){
            System.out.println("No number given");
        }else{
            System.out.printf("%f", total / quantity);
        }





    }
}
