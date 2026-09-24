package Refuerzo;
import java.util.Scanner;
public class Re16{
    static void main() {
        //VARIABLE
        int numero1;
        int numero2;
        int numero3;

        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres numeros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero mayor es el el primero: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es el el segundo: " + numero2);
        }else {
            System.out.println("El numero mayor es el el tercero: " + numero3);
        }
    }
}
