package Refuerzo;
import java.util.Scanner;
public class Re4 {
    static void main() {
        //VARIABLE
        int numero;
        int numero2;
        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un números entero:");
        numero = sc.nextInt();

        if (numero % 10 == 0){
            System.out.println("El numero es múltiplo de diez");
            System.out.println("Introduce otro numero");
            numero2 = sc.nextInt();
            if (numero2 % 10 == 0){
                System.out.println("El numero es múltiplo de diez");
            }else{
                System.out.println("El numero no es múltiplo de diez");
            }

        }else {
            System.out.println("El numero no es múltiplo del diez");
        }
    }
}
