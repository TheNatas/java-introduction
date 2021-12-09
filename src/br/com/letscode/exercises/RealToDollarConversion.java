package br.com.letscode.exercises;

import java.util.Scanner;

public class RealToDollarConversion {
//  Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais. A saída é a quantia em dólares. Use formatação de saída para exibir os valores de acordo com cada representação de moeda.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insert the dollar-to-real conversion value: ");
        double conversionValue = in.nextDouble();
        System.out.println("Insert an amount in reais");
        double reais = in.nextDouble();

        System.out.printf("R$%.2f => U$%.2f", reais, reais*conversionValue);
        
        in.close();
    }
}
