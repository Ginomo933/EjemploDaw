package Ejercicios;
import java.util.Scanner;
public class Ejemplo26 {
    static void main() {
        int numero;

        System.out.println("Introduce numeros para tabla multiplicar: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero * i);
        }
    }
}
