package Refuerzo;
import java.util.Scanner;
public class Re15{
    static void main() {
        //VARIABLE
        int t;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo en segundos: ");
        t = sc.nextInt();

        //PROGRAMA
        System.out.println("El tiempo en segunods es:" + t);
        System.out.println("El tiempo en minutos es:" + t/60);
        System.out.println("El tiempo en horas es:" + t/3600);
    }
}
