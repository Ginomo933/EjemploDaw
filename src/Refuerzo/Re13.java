package Refuerzo;
import java.util.Scanner;
public class Re13 {
    static void main() {
        //VARIABLE
        int numero;
        int numero2;
        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números entero:");
        numero = sc.nextInt();
        numero2 = sc.nextInt();

        if (numero % 2 == 0 || numero2 % 2 == 0){
            System.out.println("Hay un numero par");
        }else{
            System.out.println("No hay numero par");
        }
    }
}
