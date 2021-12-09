package br.com.letscode.java;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExampleID {

    public static void main(String[] args) {

        double b = (int) (Math.random() * 10);

        if (b < 3){
            System.out.println("Baixo " + b);
        }
        else if (b > 6){
            System.out.println("Alto " + b);
        }
        else{
            System.out.println("Mediano " + b);
        }
    }
}
