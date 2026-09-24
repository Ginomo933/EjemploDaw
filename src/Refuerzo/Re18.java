package Refuerzo;
import java.lang.reflect.Parameter;
import java.util.Scanner;
public class Re18{
    static void main() {
        //VARIABLE
        int numero1;
        int par;


        //SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero1 = sc.nextInt();

        //PROGRAMA
        if (numero1 % 2 == 0) {
            par = numero1 + 2;
        }else{
            par = numero1 + 1;
        }

        for (int i = 0; i < 5; i++){
            System.out.println(par + (i*2));

        }
    }
}
