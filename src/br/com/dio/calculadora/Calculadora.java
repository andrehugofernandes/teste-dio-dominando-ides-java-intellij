package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = ler.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = ler.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("O valor da soma foi: " + somar);
        System.out.println("O valor da subtração foi: " + subtrair);
        System.out.println("O valor da multiplicação foi: " + multiplicar);
        System.out.println("O valor da divisão foi: " + dividir);


    }

    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static double dividir (double a, double b){
        return a / b;
    }


}
