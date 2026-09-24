package Refuerzo;
import java.util.Scanner;
public class Re9 {
    static void main() {
        //VARIABLE
        int numero;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es multiplo  de 2");
        }else{
            System.out.println("El numero no es multiplo de 2");
        }
    }
}