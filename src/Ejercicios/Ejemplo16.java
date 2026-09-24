package Ejercicios;

import java.util.Scanner;

public class Ejemplo16 {
    static void main() {
        //VARIABLE
        int Num1;
        int Num2;
        String operacion;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        Num1 = sc.nextInt();

        System.out.println("Introduce un segundo número");
        Num2 = sc.nextInt();

        System.out.println("Introduce la operación a realizar (+, -, *, /):");
        operacion = sc.next();

        if (operacion.equals("+")) {
            System.out.println(Num1 + Num2);
        } else if (operacion.equals("-")) {
            System.out.println(Num1 - Num2);
        } else if (operacion.equals("*")) {
            System.out.println(Num1 * Num2);
        } else if (operacion.equals("/")) {
            System.out.println(Num1 / Num2);
        }else;
        System.out.println("No has introducido nada correctamente");

    }
}

