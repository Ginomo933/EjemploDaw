package Ejercicios;
import java.util.Scanner;
public class Ejemplo31 {
    static void main() {
        int numero;

        System.out.println("Introduce numero para ver los divisores: ");
        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();

        for (int i = 1; i < 10; i++){
           if (numero % i == 0){
               System.out.println(i + " es divisible por " + numero);
           }
        }
    }
}
