package Ejercicios;

import java.util.Scanner;
public class Ejemplo14 {
    static void main() {
        //VARIABLE
        int nota;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota para ver tu resultado");
        nota = sc.nextInt();

        if (nota < 3){
            System.out.println("Tu resultado es: Muy Deficiente");
        } else if ( nota < 5) {
            System.out.println("Tu resultado es: Insuficiente");
        } else if ( nota < 6) {
            System.out.println("Tu resultado es: Suficiente");
        } else if ( nota < 7) {
            System.out.println("Tu resultado es: Bien");
        } else if ( nota < 9) {
            System.out.println("Tu resultado es: Notable");
        } else  {
            System.out.println("Tu resultado es: Sobresaliente");

        }
    }
}

