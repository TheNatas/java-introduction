package br.com.letscode.java;

import java.util.Scanner;

public class SchoolAverage {
//    Receber uma quantidade de turmas e a quantidade de alunos por turma e armazenar em uma matriz. Com esses dados você deve
//    imprimir a média de cada uma das turmas e em seguida a média de todas as turmas.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double totalClass = 0;
        double totalSchool = 0;

        System.out.println("Insert the number of classes: ");
        int quantityClasses = in.nextInt();
        System.out.println("Insert the number of students of each class: ");
        int quantityStudentsInEachClass = in.nextInt();

        double[][] averages = new double[quantityClasses][quantityStudentsInEachClass];

        for(int i = 0; i < quantityClasses; i++){
            for(int j = 0; j < quantityStudentsInEachClass; j++){
                System.out.printf("Insert the note of student number %d from class number %d: ", j+1, i+1);
                averages[i][j] = in.nextDouble();
                totalClass+=averages[i][j];
                totalSchool+=averages[i][j];
            }
            System.out.printf("Class number %d has an average of %.2f", i+1, totalClass/quantityStudentsInEachClass);
            System.out.println("");
            totalClass = 0;
        }
        System.out.printf("School has an average of %.2f", totalSchool/(quantityClasses*quantityStudentsInEachClass));

        in.close();
    }
}
