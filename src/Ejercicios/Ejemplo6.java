package Ejercicios;

import java.util.Scanner;

public class Ejemplo6 {
    static void main() {
        //DATOS
        int radio;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio");
        radio = sc.nextInt();
        sc.close();

        //IMPRIMIR
        System.out.println("La perimetro es: " + (2 * Math.PI * radio));
        System.out.println("La area es: " + (Math.PI * radio * radio));

    }
}
