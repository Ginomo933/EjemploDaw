package Refuerzo;
import java.util.Scanner;
public class Re1 {
    static void main() {
        //VARIABLE
        int numero;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();

        System.out.println("El  numero es: " + numero);
        System.out.println("El doble del numero es: " + numero * 2);
        System.out.println("El triple del numero es: " + numero * 3);
    }
}
