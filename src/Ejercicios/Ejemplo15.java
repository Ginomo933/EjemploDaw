package Ejercicios;

import java.util.Scanner;

public class Ejemplo15 {
    static void main() {
        int num;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota para ver tu resultado");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
        }
    }
}
