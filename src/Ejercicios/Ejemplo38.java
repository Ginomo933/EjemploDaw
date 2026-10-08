package Ejercicios;
import java.util.Scanner;
import java.util.Random;


public class Ejemplo38 {
    static void main() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int secreto = aleatorio.nextInt(100);
        int introducido;
        System.out.println("Introduce un número para adivinar el secreto: ");

        do {
            Scanner sc = new Scanner(System.in);
            introducido = sc.nextInt();
            if (introducido == secreto) {
                System.out.println("Has ganado");
            } else if (introducido > secreto) {
                System.out.println("El número es menor que el introducido");
            } else if (introducido < secreto && introducido != -1) {
                System.out.println("El número es mayor que el introducido");
            }
        }while (introducido != -1);
        System.out.println("Te has rendido");
    }
}
