package Ejercicios;
import java.util.Scanner;
public class Ejemplo25 {
    static void main() {
        int numero;

        System.out.println("Introduce numeros para factorial: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        long factorial = 0;

        for (int i = 1; i <=numero; i++){
            factorial = factorial * i;
        }
    }
}
