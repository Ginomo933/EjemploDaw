package Refuerzo;
import java.util.Scanner;
public class Re17{
    static void main() {
        //VARIABLE
        int numero1;
        int numero2;


        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        //PROGRAMAA
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else if (numero1 == 0 && numero2 == 0) {
            System.out.println("Los numeros son iguales a 0");
        } else if (numero1 > numero2) {
            System.out.println("El numero uno es mayor que el numero dos");
        }else {
            System.out.println("El numero dos es mayor que el numero uno");
        }
    }
}
