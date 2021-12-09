package br.com.letscode.java;

public class IsEven {

    public static void main(String[] args) {

        System.out.println(Integer.parseInt(args[0]) % 2 == 0 ? "Even" : "Not even");
    }
}
