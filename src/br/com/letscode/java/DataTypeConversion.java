package br.com.letscode.java;

import java.time.LocalDateTime;

public class DataTypeConversion {

    public static void main(String[] args) {

        // data types conversion
        System.out.printf("%1$td, %1$tB of %1$ty. %1$tH:%1$tM:%1$tS%n", LocalDateTime.now());
    }
}
