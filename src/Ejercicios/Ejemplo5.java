package Ejercicios;

import java.util.Scanner;
public class Ejemplo5{
    public static void main(String[] args) {
        //Variables
        float NumX;
        float NumY;
        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        NumX = sc.nextFloat();
        System.out.println("Introduce el segundo número");
        NumY = sc.nextFloat();

        //Cerrar Scanner
        sc.close();

        //Imprimir
        System.out.println("La suma es: " + (NumX+NumY));
        System.out.println("La resta es: " + (NumX - NumY));
        System.out.println("La multiplicación es: " + NumX * NumY);
        System.out.println("La división es: " + NumX/NumY);
    }
}
