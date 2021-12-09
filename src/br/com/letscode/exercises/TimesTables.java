package br.com.letscode.exercises;

import java.util.Scanner;

public class TimesTables {
//    Escreva um programa que informa a tabuada de um número informado (entre 1-10).

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insert a number between 1-10");
        double n = in.nextDouble();

        for(int i = 1; i <= 10; i++){
            System.out.println(n*i);
        }

        in.close();
    }
}
