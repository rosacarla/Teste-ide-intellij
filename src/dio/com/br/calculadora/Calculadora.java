package dio.com.br.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o 1o. valor: ");
        a = scan.nextInt();
        System.out.println("Digite o 2o. valor: ");
        b = scan.nextInt();

        /* delara metodos */
        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("divi: " + dividir);
    }
    public static int somar(int a , int b) {
        return a + b;
    }
    public static int subtrair(int a , int b) {
        return a - b;
    }
    public static int multiplicar(int a , int b) {
        return a * b;
    }
    public static double dividir(double a , double b) {
        return a / b;
    }
}

