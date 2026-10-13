package Ejercicios;
import java.util.Scanner;

public class Ejemplo39 {
    static void main() {
        int a;
        int b;
        int c;

        System.out.println("Introduce 3 lados de un triangulo: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a + b > c || a+c > b || b+c > a){
            System.out.println("El triangulo es imposible");
        } else if (c*c == a*a + b*b) {
            System.out.println("El triangulo es rectángulo");
        } else if (c*c > a*a + b*b) {
            System.out.println("El triangulo es obtusángulo");
        } else if (c*c < a*a + b*b) {
            System.out.println("El triangulo es acutángulo");
        }
    }
}
