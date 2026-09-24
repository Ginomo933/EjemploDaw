package Refuerzo;
import java.util.Scanner;
public class Re14 {
    static void main() {
        //VARIABLE
        int numero;
        int numero2;
        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números entero:");
        numero = sc.nextInt();
        numero2 = sc.nextInt();

        if (numero >= 1 && numero2 >= 1 ){
            System.out.println("Los dos numeros son positivos");
        } else if (numero >= 1 || numero2 >=1) {
            System.out.println("Hay un numero positivo");
        }else {
            System.out.println("Ningunio es positivo");
        }
    }
}
