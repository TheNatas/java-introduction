package br.com.letscode.java;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        int first, second;

        if (args.length > 2){
            System.err.println("Only two arguments need to be provided");
            return;
        }else if (args.length == 0){
            System.out.println("Please inform two numbers: ");
            first = new Scanner(System.in).nextInt();
            second = new Scanner(System.in).nextInt();
        }else if (args.length == 1){
            first = Integer.parseInt(args[0]);
            System.out.println("Please inform a number: ");
            second = new Scanner(System.in).nextInt();
        }else{
            first = Integer.parseInt(args[0]);
            second = Integer.parseInt(args[1]);
        }

        System.out.printf("%d", first + second);
    }
}
