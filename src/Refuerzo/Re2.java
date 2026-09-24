package Refuerzo;
import java.util.Scanner;
public class Re2 {
    static void main() {
        //VARIABLE
        int numero;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero no es par");
        }
    }
}
