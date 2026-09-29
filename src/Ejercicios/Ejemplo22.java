package Ejercicios;
import java.util.Scanner;
public class Ejemplo22 {
    static void main() {
        int numero;
        int positivos = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce hasta 10 numeros positivos: ");

        for (int i = 0; i < 10; i++){
            contador++;
            numero = sc.nextInt();
            if (numero >= 0){
                positivos = positivos + 1;
            }
            if (contador == 10){
                System.out.println("Has introducido esta cantidad de numeros positivos: " + positivos);
                break;
            }
        }
    }
}
