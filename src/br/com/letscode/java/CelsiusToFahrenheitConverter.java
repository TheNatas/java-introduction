package br.com.letscode.java;

public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
//        fahrenheit = (celsius * fator1) + fator2
//        fator1 = 5/9
//        fator2 = 32
        final double celsius = 15;
        final double fahrenheit = celsius * (9.0/5) + 32;
        System.out.println(fahrenheit);
    }
}
