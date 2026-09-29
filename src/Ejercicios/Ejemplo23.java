package Ejercicios;
import java.util.Scanner;
public class Ejemplo23 {
    static void main() {
        int numero;
        int positivos = 0;

        System.out.println("Introduce numeros para acabar introduce 0");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        while (numero != 0 ){
            positivos = positivos + 1;
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Has introducido: " + positivos + " numeros positivos");
            }
        }
    }
}
