package Ejercicios;

import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        float area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado para calcular el area");
        area = sc.nextFloat();

        sc.close();
        System.out.println("El area es:" + area*area);
    }
}
