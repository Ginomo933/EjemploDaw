package Ejercicios;
import java.util.Scanner;
public class Ejemplo35 {
    static void main() {
        int dividiendo;
        int divisor;

        System.out.println("Introduce numero para ver la divison sucesiva: ");
        Scanner sc = new Scanner(System.in);

        dividiendo = sc.nextInt();
        divisor = sc.nextInt();


        if (divisor == 0){
            System.out.println("No se puede dividir entre 0");
        }else{
            int i = 0;
            int resto = dividiendo;

            for (; resto >= divisor; i++){
                resto -= divisor;
                System.out.println(resto);
            }

        }

    }
}
