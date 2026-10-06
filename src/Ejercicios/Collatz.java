package Ejercicios;
import java.util.Scanner;
public class Collatz {
    static void main() {
    int numero;

    System.out.println("Introduce un número para Collatz: ");
    Scanner sc = new Scanner(System.in);


    do {
        numero = sc.nextInt();
        if (numero % 2 == 0){
            for (int i = 0; i < numero; i++){
                numero = numero/2;
                System.out.println(numero);
            }
        }if (numero % 2 != 0) {
            numero = ((numero * 3) + 1);
            for (int i = 0; i < numero; i++) {
                numero = numero/2;
                System.out.println(numero);
            }
        }
    }while (numero == 1);
        System.out.println("El numero ha llegado a 1");
    }
}

