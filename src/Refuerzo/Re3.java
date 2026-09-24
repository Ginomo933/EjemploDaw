package Refuerzo;
import java.util.Scanner;
public class Re3 {
    static void main() {
        //VARIABLE
        int numero;
        int numero2;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números entero:");
        numero = sc.nextInt();
        numero2 = sc.nextInt();

        if (numero % numero2 == 0){
            System.out.println("El numero uno es múltiplo del segundo");
        }else {
            System.out.println("El numero uno no es múltiplo del segundo");
        }
    }
}
