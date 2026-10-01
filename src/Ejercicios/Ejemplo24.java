package Ejercicios;
import java.util.Scanner;
public class Ejemplo24 {
    static void main() {
        int numero;
        int contador = 0;
        double media;
        int sumado = 0;
        boolean diez = false;

        System.out.println("Introduce numeros para calcular media: ");
        Scanner sc = new Scanner(System.in);


        do{
            numero = sc.nextInt();
            if (numero != -1) {
                sumado = sumado + numero;
                contador++;
                if (numero == 10){
                    diez = true;
                }
            }
        }while (numero != -1);
        media = sumado / contador;
        System.out.println("Media es: " + media);
        if (diez){
            System.out.println("Hay un diez");
        }

    }
}
