package br.com.letscode.java;

import java.util.Random;
import java.util.Scanner;

public class ClassAverage {
//    Calcular a média de notas de uma turma com n alunos. O valor n deve ser solicitado via System.in. Deve-se criar um vetor
//    para armazenar a nota de todos os alunos. Ao final o programa deve imprimir a nota média e também a quantidade de
//    alunos. Obs.: Utilize um for para obter as notas de cada aluno e um foreach para fazer o cálculo da média

    public static void main(String[] args) {

        double total = 0;
        int quantityStudents;

        Scanner in = new Scanner(System.in);

        System.out.println("Insert the number of students: ");
        quantityStudents = in.nextInt();

        double[] notes = new double[quantityStudents];

        for (int i = 0; i < notes.length; i++){
            notes[i] = Math.random() * 10;
        }

        for (double note : notes){
            total+=note;
        }

        System.out.printf("The class' average of %d students is %.2f", quantityStudents, total/quantityStudents);

        in.close();
    }
}
