package Ejercicios;

import java.util.Scanner;

public class Ejemplo10 {
    static void main() {
        //VARIABLES
        double numeroAnalizar;
        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número a analizar para ver si es positivo o negativo");
        numeroAnalizar = sc.nextDouble();
        sc.close();
        //PROGRAMA
        if (numeroAnalizar >= 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
