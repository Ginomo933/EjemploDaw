package Refuerzo;
import java.util.Scanner;
public class Re6 {
    static void main() {
        //VARIABLE
        int numero;
        int numero2;
        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un números entero:");
        numero = sc.nextInt();

        if (numero == 0 ){
            System.out.println("ERROR: No se puede dividir entre 0");
        }else {
            System.out.println("introduce un segundo numero entero");
            numero2 = sc.nextInt();
            if (numero2 == 0){
                System.out.println("ERROR: No se puede dividir entre 0");
            }else {
                System.out.println("La division es: " + numero / numero2);
            }
        }
    }
}
