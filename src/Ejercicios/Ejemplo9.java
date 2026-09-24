package Ejercicios;

import java.util.Scanner;

public class Ejemplo9 {
    static void main() {
        //DATOS
        int edad;
        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        sc.close();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
