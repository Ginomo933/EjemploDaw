package Ejercicios;

import java.util.Scanner;

public class Ejemplo7 {
    static void main() {
        //DATOS
        double precio, preciorebajado;
        double descuento;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio real");
        precio = sc.nextDouble();
        System.out.println("Introduce el precio rebajado");
        preciorebajado = sc.nextDouble();
        sc.close();

        descuento = (precio - preciorebajado) /precio * 100;
        System.out.println("El descuento es de:" + descuento + "%" );

    }
}
