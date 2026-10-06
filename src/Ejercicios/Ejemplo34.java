package Ejercicios;
import java.util.Scanner;
public class Ejemplo34 {
    static void main() {
        int numero1;
        int numero2;
        int resultado = 0;

        System.out.println("Introduce numero para ver la sucesiva: ");
        Scanner sc = new Scanner(System.in);

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();


        for (int i = 0; i < numero2; i++){
            resultado += numero1;
            System.out.println(resultado);
        }

    }
}
