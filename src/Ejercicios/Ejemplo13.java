package Ejercicios;

import java.util.Scanner;
public class Ejemplo13 {
    static void main() {
        //VARIABLES
        double Num1;
        double Num2;
        int Ascendente;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa 1 para ordenar de forma ascendente y 2 para hacerlo de forma desdcendente");
        Ascendente = sc.nextInt();

        System.out.println("Introduce un número a analizar");
        Num1 = sc.nextDouble();
        System.out.println("Introduce un segundo número a analizar");
        Num2 = sc.nextDouble();
        sc.close();

        //PROGRAMA
        if (Ascendente == 1){
        if (Num1 > Num2){
            System.out.println(Num2);
            System.out.println(Num1);
        }
        if (Num2 > Num1){
            System.out.println(Num1);
            System.out.println(Num2);
            }
        }
        if (Ascendente == 2){
            if (Num1 > Num2){
                System.out.println(Num1);
                System.out.println(Num2);
            }
            if (Num2 > Num1){
                System.out.println(Num2);
                System.out.println(Num1);
            }
        }
    }
}