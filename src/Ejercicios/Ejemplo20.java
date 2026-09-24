package Ejercicios;

import java.util.Scanner;
public class Ejemplo20 {
    static void main() {
        //DATOS
        double precio;
        //SC
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuanto cuesta el producto:");
        precio = sc.nextDouble();

        if (precio < 6){
            System.out.println("Cuesta: " + precio);
        }else if (precio >= 6 && precio < 60) {
            precio = precio - precio * 0.05;
            System.out.println("Cuesta: " + precio);
        }else
            precio = precio - precio * 0.10;
            System.out.println("Cuesta: " + precio);
        }
    }

