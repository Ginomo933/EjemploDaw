package Refuerzo;
import java.util.Scanner;

public class Re21 {
    static void main() {
        //VARIABLE
        double micras;
        double micram;
        double altura;
        int vueltas = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el grosor del papel (micras) y la altura del edificio: ");
        micras = sc.nextDouble();
        altura = sc.nextDouble();


       do {
           vueltas++;
           micras = micras * 2;

           micram = micras * 1E-6;

       }while (micram < altura);
        System.out.println("Ha necesitado: " + vueltas + " vueltas");
    }
}
