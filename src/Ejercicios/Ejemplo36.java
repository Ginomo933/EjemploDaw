package Ejercicios;
import java.util.Scanner;
public class Ejemplo36 {
    static void main() {
        int numero;
        int residuo;
        String binario = "";

        System.out.println("Introduce numero para transformar a binario: ");
        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();
        if (numero <= 255) {
            while (numero > 0) {
                residuo = numero % 2;
                binario = residuo + binario;
                numero = numero / 2;
            }
            System.out.println(binario);
        } else {
            System.out.println("El número es mayor de 255");
        }
    }
}