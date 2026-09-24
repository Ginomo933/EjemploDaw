package Refuerzo;
import java.util.Scanner;
public class Re5 {
    static void main() {
        //VARIABLE
        int numero;
        int numero2;
        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un números entero:");
        numero = sc.nextInt();

        if (numero == 0 ){
            System.out.println("El producto de 0 por cualquier número es 0");
        }else {
            System.out.println("introduce un segundo numero entero");
            numero2 = sc.nextInt();
            System.out.println("El producto de ambos numeros es: " + numero * numero2);
        }
    }
}
